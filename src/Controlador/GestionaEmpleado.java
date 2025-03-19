package Controlador;

import Modelo.Desarrollador;

public class GestionaEmpleado {

	public static void main(String[] args) {

		String[] lenguajes = new String[10];

		lenguajes[0] = "python";
		lenguajes[1] = "java";
		
		String[] frameworks = new String[10];

		frameworks[0] = "eclipse";
		
		String[] frameworks2 = new String[10];
		frameworks2[0] = "eclipse";
		frameworks2[1] = "spring";

	
		Desarrollador p = new Desarrollador(lenguajes, frameworks);
		Desarrollador p1 = new Desarrollador(lenguajes, frameworks2);

		System.out.println(p.calculaImporteNomina());
		System.out.println(p1.calculaImporteNomina());
  
		String[] funcionesDesarrollador = p.devuelveFunciones();

		System.out.println("Funciones del desarrollador:");
		for (String funcion : funcionesDesarrollador) {
			System.out.println(funcion);
		}
		System.out.println(p.calculaImporteNomina());
	}
}