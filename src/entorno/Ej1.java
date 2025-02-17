package entorno;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		char[] listaLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		Scanner entrada = new Scanner(System.in);
		int dniNum = 0;
		boolean dniValido = false;

		while (!dniValido) {
			System.out.print("Introduce el número del DNI (8 dígitos): ");
			dniNum = entrada.nextInt();

			if (String.valueOf(dniNum).length() == 8) {
				dniValido = true;
				int resto = dniNum % 23;
				char letra = listaLetras[resto];
				System.out.println("La letra del DNI es: " + letra + ", tu DNI completo es " + dniNum + letra);
			} else {
				System.out.println("El número de DNI debe tener 8 dígitos. Inténtalo de nuevo.");
			}
		}
	}
}
