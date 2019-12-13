package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import domaine.Catalogue;
import domaine.Commande;
public class InterfaceMenuPrinc extends JPanel implements ActionListener{

	Catalogue cata;
	
	JLabel titre = new JLabel("Gestion du restaurant");
	JButton crc = new JButton("Commencer une commande");
	JButton mdc = new JButton("Modifier une commande");
	JButton opt = new JButton("Options");
	JButton quit = new JButton("Quitter");
	JButton valider = new JButton("Valider");
	JButton clo = new JButton("X");
	JButton retour = new JButton("Retour");
	JFrame frame;
	JLabel nca = new JLabel("N° com :");
	JTextField nc = new JTextField();

	JLabel errm = new JLabel("Erreur : numéro de commande non trouvé");
	JLabel mdca = new JLabel("Modifier une commande");

	boolean m = false;
	boolean mr = false;
	
	public InterfaceMenuPrinc(Catalogue cata,JFrame frame){
		this.frame = frame;
		this.cata=cata;
		setLocation(300,0);
		setSize(900,1030);
		crc.addActionListener(this);
		mdc.addActionListener(this);
		opt.addActionListener(this);
		quit.addActionListener(this);
		valider.addActionListener(this);
		clo.addActionListener(this);
        retour.addActionListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);
		
		g.setColor(new Color(158,253,56));
    	g.fillRect(0,0,900,1030);
    	
    	g.setColor(Color.BLACK);
    	titre.setFont(new Font("Plain",Font.PLAIN,40));
    	titre.setSize(615,40);
    	titre.setLocation(250,150);
    	add(titre);
    	
    	crc.setSize(400,100);
    	crc.setLocation(275,275);
    	add(crc);
    	
    	mdc.setSize(400,100);
    	mdc.setLocation(275,400);
    	add(mdc);
    	
    	opt.setSize(400,100);
    	opt.setLocation(275,525);
    	add(opt);
    	
    	quit.setSize(400,100);
    	quit.setLocation(275,650);
    	add(quit);

    	clo.setSize(50,30);
    	clo.setLocation(625,275);
    	remove(clo);

    	nca.setFont(new Font("Plain",Font.PLAIN,30));
    	nca.setLocation(290,430);
    	remove(nca);

    	nc.setSize(375,100);
    	nc.setLocation(292,480);
    	remove(nc);

    	valider.setSize(100,50);
    	valider.setLocation(425,650);
    	remove(valider);

    	mdca.setFont(new Font("Plain",Font.PLAIN,25));
    	mdca.setLocation(320,320);
    	remove(mdca);

    	errm.setFont(new Font("Plain",Font.PLAIN,25));
    	errm.setLocation(215,450);
    	remove(errm);

    	retour.setSize(100,50);
    	retour.setLocation(420,540);
    	remove(retour);


    	if(m==true){
    		
    		remove(crc);
    		remove(mdc);
    		remove(opt);
    		remove(quit);
    		add(clo);
    		add(nca);
    		add(nc);
    		add(mdca);
    		add(valider);
    		g.setColor(new Color(204,204,204));
    		g.fillRect(275,275,400,450);
    	}

        if(mr==true){

            remove(crc);
            remove(mdc);
            remove(opt);
            remove(quit);
            remove(clo);
            remove(nca);
            remove(nc);
            remove(mdca);
            remove(valider);
            add(errm);
            add(retour);
            g.setColor(new Color(204,204,204));
            g.fillRect(175,360,600,250);

        }

    }

    public void actionPerformed(ActionEvent evt) {

    	String composant = evt.getActionCommand();
    	Object source = evt.getSource();

    	if(source==clo){

    		m = false;
    		repaint();
    	}

    	if(source==crc){
    		Commande com = new Commande();
    		InterfaceCommander a = new InterfaceCommander(cata,com);
    		a.setVisible(true);
    		frame.dispose();
    	}

    	if(source == mdc){

    		m=true;
    		repaint();
    	}

    	if(source == quit){

    		System.exit(0);
    	}

    	if(source == valider){

    		//if(c==true) appeler fonction de création
    		//else if(m==true) appeler fonction de recherche

    		if(m==true)
    			mr=true;

    		m=false;

    		repaint();

    	}

    	if(source == retour){

    		mr=false;

    		repaint();
    	}
    }

}