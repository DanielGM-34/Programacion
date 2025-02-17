package entorno;

import java.util.Scanner;
import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int userChoice;
		do {
			System.out.println("Elige una opción: Piedra (1), Papel (2), Tijeras (3), Salir (0)");
			userChoice = scanner.nextInt();
			if (userChoice == 0)
				break;

			int computerChoice = random.nextInt(3) + 1;
			System.out.println("La computadora eligió: " + getChoiceName(computerChoice));

			if (userChoice == computerChoice) {
				System.out.println("¡Empate!");
			} else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1)
					|| (userChoice == 3 && computerChoice == 2)) {
				System.out.println("¡Ganaste!");
			} else {
				System.out.println("Perdiste.");
			}
		} while (userChoice != 0);
	}

	private static String getChoiceName(int choice) {
		switch (choice) {
		case 1:
			return "Piedra";
		case 2:
			return "Papel";
		case 3:
			return "Tijeras";
		default:
			return "";
		}

	}
}
