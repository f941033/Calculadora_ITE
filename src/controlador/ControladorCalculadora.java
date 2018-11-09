package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import vista.VentanaCalculadora;

public class ControladorCalculadora implements ActionListener {

	private VentanaCalculadora ventana;
	private JLabel etiquetaResultado;

	private float num1;
	private float num2;

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float suma() {
		return num1 + num2;
	}

	public float resta() {
		return num1 - num2;
	}

	public float multiplicacion() {
		return num1 * num2;
	}

	public float division() {
		return num1 / num2;
	}

	public double raizCubica() {
		return Math.ceil(Math.pow(num1, 0.33));
	}

	public void setVentana(VentanaCalculadora ventana) {
		this.ventana = ventana;
		etiquetaResultado = ventana.getEtiquetaResultado();
		etiquetaResultado.setForeground(Color.red);
	}

	private boolean comprobarCajas() {
		if (ventana.getCajaNumero1().getText().equals("")) {
			etiquetaResultado.setForeground(Color.red);
			etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
			etiquetaResultado.setText("Falta el número 1");
			return false;
		}
		if (ventana.getCajaNumero2().getText().equals("")) {
			etiquetaResultado.setForeground(Color.red);
			etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
			etiquetaResultado.setText("Falta el número 2");
			return false;
		}
		try {
			setNum1(Integer.parseInt(ventana.getCajaNumero1().getText()));
			setNum2(Integer.parseInt(ventana.getCajaNumero2().getText()));
			return true;
		} catch (Exception e) {
			etiquetaResultado.setForeground(Color.red);
			etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
			etiquetaResultado.setText("Números incorrectos");
			return false;
		}
	}

	private boolean comprobarCajaRaiz() {
		if (ventana.getCajaNumero1().getText().equals("") && ventana.getCajaNumero2().getText().equals("")) {
			etiquetaResultado.setForeground(Color.red);
			etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
			etiquetaResultado.setText("Escriba un número");
			return false;
		}

		if (!ventana.getCajaNumero1().getText().equals("")) {
			try {
				setNum1(Float.parseFloat(ventana.getCajaNumero1().getText()));
				return true;
			} catch (Exception e) {
				etiquetaResultado.setForeground(Color.red);
				etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
				etiquetaResultado.setText("Número incorrecto");
				return false;

			}
		} else if (!ventana.getCajaNumero2().getText().equals("")) {
			try {
				setNum1(Float.parseFloat(ventana.getCajaNumero2().getText()));
				return true;
			} catch (Exception e) {
				etiquetaResultado.setForeground(Color.red);
				etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
				etiquetaResultado.setText("Número incorrecto");
				return false;
			}
		} else
			return true;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object boton = e.getSource();

		if (boton == ventana.getBotonRaizCuadrado()) {
			JOptionPane.showMessageDialog(null, "Funcionalidad no disponible", "Raiz Cuadrada",
					JOptionPane.INFORMATION_MESSAGE);
		} else

		if (boton == ventana.getBotonRaizCubica()) {
			String pass = JOptionPane.showInputDialog("Contraseña:");
			if (pass!=null) {
				if (pass.equals("123")) {
					if (comprobarCajaRaiz()) {
						etiquetaResultado.setForeground(new Color(0, 255, 51));
						etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 30));
						etiquetaResultado.setText(String.valueOf(raizCubica()));
					}
				} else {
					etiquetaResultado.setForeground(Color.red);
					etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
					etiquetaResultado.setText("Contraseña incorrecta");
				}
			}else {
				etiquetaResultado.setForeground(Color.red);
				etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 14));
				etiquetaResultado.setText("No se ha introducido contraseña");
			}

		} else

		if (comprobarCajas()) {
			etiquetaResultado.setForeground(new Color(0, 255, 51));
			etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 30));

			if (boton == ventana.getBotonSumar()) {
				etiquetaResultado.setText(String.valueOf(suma()));
			}

			if (e.getSource() == ventana.getBotonRestar()) {
				etiquetaResultado.setText(String.valueOf(resta()));
			}

			if (e.getSource() == ventana.getBotonMultiplicar()) {
				etiquetaResultado.setText(String.valueOf(multiplicacion()));
			}

			if (e.getSource() == ventana.getBotonDividir()) {
				try {
					etiquetaResultado.setText(String.valueOf(division()));
				} catch (Exception ex) {
					etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 20));
					etiquetaResultado.setForeground(Color.red);
					etiquetaResultado.setText("Error: división por cero");
				}

			}
		}

	}

}
