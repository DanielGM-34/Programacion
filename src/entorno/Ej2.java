package entorno;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("Pon 10 números:");

		for (int i = 0; i < 10; i++) {
			num[i] = entrada.nextInt();
		}

		System.out.println("Números en orden invertido:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}
}
