package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import domaine.Catalogue;
import domaine.Commande;
import bdd.BddCom;
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
	
	JPanel menuP = new JPanel();
	JPanel menuNumC = new JPanel();
	JPanel menuNumCErreur = new JPanel();
	
	int affiche = 0;
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
        initMenuP();
        initMenuNumC();
        initMenuNumCErreur();
        afficherMenuP();
	}
	public void initMenuP(){
		menuP.setLayout(null);
		menuP.setSize(new Dimension(900, 1030));
		menuP.setPreferredSize(new Dimension(900, 1030));
		menuP.setBackground(new Color(158,253,56));
    	crc.setBounds(275,275,400,100);
    	menuP.add(crc);
    	
    	mdc.setSize(400,100);
    	mdc.setBounds(275,400,400,100);
    	menuP.add(mdc);
    	
    	opt.setSize(400,100);
    	opt.setLocation(275,525);
    	menuP.add(opt);
    	
    	quit.setSize(400,100);
    	quit.setLocation(275,650);
    	menuP.add(quit);
    	titre.setFont(new Font("Plain",Font.PLAIN,40));
    	titre.setSize(615,40);
    	titre.setLocation(250,150);
    	menuP.add(titre);
    	
	}
	public void initMenuNumC() {
		menuNumC.setLayout(null);
		menuNumC.setSize(new Dimension(900, 1030));
		menuNumC.setPreferredSize(new Dimension(900, 1030));
		menuNumC.setBackground(new Color(158,253,56));
		
    	
    	JPanel jp = new JPanel();
    	//jp.setLayout(null);
    	jp.setSize(new Dimension(400,500));
    	jp.setPreferredSize(new Dimension(400,450));
    	jp.setLocation(225, 225);
    	jp.setBackground(Color.gray);
    	menuNumC.add(jp);
    	
    	clo.setSize(50,30);
    	clo.setLocation(350,0);
    	jp.add(clo);
    	nca.setFont(new Font("Plain",Font.PLAIN,30));
    	nca.setSize(615,40);
    	nca.setLocation(30,205);
    	jp.add(nca);
    	
    	mdca.setFont(new Font("Plain",Font.PLAIN,25));
    	mdca.setSize(615,40);
    	mdca.setLocation(30,95);
    	jp.add(mdca);
    	
    	nc.setSize(375,100);
    	nc.setLocation(10,255);
    	jp.add(nc);

    	valider.setSize(100,50);
    	valider.setLocation(160,400);
    	jp.add(valider);
	}
	public void initMenuNumCErreur() {
		menuNumCErreur.setLayout(null);
		menuNumCErreur.setSize(new Dimension(900, 1030));
		menuNumCErreur.setPreferredSize(new Dimension(900, 1030));
		menuNumCErreur.setBackground(new Color(158,253,56));
		JPanel jp = new JPanel();
		jp.setSize(new Dimension(600,300));
    	jp.setPreferredSize(new Dimension(600,300));
    	jp.setLocation(125, 225);
    	jp.setBackground(Color.gray);
    	menuNumCErreur.add(jp);
		errm.setFont(new Font("Plain",Font.PLAIN,25));
		errm.setSize(615,40);
    	errm.setLocation(50,40);
    	jp.add(errm);
    	
    	retour.setSize(100,50);
    	retour.setLocation(250,200);
    	jp.add(retour);
	}
	
	public void afficherMenuP() {
		if(affiche == 1) {
			this.remove(menuNumC);
		}
		if(affiche == 2) {
			this.remove(menuNumCErreur);
		}
		affiche = 0;
		this.add(menuP);
	}
	public void afficherMenuNumC() {
		if(affiche == 0) {
			this.remove(menuP);
		}
		if(affiche == 2) {
			this.remove(menuNumCErreur);
		}
		affiche = 1;
		this.add(menuNumC);
	}
	public void afficherMenuNumCErreur() {
		if(affiche == 1) {
			this.remove(menuNumC);
		}
		if(affiche == 0) {
			this.remove(menuP);
		}
		affiche = 2;
		this.add(menuNumCErreur);
	}

    public void actionPerformed(ActionEvent evt) {

    	String composant = evt.getActionCommand();
    	Object source = evt.getSource();

    	if(source==clo){
    		afficherMenuP();
    		repaint();
    	}

    	if(source==crc){
    		Commande com = new Commande();
    		InterfaceCommander a = new InterfaceCommander(cata,com);
    		a.setVisible(true);
    		frame.dispose();
    	}

    	if(source == mdc){
    		afficherMenuNumC();
    		repaint();
    	}

    	if(source == quit){

    		System.exit(0);
    	}

    	if(source == valider){
    		try {
    			int a = Integer.parseInt(nc.getText());
        		Commande c = BddCom.getCommande(a);
        		if(c.getListeLp().size() == 0) {
        			afficherMenuNumCErreur();
            		repaint();
        		}
        		else {
        			InterfaceCommander b = new InterfaceCommander(cata,c);
            		b.setVisible(true);
            		frame.dispose();
        		}
    		}
    		catch(NumberFormatException e) {
    			afficherMenuNumCErreur();
        		repaint();
    		}
    		

    	}

    	if(source == retour){
    		afficherMenuP();
    		repaint();
    	}
    }

}