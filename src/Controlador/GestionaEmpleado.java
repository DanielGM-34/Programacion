package Controlador;

import Modelo.Desarrollador;

public class GestionaEmpleado {

	public static void main(String[] args) {
		Desarrollador p = new Desarrollador();
		String[] funcionesDesarrollador = p.devuelveFunciones();

		System.out.println("Funciones del desarrollador:");
		for (String funcion : funcionesDesarrollador) {
			System.out.println(funcion);
		}
		System.out.println(p.calculaImporteNomina());
	}
}