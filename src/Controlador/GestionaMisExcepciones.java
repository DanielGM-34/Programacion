package Controlador;

import Excepciones.AdrianExcepcion;

public class GestionaMisExcepciones {

	public static void main(String[] args) throws AdrianExcepcion {
		try {
			throw new AdrianExcepcion("Lanzando mis excepciones.");

		} catch (AdrianExcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
