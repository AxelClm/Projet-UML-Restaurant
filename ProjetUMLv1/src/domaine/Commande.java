package domaine;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Commande {
	
	public Commande(ResultSet rS) throws SQLException {
		while(rS.next()) {
			//faire pour chaque row rs.getInt() pr l'entier ect.
			//Seulement utilisé par BddCom.getCommande()
		}
	}
	public Commande(){
			//Pour quand on créé une commande sans qu'elle soit dans la BDD
	}
}
