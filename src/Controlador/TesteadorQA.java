package Controlador;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		try {
			System.out.println("Escribe un número entero: ");
			numero = scanner.nextInt();
			String cadena = "ppp";
			System.out.println(cadena.charAt(10));
			System.out.println("detrás del input.");

		} catch (InputMismatchException ex) {
			System.out.println("Dame otro número: ");
			numero = scanner.nextInt();

			// TODO: handle exception
		}

		catch (StringIndexOutOfBoundsException ey) {
			System.out.println("Entro en catch 2: " + ey.getCause());
			System.out.println("Entro en catch 2: " + ey.getMessage());
		}
		
		finally {
			System.out.println("Pase lo que pase.");
		}
		System.out.println("Sigo detrás del finally");

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