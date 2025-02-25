package Controlador;

import java.util.Scanner;

import Modelo.Persona;

public class GestionaPersonas {

	public static void main(String[] args) {

		GestionaPersonas e = new GestionaPersonas();
		e.metodoNoEstatico();
		GestionaPersonas.metodoEstatico();
		
		/*this.metodoEstatico(); //Con el this no puedo acceder a los static*/
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce una cadena");
		String dni = entrada.nextLine();

		while (!dni.equals("fin")) {
			if (Persona.validaDniValido(dni)) {
				Persona p1 = new Persona(dni, 0);

				System.out.println("DNI válido");

			}
			else {
				System.out.println("No válido");
			}
			System.out.println("Introduce una cadena otra vez hasta poner fin: ");
			dni = entrada.nextLine();

		}
	}

	static void metodoEstatico() {
		System.out.println("estático");
	}

	void metodoNoEstatico() {
		System.out.println("no estático");
	}

}