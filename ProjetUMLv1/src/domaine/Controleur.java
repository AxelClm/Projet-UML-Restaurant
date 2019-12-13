package domaine;
import presentation.InterfaceMenuPrinc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controleur {

	public static void main(String[] args) {
		
		Catalogue c = new Catalogue();
		InterfaceMenuPrinc mp = new InterfaceMenuPrinc(c);
		JFrame fenetre = new JFrame();
		fenetre.setSize(1200,900);
		fenetre.setLocation(100,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("ProjetUML");
		fenetre.setLayout(null);

		fenetre.add(mp);
		fenetre.setVisible(true);
	}
	
}
