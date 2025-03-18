package Excepciones;

import java.util.Scanner;

public class Ejercicio3BoletinExcp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número máximo de números: ");
		int numMax = entrada.nextInt();
		int[] listaNum = new int[numMax];

		for (int i = 0; i < listaNum.length; i++) {

			if (listaNum[i] >= 0) {
				try {
					listaNum[i] = entrada.nextInt();
					System.out.println(listaNum[i]);
					throw new ArithmeticException();
				} catch (ArithmeticException numPos) {
					System.out.println("Número mayor o igual a 0.");
					throw numPos;
				}
			}
		}
	}
}