package bdd;
import java.util.LinkedList;
public class ListeProduit {
	private int numCommande;
	private LinkedList<Produit> liste;
	ListeProduit(){
		this.liste = new LinkedList<Produit>();
		this.numCommande = -1;
	}
	public int getNumCommande() {
		return numCommande;
	}
	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}
	void addProduit(Produit p) {
		this.liste.add(p);
	}
	int getSize() {
		return liste.size();
	}
	LinkedList<Produit> getListe(){
		return liste;
	}
}
