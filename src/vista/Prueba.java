package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Prueba extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Prueba() {
		getContentPane().setBackground(Color.WHITE);
		//setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rcl\\Desktop\\logo_telefonica_.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 426);
		getContentPane().setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1:");
		lblNumero.setBounds(56, 76, 64, 22);
		getContentPane().add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(56, 142, 64, 22);
		getContentPane().add(lblNumero_1);
		
		textField = new JTextField();
		textField.setBounds(143, 68, 86, 39);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 134, 86, 39);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setFont(new Font("Arial", Font.BOLD, 12));
		btnSumar.setForeground(Color.WHITE);
		btnSumar.setBackground(new Color(0, 0, 102));
		btnSumar.setBounds(56, 196, 113, 45);
		getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setBackground(new Color(0, 0, 102));
		btnRestar.setBounds(177, 196, 104, 45);
		getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBackground(new Color(0, 0, 102));
		btnMultiplicar.setBounds(56, 252, 113, 45);
		getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBackground(new Color(0, 0, 102));
		btnDividir.setBounds(177, 252, 104, 45);
		getContentPane().add(btnDividir);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 18));
		lblResultado.setForeground(Color.RED);
		lblResultado.setBounds(99, 331, 64, 14);
		getContentPane().add(lblResultado);
		
		JLabel label = new JLabel("");
		label.setBounds(173, 331, 46, 14);
		getContentPane().add(label);
	}
}
