import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Commander {

	public static void main(String[] args){

		JFrame fenetre = new JFrame();
		fenetre.setSize(1500,900);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Gestion de restaurant");
		fenetre.setLayout(null);

		Catalogue ca = new Catalogue();
		Commande c = new Commande(5,ca);
		fenetre.setContentPane(c.ic);
		fenetre.setVisible(true);

		
	}
}