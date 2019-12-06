package bdd;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) {
		int[] idProduit = new int[2];
		String[] option = new String[2];
		int[] qte = new int[2];
		idProduit[0] = 1;
		idProduit[1] = 2;
		option[0] = " ";
		option[1] = " ";
		qte[0] = 1;
		qte[1] = 1;
		//BddCom.insertCommande(idProduit, option, qte);
		//int r = BddCom.addRow(1,5," ",1);
		//System.out.println(r);
		//BddCom.deleteRow(5);
		//System.out.println(BddCatalogue.getCategories().size());
	}

}
