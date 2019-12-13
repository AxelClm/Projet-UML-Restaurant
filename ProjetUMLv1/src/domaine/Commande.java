package domaine;
import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.ResultSet;
public class Commande {
	
	private int numCom;
	private int numServ;
	private LinkedList<LigneProduit> listeLp;
	//table
	private Catalogue c;
	
	
	public Commande(ResultSet rS) throws SQLException {
		while(rS.next()) {
			//faire pour chaque row rs.getInt() pr l'entier ect.
			//Seulement utilisé par BddCom.getCommande()
		}
	}
	public Commande(int numCom,int numServ){
			//Pour quand on créé une commande sans qu'elle soit dans la BDD
	}
	
	public void ajouterProduit(int numProduit,int qte, String opt) {
		
		int i = 0;
		for (LigneProduit ligneProduit : listeLp) {
			if(ligneProduit!=null)
				i=i+1;
		}
		LigneProduit p = new LigneProduit(numProduit,qte,opt,i);
		listeLp.add(p);
	}
	
	public void supprimer(int numLp) {
		
		int index = -1;
		int i = 0;
		for (LigneProduit ligneProduit : listeLp) {
			if(ligneProduit.numLp==numLp) 
				index = i;
			i=i+1;
		}
		if(index!=-1) {
			listeLp.remove(index);
			i=0;
			for (LigneProduit ligneProduit : listeLp) {
				ligneProduit.numLp=i;
				i=i+1;
			}
		}
	}
	
	public void modifier(int numLp, int qte, String opt) {
		
		LigneProduit m = listeLp.get(numLp);
		m.qte = qte;
		m.opt = opt;
		listeLp.set(numLp,m);
		
	}
	
	public void commitCom() {
		
		for (LigneProduit ligneProduit : listeLp) {
			//addRow(ligneProduit.numProduit,numCom,ligneProduit.opt, ligneProduit.qte);
		}
		
	}
	
}
