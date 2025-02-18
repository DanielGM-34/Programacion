package entorno;

import java.util.Scanner;
import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numHum=9999;

        while (numHum != 0) {
            System.out.println("Elige una opción: Piedra (1), Papel (2), Tijeras (3), Salir (0)");
            numHum = scanner.nextInt();

            if (numHum == 0) {
                System.out.println("Saliendo");
            } else {
                int eleccionNumMaq = random.nextInt(3) + 1;
                String eleccionMaquina = "";
                if (eleccionNumMaq == 1) {
                	eleccionMaquina = "Piedra";
                } else if (eleccionNumMaq == 2) {
                	eleccionMaquina = "Papel";
                } else if (eleccionNumMaq == 3) {
                	eleccionMaquina = "Tijeras";
                }

                System.out.println("La computadora eligió: " + eleccionMaquina);

                if (numHum == eleccionNumMaq) {
                    System.out.println("¡Empate!");
                } else if ((numHum == 1 && eleccionNumMaq == 3) ||
                           (numHum == 2 && eleccionNumMaq == 1) ||
                           (numHum == 3 && eleccionNumMaq == 2)) {
                    System.out.println("¡Ganaste!");
                } else {
                    System.out.println("Perdiste.");
                }
            }
        }
        scanner.close();
    }
}
