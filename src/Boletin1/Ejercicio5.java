package Boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Tienes una membresía premiun? S/N");
		String membresia = entrada.nextLine();

		String Si = "S";
		String si = "s";

		System.out.println("Introduce una cantidad de dinero a gastar: ");
		int dinero = entrada.nextInt();

		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();

		if (membresia.equals(Si) || membresia.equals(si) && dinero >= 50 && edad >= 65) {
			System.out.println("Eres elegible para un descuento.");
		}

		else {
			System.out.println("No eres elegible para un descuento.");
		}
	}

}
