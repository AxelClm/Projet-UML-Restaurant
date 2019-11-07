import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class InterfaceCommande extends JPanel {

	Catalogue c;
	JButton supp = new JButton("Supprimer");
	JButton vali = new JButton("Valider");

	InterfaceCommande(Catalogue c){
		this.c = c;
		//setLocation(350,0);
		//setSize(1150,900);  marche pas
	}

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.fillRect(0,0,1500,900);
		g.setColor(new Color(254,254,226));
		g.fillRoundRect(1200,85,300,775,25,25);
		g.fillRoundRect(1380,30,100,7,25,25);
		g.fillRoundRect(1380,42,100,7,25,25);
		g.fillRoundRect(1380,54,100,7,25,25);
		g.setColor(Color.WHITE);
		g.fillRoundRect(1225,100,250,700,25,25);
		this.add(supp);
		supp.setLocation(1225,825);
		this.add(vali);
		vali.setLocation(1375,825);
		vali.setSize(110,25);
		g.setColor(new Color(254,254,226));
		g.fillRoundRect(-10,0,360,870,25,25);
	}
}