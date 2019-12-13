package domaine;
import java.util.*;
public class Catalogue {
	private LinkedList<Produit> ListeProd;
	private LinkedList<Categorie> ListeCategorie;
	Catalogue(){
		update();
	}
	synchronized void update() {
		this.ListeCategorie = bdd.BddCatalogue.getCategories();
		this.ListeProd=bdd.BddCatalogue.getProduits();
	}
	LinkedList<Produit> getProduitByCategorie(int idCategorie) {
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
