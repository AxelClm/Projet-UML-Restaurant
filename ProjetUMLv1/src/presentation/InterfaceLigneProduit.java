package presentation;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import domaine.Commande;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.JCheckBox;
import javax.swing.JButton;
import domaine.Produit;
@SuppressWarnings("serial")
public class InterfaceLigneProduit extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private Produit produit;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public InterfaceLigneProduit(Produit produit,Commande commande) {
		this.produit = produit;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel(produit.getNom());
		label.setBounds(75, 43, 189, 22);
		contentPane.add(label);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setBounds(54, 128, 56, 16);
		contentPane.add(lblQuantit);
		
		
		JLabel lblOptionnel = new JLabel("Optionnel");
		lblOptionnel.setBounds(54, 227, 56, 16);
		contentPane.add(lblOptionnel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 224, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox<Integer>();
		comboBox.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		comboBox.setBounds(122, 125, 112, 22);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(137, 352, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				commande.ajouterProduit(produit.getNumProduit(),(int)comboBox.getSelectedItem(),textField_1.getText());
				dispose();
			}
		});
		contentPane.add(btnNewButton);
	}
}
