package Boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el número 1: ");

		int n1 = entrada.nextInt();

		System.out.println("Introduce el número 2: ");

		int n2 = entrada.nextInt();

		int multiplicacion = n1 * n2;

		System.out.println("El resultado de la multiplicación de " + n1 + " y " + n2 + " es " + multiplicacion);

	}

}