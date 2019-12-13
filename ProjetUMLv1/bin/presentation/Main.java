import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args){

		MenuPrincipal mp = new MenuPrincipal();

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