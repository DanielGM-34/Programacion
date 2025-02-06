package Boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la altura del trángulo: ");
		int altura = entrada.nextInt();

		System.out.println("Introduce la anchura del trángulo: ");
		int base = entrada.nextInt();

		int area = (altura * base) / 2;

		System.out.println("El área de nuestro triángulo es " + area);

	}

}
