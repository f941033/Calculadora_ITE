package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControladorCalculadora;

@SuppressWarnings("serial")
public class VentanaCalculadora extends JFrame{
	
	private JLabel logo;
	private JLabel etiquetaNumero1;
	private JTextField cajaNumero1;
	
	private JLabel etiquetaNumero2;
	private JTextField cajaNumero2;
	
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton botonRaizCuadrada;
	private JButton botonRaizCubica;
	
	private JLabel etiquetaFinal;
	private JLabel etiquetaResultado;
		
	public VentanaCalculadora(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(340, 465);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\logo_telefonica2.png"));
		setTitle("Calculadora ITT");		
		setLayout(null);
		setResizable(false);
		inicializarComponentes();
        setVisible(true);
	}
	
	private void inicializarComponentes() {
		
		logo = new JLabel(new ImageIcon("images\\company_logo.png" ));
		logo.setBounds(52, 24, 229, 60);
		add(logo);

		getContentPane().setBackground(Color.WHITE);

		etiquetaNumero1 = new JLabel("Numero 1:");
		etiquetaNumero1.setForeground(new Color(0, 0, 102));
		etiquetaNumero1.setFont(new Font("Dialog", Font.PLAIN, 14));
		etiquetaNumero1.setBounds(52, 125, 82, 22);
		add(etiquetaNumero1);
		
		cajaNumero1 = new JTextField();
		cajaNumero1.setForeground(new Color(0, 0, 102));
		cajaNumero1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		cajaNumero1.setBounds(175, 123, 106, 24);
		add(cajaNumero1);
		
		etiquetaNumero2 = new JLabel("Numero 2:");
		etiquetaNumero2.setFont(new Font("Dialog", Font.PLAIN, 14));
		etiquetaNumero2.setForeground(new Color(0, 0, 102));
		etiquetaNumero2.setBounds(52, 159, 82, 22);
		add(etiquetaNumero2);
				
		cajaNumero2 = new JTextField();
		cajaNumero2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		cajaNumero2.setForeground(new Color(0, 0, 102));
		cajaNumero2.setBounds(175, 157, 106, 24);
		add(cajaNumero2);
		
		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(52, 202, 113, 35);	
		botonSumar.setBackground(new Color(0, 0, 102));
		botonSumar.setForeground(Color.WHITE);
		botonSumar.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonSumar);
		
		botonRestar = new JButton("Restar");
		botonRestar.setBounds(175, 202, 106, 35);	
		botonRestar.setBackground(new Color(0, 0, 102));
		botonRestar.setForeground(Color.WHITE);
		botonRestar.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonRestar);
		
		botonRaizCuadrada = new JButton("Raiz 2");
		botonRaizCuadrada.setBounds(52, 294, 113, 35);
		botonRaizCuadrada.setBackground(new Color(0, 0, 102));
		botonRaizCuadrada.setForeground(Color.WHITE);
		botonRaizCuadrada.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonRaizCuadrada);
		
		botonMultiplicar = new JButton("Multiplicar");
		botonMultiplicar.setBounds(52, 248, 113, 35);	
		botonMultiplicar.setBackground(new Color(0, 0, 102));
		botonMultiplicar.setForeground(Color.WHITE);
		botonMultiplicar.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonMultiplicar);
		
		botonDividir = new JButton("Dividir");
		botonDividir.setBounds(175, 248, 106, 35);	
		botonDividir.setBackground(new Color(0, 0, 102));
		botonDividir.setForeground(Color.WHITE);
		botonDividir.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonDividir);
		
		botonRaizCubica = new JButton("Raiz 3");
		botonRaizCubica.setBounds(175, 294, 106, 35);	
		botonRaizCubica.setBackground(new Color(0, 0, 102));
		botonRaizCubica.setForeground(Color.WHITE);
		botonRaizCubica.setFont(new Font("Arial", Font.BOLD, 14));
		add(botonRaizCubica);
		
		etiquetaFinal = new JLabel("Resultado:");
		etiquetaFinal.setForeground(new Color(0, 0, 102));
		etiquetaFinal.setFont(new Font("Dialog", Font.PLAIN, 14));
		etiquetaFinal.setBounds(52, 350, 82, 22);
		add(etiquetaFinal);
		
		etiquetaResultado = new JLabel(" ");
		etiquetaResultado.setBackground(new Color(0, 255, 51));
		etiquetaResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaResultado.setForeground(new Color(0, 0, 153));
		etiquetaResultado.setBounds(52, 375, 229, 39);
		etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
		add(etiquetaResultado);		
	}
	
	public void setControlador(ControladorCalculadora controlador) {
		botonSumar.addActionListener(controlador);
		botonRestar.addActionListener(controlador);
		botonMultiplicar.addActionListener(controlador);
		botonDividir.addActionListener(controlador);
		botonRaizCuadrada.addActionListener(controlador);
		botonRaizCubica.addActionListener(controlador);
	}
	
	public JTextField getCajaNumero1() {
		return cajaNumero1;
	}


	public JTextField getCajaNumero2() {
		return cajaNumero2;
	}


	public JButton getBotonSumar() {
		return botonSumar;
	}


	public JButton getBotonRestar() {
		return botonRestar;
	}


	public JButton getBotonMultiplicar() {
		return botonMultiplicar;
	}


	public JButton getBotonDividir() {
		return botonDividir;
	}


	public JLabel getEtiquetaResultado() {
		return etiquetaResultado;
	}
	
	public JButton getBotonRaizCuadrado() {
		return botonRaizCuadrada;
	}
	
	public JButton getBotonRaizCubica() {
		return botonRaizCubica;
	}
	
	
}

