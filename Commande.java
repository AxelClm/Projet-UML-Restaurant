import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Commande {

	LigneArticle[] liste;
	int numCom;
	int table;
	InterfaceCommande ic;
	//ajouter date et heure debut et fin

	Commande(int table,Catalogue c){
		liste = new LigneArticle[20];
		this.table = table;
		numCom = 1; //generer un nombre aleatoire qui n'est pas deja utilise dans la base de donnee
		ic = new InterfaceCommande(c);
		ic.repaint();
	}
}