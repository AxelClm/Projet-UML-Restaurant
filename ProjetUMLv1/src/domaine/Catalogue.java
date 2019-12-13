package domaine;
import java.util.*;
public class Catalogue {
	private LinkedList<Produit> ListeProd;
	private LinkedList<Categorie> ListeCategorie;
	public Catalogue(){
		update();
	}
	public synchronized void update() {
		this.ListeCategorie = bdd.BddCatalogue.getCategories();
		this.ListeProd=bdd.BddCatalogue.getProduits();
	}
	public LinkedList<Produit> getProduitByCategorie(int idCategorie) {
		LinkedList<Produit> ListePbC = new LinkedList<Produit>();
		ListeProd.forEach(p -> {
			if(p.getCategorie() == idCategorie) {
				ListePbC.add(p);
			}
		});
		return ListePbC;
	}
	public LinkedList<Categorie> getListeCategorie() {
		return ListeCategorie;
	}
}
