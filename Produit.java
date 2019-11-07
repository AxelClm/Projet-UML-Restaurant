import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Produit{

	int numProd;
	String nom;
	String desc;
	Boolean dispo;
	String[] opt;
	double prix;

	Produit(int numProd,String nom, String desc,String[] opt,double prix){

		this.numProd=numProd;
		this.nom=nom;
		this.desc=desc;
		dispo = true;
		this.opt = opt;
		this.prix=prix;
	}

	void changerDispo(){

		if(dispo==true)
			dispo=false;
		else dispo=true;

	}

	
}