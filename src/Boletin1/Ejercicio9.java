package Boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
//Haz un programa que permita calcular la suma de dos números. Pedirá dos números al usuario 
//y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.

		Scanner entrada = new Scanner(System.in);

		int n1, n2;
		System.out.println("Introduce n1:");
		n1 = entrada.nextInt();

		System.out.println("Introduce n2:");
		n2 = entrada.nextInt();

		System.out.println(n1 + n2);

		while (n1 != 0 && n2 != 0) {
			System.out.println("Introduce n1:");
			n1 = entrada.nextInt();

			System.out.println("Introduce n2:");
			n2 = entrada.nextInt();

			int suma = n1 + n2;

			System.out.println(suma);

			if (n1 + n2 == 0) {
				System.out.println("N1 y N2 valen 0, se acabó el bucle.");
			}
		}
	}
}