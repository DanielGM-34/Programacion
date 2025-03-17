package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3BoletinExcp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número máximo de números: ");
		int numMax = entrada.nextInt();
		int[] listaNum = new int[numMax];

		for (int i = 0; i < listaNum.length; i++) {
			listaNum[i] = entrada.nextInt();
			System.out.println(listaNum[i]);

			if (listaNum[i] >= 0) {
				try {
					throw new ArithmeticException();
				} catch (ArithmeticException p) {
					System.out.println("En el catch de InputMismatchException");
					throw p;
				}
			}
		}
	}
}