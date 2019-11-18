package bdd;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class Commande {
	public static ListeProduit selectByNumCommande(int numCommande) {
		Connection lien = LienBdd.connect();
		ListeProduit liste = new ListeProduit();
		String sql = "Select Produit.idProduit,Produit.nomProduit,Produit.prixProduit,Produit.catégorieProduit,Produit.enVente\r\n" + 
				"FROM Produit,Commande\r\n" + 
				"Where Commande.numCommande = ? AND Produit.idProduit = Commande.idProduit;";
		
		try {
			PreparedStatement pStmt = lien.prepareStatement(sql);
			pStmt.setInt(1,numCommande);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				liste.addProduit(new Produit(rs.getInt("idProduit"),rs.getString("nomProduit"),rs.getDouble("prixProduit")
								 ,rs.getInt("catégorieProduit"),rs.getBoolean("enVente")));
			}
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		LienBdd.disconnect(lien);
		if(liste.getSize() == 0) {
			return null;
		}
		else {
			return liste;
		}
	}
	public static int addNewCommande(ListeProduit listeP) {
		Connection lien = LienBdd.connect();
		String sql = "SELECT MAX(Commande.numCommande)AS MAX FROM COMMANDE;";
		String sql2="INSERT INTO COMMANDE(idCommande,numCommande,idProduit) VALUES";
		String sql3="SELECT last_insert_rowid();";
		int max = -1;
		try {
			lien.setAutoCommit(false);
			//On récupére le num de la derniére commande rentrée;
			ResultSet rs = lien.createStatement().executeQuery(sql);
			max=0;
			while (rs.next()) {
				if(max<rs.getInt("max")) {
					max = rs.getInt("max");
				}
			}
			max++;
			System.out.println("Max = "+max);
			Iterator<Produit> it = listeP.getListe().iterator();
			while(it.hasNext()) {
				Produit p = it.next();
				String sql4 = sql2+" (NULL,"+(max)+","+(p.getIdProduit())+")";
				lien.prepareStatement(sql4).executeUpdate();
				ResultSet rs2 = lien.createStatement().executeQuery(sql3);
				p.setIdCommande(rs2.getInt(1));
				System.out.println(p.getNomProduit()+" inseré en "+p.getIdCommande());
			}
			listeP.setNumCommande(max);
			lien.commit();
		}
		catch (SQLException e) {
			System.out.println(e);
			try {
				max = -1;
				lien.rollback();
			}
			catch(SQLException e1){
				System.out.println(e1);
			}
				
			}
		LienBdd.disconnect(lien);
		return max;
		}
}
