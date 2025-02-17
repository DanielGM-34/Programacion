package entorno;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Introduce 10 números:");

		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("Números en orden inverso:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
