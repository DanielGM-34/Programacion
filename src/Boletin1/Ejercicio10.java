package Boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
/*pipipi popopo */
		System.out.println("Adivina el número aleatorio: ");
		int humano = entrada.nextInt();

		Random random = new Random();
		int aleatorio = random.nextInt(1, 10);

		while (humano != aleatorio) {
			System.out.println("No lo has adivinado, inténtalo otra vez: ");
			humano = entrada.nextInt();
			if (humano == aleatorio) {
				System.out.println("Has acertado, pusiste el " + humano + " y era el " + aleatorio);
			}
		}
	}
}
