package Controlador;

import Excepciones.MiExcepcion;

public class GestionaMisExcepcionesEjercicio5BExcep {

	public static void main(String[] args) throws MiExcepcion {
		GestionaMisExcepcionesEjercicio5BExcep e = new GestionaMisExcepcionesEjercicio5BExcep();

		MiExcepcion p = new MiExcepcion("Error");
		e.metodo1(5);
	}

	public void metodo1(int n1) throws MiExcepcion {
		try {
			if (n1 % 2 != 0) {
				throw new MiExcepcion("Lanzando mis excepciones.");
			}
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}