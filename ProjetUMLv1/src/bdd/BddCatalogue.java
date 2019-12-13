package bdd;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import domaine.Produit;
import domaine.Categorie;
import java.util.*;
public class BddCatalogue {
	public static LinkedList<Produit> getProduits() {
		Connection lien = LienBdd.connect();
		ResultSet rs = null;
		String sql = "Select * from Produit where enVente = 1;";
		LinkedList<Produit> ListeP = new LinkedList<Produit>();
		try {
			rs = lien.createStatement().executeQuery(sql);
			System.out.println(rs.getFetchSize());
			while(rs.next()) {
				ListeP.add(new Produit(rs.getInt("idProduit"),rs.getString("NomProduit"),rs.getDouble("prixProduit"),
						rs.getInt("cat�gorieProduit"),rs.getString("description")));
			}
		}
		catch(SQLException e){System.out.println(e);}
		return ListeP;
	}
	public static LinkedList<Categorie> getCategories() {
		Connection lien = LienBdd.connect();
		ResultSet rs = null;
		LinkedList<Categorie> ListeC = new LinkedList<Categorie>();
		String sql = "Select * from Cat�gorie;";
		try {
			rs = lien.createStatement().executeQuery(sql);
			while(rs.next()) {
				ListeC.add(new Categorie(rs.getInt("idCat�gorie"),rs.getString("nomCat�gorie")));
			}
		}
		catch(SQLException e){System.out.println(e);}
		return ListeC;
	}
}
