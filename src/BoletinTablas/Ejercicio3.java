package BoletinTablas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int num_Enteros[] = { 1, 3, 4, 7 };

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame el número que quieras ver: ");
		int PedirNum = entrada.nextInt();

		for (int i = 0; i < num_Enteros.length; i++) {
			if (PedirNum == num_Enteros[i]) {
				System.out.println("La posición de " + PedirNum + " es: " + i);
			} else {
				if (PedirNum < num_Enteros[i] && PedirNum > num_Enteros[i - 1]) {
					int pos = i;
					System.out.println("El número de la posición es - " + pos);
				}
			}

		}

	}
}