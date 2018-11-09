package controlador;

import vista.VentanaCalculadora;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		VentanaCalculadora miCalculadora = new VentanaCalculadora();
		ControladorCalculadora miControlador = new ControladorCalculadora();
		miCalculadora.setControlador(miControlador);
		miControlador.setVentana(miCalculadora);
	}

}
