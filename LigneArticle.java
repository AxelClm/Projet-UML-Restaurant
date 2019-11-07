import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class LigneArticle {

	Produit nom;
	int quantite;
	int opt;

	LigneArticle(Produit nom,int quantite,int opt){
		this.nom=nom;
		this.quantite=quantite;
		this.opt=opt;
	}

}