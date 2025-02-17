package entorno;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		char[] listaLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número del DNI: ");
		int dniNumber = scanner.nextInt();
		if (String.valueOf(dniNumber).length() == 8) {
			int resto = dniNumber % 23;
			char letra = listaLetras[resto];
			System.out.println("La letra del DNI es: " + letra);
		} else {
			System.out.println("El número de DNI debe tener 8 dígitos.");
		}

	}
}