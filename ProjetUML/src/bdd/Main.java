package bdd;


public class Main {

	public static void main(String[] args) {
		ListeProduit liste = Commande.selectByNumCommande(1);
		if(liste != null) {
			liste.getListe().forEach(p ->{
				System.out.println(p.getNomProduit());
			});
			Commande.addNewCommande(liste);
		}
		else {
			System.out.println("null");
		}
	}

}
