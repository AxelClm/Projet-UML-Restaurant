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
	public int getNumProduit() {
		return numProduit;
	}
	public void setNumProduit(int numProduit) {
		this.numProduit = numProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getCategorie() {
		return categorie;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
