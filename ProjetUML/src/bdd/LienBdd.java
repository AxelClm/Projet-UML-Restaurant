package bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class LienBdd {
	
	public static Connection connect() {
		Connection lien = null;
		try {
			String url = "jdbc:sqlite:src/bdd/BaseDeDonnée.db";
			lien = DriverManager.getConnection(url);
		}
		catch (SQLException e) {
            System.out.println(e.getMessage());
		}
		return lien;
	}
	public static void disconnect(Connection lien) {
		try {
			if(lien != null) {
				lien.close();
			}
		}
		catch (SQLException ex){
            System.out.println(ex.getMessage());
		}
	}
}
