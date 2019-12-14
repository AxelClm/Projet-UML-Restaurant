package presentation;

import java.awt.Color;
//import java.awt.BorderLayout;
import java.awt.EventQueue;
import domaine.Controleur;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import domaine.Catalogue;
import domaine.Categorie;
import domaine.Produit;
import domaine.Commande;
import domaine.LigneProduit;
@SuppressWarnings("serial")
public class InterfaceCommander extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel afficheur;
	private Commande commande;
	private Catalogue c;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public void generateButton(String nom,JPanel panel,Produit p,Commande commande) {
		JButton btnNewButton = new JButton(nom);
		InterfaceCommander frame = this;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceLigneProduit t = new InterfaceLigneProduit(p,commande,frame);
				t.setVisible(true);
				frame.setVisible(false);
			}
		});
		panel.add(btnNewButton);
	}
	public JPanel generatePanel(JTabbedPane tabbedPane,String nom) {
		JPanel jpanel = new JPanel();
		tabbedPane.addTab(nom, null, new JScrollPane(jpanel), null);
		jpanel.setLayout(new GridLayout(0,3));
		return jpanel;
	}
	public void generateButtons2(JPanel jp , LigneProduit lprod , JFrame frame) {
		String nom =" "+lprod.getNumLp()+" "+c.getProduitById(lprod.getNumProduit()).getNom()+" x"
				+lprod.getQte();
		JButton btn = new JButton(nom);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceLigneProduit t = new InterfaceLigneProduit(lprod,commande,(InterfaceCommander)frame,c.getProduitById(lprod.getNumProduit()).getNom());
				t.setVisible(true);
				frame.setVisible(false);
			}
		});
		jp.add(btn);
		this.repaint();
	}
	public void updateAfficheur() {
		LinkedList<LigneProduit> lProd = commande.getListeLp();
		afficheur.removeAll();
		afficheur.setLayout(new GridLayout(0,1));
		JFrame jf = this;
		lProd.forEach(lprod ->{
			generateButtons2(afficheur,lprod,jf);
		});
		this.repaint();
	}
	public InterfaceCommander(Catalogue c ,Commande commande) {
		this.commande = commande;
		this.c=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 118, 508, 347);
		contentPane.add(tabbedPane);
		LinkedList<Categorie> listeC = c.getListeCategorie();
		listeC.forEach(cat -> {
			LinkedList<Produit> listeProd = c.getProduitByCategorie(cat.getIdCategorie());
			JPanel panel = generatePanel(tabbedPane,cat.getNomCategorie());
			listeProd.forEach(prod -> {
				generateButton(prod.getNom(),panel,prod,commande);
			});
		});
		//Entrées.setLayout(null);
		//btnNewButton.setBounds(25, 50, 97, 25);
		JLabel lblTable = new JLabel("Table");
		lblTable.setBounds(59, 41, 41, 16);
		contentPane.add(lblTable);
		
		textField = new JTextField();
		textField.setBounds(101, 38, 41, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumroDeLa = new JLabel("Num\u00E9ro de la commande");
		lblNumroDeLa.setBounds(233, 41, 155, 16);
		contentPane.add(lblNumroDeLa);
		
		textField_1 = new JTextField();
		textField_1.setBounds(385, 38, 123, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(532, 148, 241, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		afficheur = new JPanel();
		afficheur.setBackground(Color.white);
		JScrollPane js = new JScrollPane(afficheur);
		js.setBounds(12, 13, 217, 239);
		updateAfficheur();
		panel.add(js);
		JButton btnNewButton_2 = new JButton("Annuler");
		btnNewButton_2.setBounds(12, 279, 97, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Controleur.menuP(c);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Valider");
		btnNewButton_3.setBounds(132, 279, 97, 25);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				commande.commitCom();
				dispose();
				Controleur.menuP(c);
			}
		});
		panel.add(btnNewButton_3);
	}
}
