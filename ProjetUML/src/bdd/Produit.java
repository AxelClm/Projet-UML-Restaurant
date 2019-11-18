package bdd;

public class Produit {
	private int idProduit;
	private String nomProduit;
	private double prixProduit;
	private int catégorieProduit;
	private boolean enVente;
	private int idCommande = -1;
	
	Produit(int idProduit,String nomProduit,double prixProduit,int catégorieProduit,boolean enVente){
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.catégorieProduit = catégorieProduit;
		this.enVente = enVente;
	}
	Produit(int idProduit,String nomProduit,double prixProduit,int catégorieProduit,boolean enVente,int idCommande){
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.catégorieProduit = catégorieProduit;
		this.enVente = enVente;
		this.idCommande = idCommande;
	}
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public int getCatégorieProduit() {
		return catégorieProduit;
	}

	public void setCatégorieProduit(int catégorieProduit) {
		this.catégorieProduit = catégorieProduit;
	}

	public boolean isEnVente() {
		return enVente;
	}

	public void setEnVente(boolean enVente) {
		this.enVente = enVente;
	}
}
