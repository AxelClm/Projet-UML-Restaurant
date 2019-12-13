package domaine;
import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.ResultSet;
import bdd.BddCom;

public class Commande {
	
	private int numCom;
	private LinkedList<LigneProduit> listeLp;
	private Catalogue c;
	private boolean reccup;
	//table
	//date
	//private int numServ;
	
	
	
	public Commande(ResultSet rS) throws SQLException {
		while(rS.next()) {
			//faire pour chaque row rs.getInt() pr l'entier ect.
			//Seulement utilisé par BddCom.getCommande()
		}
		reccup = true;
	}
	public Commande(){
			//Pour quand on créé une commande sans qu'elle soit dans la BDD
		listeLp = new LinkedList<LigneProduit>();
		reccup = false;
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
		
		if(reccup==true) {
			
			BddCom.deleteOldCom(numCom);
		}
		
		int i =0;
		for (LigneProduit ligneProduit : listeLp) {
			i=i+1;
		}
		int[] idProduit = new int[i];
		int[] qt = new int[i];
		String[] op = new String[i];
		
		i=0;
		for (LigneProduit ligneProduit : listeLp) {
			
			idProduit[i]=ligneProduit.numProduit;
			qt[i]=ligneProduit.qte;
			op[i]=ligneProduit.opt;
			i=i+1;
		}
		
		if(reccup==false)
			i=BddCom.insertCommande(idProduit,op,qt);
		else BddCom.insertCommande2(idProduit,op,qt,numCom);
	}
	
}
