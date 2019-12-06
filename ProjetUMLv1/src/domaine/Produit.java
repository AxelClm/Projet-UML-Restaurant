package domaine;

public class Produit {
	private int numProduit;
	private String nom;
	private double prix;
	private int categorie;
	private String desc;
	public Produit(int numProduit,String nom, double prix, int categorie,String desc) {
		this.numProduit = numProduit;
		this.prix = prix;
		this.categorie = categorie;
		this.desc = desc;
		this.nom = nom;
	}
	
	
}
