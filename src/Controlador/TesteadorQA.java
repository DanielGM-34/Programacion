package Controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un número entero: ");
		try {
			int numero = scanner.nextInt();
			String cadena = "";
			System.out.println(cadena.charAt(10));
			System.out.println("detrás del input.");

		} catch (InputMismatchException ex) {
			System.out.println("Entro en catch");

			// TODO: handle exception
		} finally {
			System.out.println("Pase lo que pase.");
		}

		/*
		 * System.out.print("Ingresa un número entero: "); int numero =
		 * scanner.nextInt(); System.out.print("Ingresa otro número para dividir: ");
		 * 
		 * int divisor = scanner.nextInt();
		 * 
		 * int resultado = numero / divisor;
		 * 
		 * System.out.println("El resultado de la división es: " + resultado);
		 */
		scanner.close();

	}
}