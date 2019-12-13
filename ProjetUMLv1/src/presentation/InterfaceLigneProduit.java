package presentation;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.JCheckBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class InterfaceLigneProduit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLigneProduit frame = new InterfaceLigneProduit();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public InterfaceLigneProduit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(75, 43, 189, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		contentPane.add(btnNewButton);
	}
}
