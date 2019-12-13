package bdd;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import domaine.Commande;
public class BddCom {
		public static Commande getCommande(int numCommande) {
			Connection lien = LienBdd.connect();
			String sql = "Select Produit.idProduit,LigneProduit.qte,>LigneProduit.Option\r\n" + 
					"FROM Produit,LigneProduit\r\n" + 
					"Where LigneProduit.numCommande = ? AND Produit.idProduit = LigneProduit.idProduit;";
			ResultSet rs = null;
			Commande c = null;
			System.out.println(sql);
			try {
				PreparedStatement pStmt = lien.prepareStatement(sql);
				pStmt.setInt(1,numCommande);
				rs = pStmt.executeQuery();
				c = new Commande(rs,numCommande);
			}
			catch (SQLException e) {
				System.out.println(e);
			}
			LienBdd.disconnect(lien);
			return c;
			
		}
		public static int insertCommande(int[] idProduit, String[] option, int[] qte) {
			Connection lien = LienBdd.connect();
			String sql = "INSERT INTO COMMANDE(numCommande) VALUES (NULL);";
			String sql3="SELECT last_insert_rowid();";
			String sql2="INSERT INTO LIGNEPRODUIT"
					+ "(idLigneProduit,idProduit,numCommande,"
					+ "Option,qte) VALUES ";
			int numCommande = -1;
			try {
				lien.setAutoCommit(false);
				lien.createStatement().executeUpdate(sql);
				ResultSet rs = lien.createStatement().executeQuery(sql3);
				while(rs.next()) {
					numCommande = rs.getInt(1);
				}
				for(int i=0;i<idProduit.length;i++) {
					if(i==(idProduit.length -1)) {
						sql2 = sql2+"(NULL,"+idProduit[i]+","+numCommande+",\""+option[i]+"\","+qte[i]+")";
					}
					else {
						sql2 = sql2+"(NULL,"+idProduit[i]+","+numCommande+",\""+option[i]+"\","+qte[i]+"),";
					}
				}
				sql2 = sql2+";";
				System.out.println("Max = "+numCommande);
				System.out.println(sql2);
				lien.prepareStatement(sql2).executeUpdate();
				lien.commit();
			}
			catch (SQLException e) {
				System.out.println(e);
				try {
					numCommande = -1;//Erreur
					lien.rollback(); 
				}
				catch(SQLException e1){
					System.out.println(e1);
				}
					
				}
			LienBdd.disconnect(lien);
			return numCommande;
			}
		
		public static void insertCommande2(int[] idProduit, String[] option, int[] qte, int numCom) {
			Connection lien = LienBdd.connect();
			String sql2="INSERT INTO LIGNEPRODUIT"
					+ "(idLigneProduit,idProduit,numCommande,"
					+ "Option,qte) VALUES ";
			try {
				lien.setAutoCommit(false);

				for(int i=0;i<idProduit.length;i++) {
					if(i==(idProduit.length -1)) {
						sql2 = sql2+"(NULL,"+idProduit[i]+","+numCom+",\""+option[i]+"\","+qte[i]+")";
					}
					else {
						sql2 = sql2+"(NULL,"+idProduit[i]+","+numCom+",\""+option[i]+"\","+qte[i]+"),";
					}
				}
				sql2 = sql2+";";
				System.out.println(sql2);
				lien.prepareStatement(sql2).executeUpdate();
				lien.commit();
			}
			catch (SQLException e) {
				System.out.println(e);
				try {
					lien.rollback(); 
				}
				catch(SQLException e1){
					System.out.println(e1);
				}
					
				}
			LienBdd.disconnect(lien);
			}
		
		public static void deleteOldCom(int numCom) {
			Connection lien = LienBdd.connect();
			String sql = "Delete FROM LigneProduit where numCommande = ?";
			try {
				lien.setAutoCommit(false);
				PreparedStatement pStmt = lien.prepareStatement(sql);
				pStmt.setInt(1,numCom);
				pStmt.executeUpdate();
				lien.commit();
			}
			catch (SQLException e) {
				try {
					lien.rollback();
				}
				catch (SQLException e2){}
			}
		}
}

