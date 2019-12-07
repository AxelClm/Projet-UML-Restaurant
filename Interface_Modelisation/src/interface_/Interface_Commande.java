package interface_;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Interface_Commande extends JFrame {

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
					Interface_Commande frame = new Interface_Commande();
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
	public Interface_Commande() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 118, 508, 347);
		contentPane.add(tabbedPane);
		
		JPanel Entrées = new JPanel();
		tabbedPane.addTab("Entrées", null, Entrées, null);
		Entrées.setLayout(null);
		
		JButton btnNewButton = new JButton("Entr\u00E9e 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(25, 50, 97, 25);
		Entrées.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Entr\u00E9e 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(150, 50, 97, 25);
		Entrées.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Entr\u00E9e 6");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(150, 100, 97, 25);
		Entrées.add(btnNewButton_4);
		
		JButton btnEntre_1 = new JButton("Entr\u00E9e 8");
		btnEntre_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnEntre_1.setBounds(400, 100, 97, 25);
		Entrées.add(btnEntre_1);
		
		JButton btnEntre = new JButton("Entr\u00E9e 9");
		btnEntre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnEntre.setBounds(25, 150, 97, 25);
		Entrées.add(btnEntre);
		
		JButton btnEntre_2 = new JButton("Entr\u00E9e 7");
		btnEntre_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnEntre_2.setBounds(275, 100, 97, 25);
		Entrées.add(btnEntre_2);
		
		JButton btnNewButton_5 = new JButton("Entr\u00E9e 3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(275, 50, 97, 25);
		Entrées.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Entr\u00E9e 4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(400, 50, 97, 25);
		Entrées.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Entr\u00E9e 5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(25, 100, 97, 25);
		Entrées.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Entr\u00E9e 10");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(150, 150, 97, 25);
		Entrées.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Entr\u00E9e 11");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(275, 150, 97, 25);
		Entrées.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Entr\u00E9e 12");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(400, 150, 97, 25);
		Entrées.add(btnNewButton_10);
		
		
		JPanel Plats = new JPanel();
		tabbedPane.addTab("Plats", null, Plats, null);
		Plats.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Plat 1");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_11.setBounds(43, 86, 97, 25);
		Plats.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Plat 3");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_12.setBounds(311, 87, 97, 25);
		Plats.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Plat 2");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_13.setBounds(175, 86, 97, 25);
		Plats.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Plat 4");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_14.setBounds(43, 145, 97, 25);
		Plats.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Plat 5");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_15.setBounds(178, 145, 97, 25);
		Plats.add(btnNewButton_15);
		
		JLabel lblViande = new JLabel("Viande");
		lblViande.setBounds(24, 38, 46, 16);
		Plats.add(lblViande);
		
		JButton btnNewButton_16 = new JButton("Plat 6");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_16.setBounds(300, 145, 97, 25);
		Plats.add(btnNewButton_16);
		
		JLabel lblNewLabel = new JLabel("Poissons");
		lblNewLabel.setBounds(24, 203, 56, 16);
		Plats.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("P\u00E2tes");
		lblNewLabel_1.setBounds(24, 250, 56, 16);
		Plats.add(lblNewLabel_1);
		
		JPanel Desserts = new JPanel();
		tabbedPane.addTab("Desserts", null, Desserts, null);
		Desserts.setLayout(null);
		
		JButton btnNewButton_17 = new JButton("Dessert 1");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_17.setBounds(38, 55, 97, 25);
		Desserts.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Dessert 2");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_18.setBounds(182, 55, 97, 25);
		Desserts.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("Dessert 3");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_19.setBounds(310, 55, 97, 25);
		Desserts.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("Dessert 4");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_20.setBounds(38, 127, 97, 25);
		Desserts.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("Dessert 5");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_21.setBounds(182, 127, 97, 25);
		Desserts.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("Dessert 6");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_22.setBounds(310, 127, 97, 25);
		Desserts.add(btnNewButton_22);
		
		JPanel Breuvages = new JPanel();
		tabbedPane.addTab("Breuvages", null, Breuvages, null);
		Breuvages.setLayout(null);
		
		JButton btnNewButton_23 = new JButton("Breuvage 1");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_23.setBounds(37, 44, 97, 25);
		Breuvages.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("Breuvage 2");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_24.setBounds(184, 44, 97, 25);
		Breuvages.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Breuvage 3");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_25.setBounds(326, 44, 97, 25);
		Breuvages.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Breuvage 4");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_26.setBounds(37, 105, 97, 25);
		Breuvages.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("Breuvage 5");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_27.setBounds(184, 105, 97, 25);
		Breuvages.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Breuvage 6");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_28.setBounds(326, 105, 97, 25);
		Breuvages.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("Breuvage 7");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_29.setBounds(37, 178, 97, 25);
		Breuvages.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("Breuvage 8");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_30.setBounds(184, 178, 97, 25);
		Breuvages.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("Breuvage 9");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantité_Interface t = new Quantité_Interface();
				t.setVisible(true);
			}
		});
		btnNewButton_31.setBounds(326, 178, 97, 25);
		Breuvages.add(btnNewButton_31);
		
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
