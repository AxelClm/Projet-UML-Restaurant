package domaine;
import presentation.InterfaceMenuPrinc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controleur {

	public static void menuP(Catalogue c) {
		JFrame fenetre = new JFrame();
		InterfaceMenuPrinc mp = new InterfaceMenuPrinc(c,fenetre);
		fenetre.setSize(1200,900);
		fenetre.setLocation(100,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("ProjetUML");
		fenetre.setLayout(null);
		fenetre.add(mp);
		fenetre.setVisible(true);
	}
	public static void main(String[] args) {
		Catalogue c = new Catalogue();
		menuP(c);
		
	}
	
}
