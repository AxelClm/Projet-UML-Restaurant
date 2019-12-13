package presentation;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import domaine.Catalogue;
import domaine.Categorie;
import domaine.Produit;
@SuppressWarnings("serial")
public class InterfaceCommander extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCommander frame = new InterfaceCommander();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void generateButton(String nom,JPanel panel,Produit p) {
		JButton btnNewButton = new JButton(nom);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceLigneProduit t = new InterfaceLigneProduit(p);
				t.setVisible(true);
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
	public InterfaceCommander() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 118, 508, 347);
		contentPane.add(tabbedPane);
		Catalogue c = new Catalogue();
		LinkedList<Categorie> listeC = c.getListeCategorie();
		listeC.forEach(cat -> {
			LinkedList<Produit> listeProd = c.getProduitByCategorie(cat.getIdCategorie());
			JPanel panel = generatePanel(tabbedPane,cat.getNomCategorie());
			listeProd.forEach(prod -> {
				generateButton(prod.getNom(),panel,prod);
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
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 13, 217, 239);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setBounds(12, 279, 97, 25);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Valider");
		btnNewButton_3.setBounds(132, 279, 97, 25);
		panel.add(btnNewButton_3);
	}
}
