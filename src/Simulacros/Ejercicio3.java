package Simulacros;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numProvincias = 0;
		System.out.print("Introduce el número de la región (1-4): ");
		int region = scanner.nextInt();
		scanner.nextLine();

		if (region == 1) {
			numProvincias = 10;
		} else if (region == 2) {
			numProvincias = 4;
		} else if (region == 3) {
			numProvincias = 6;
		} else if (region == 4) {
			numProvincias = 1;
		} else {
			System.out.println("Número de región no válido.");
			numProvincias = 0;
		}

		if (numProvincias > 0) {
			int totalVotos = 0;
			int totalAbstenciones = 0;
			int maxVotosA = 0;
			int maxVotosB = 0;
			String provinciaMaxA = "";
			String provinciaMaxB = "";
			boolean altaAbstencion = false;

			for (int i = 0; i < numProvincias; i++) {
				System.out.print("Introduce el nombre de la provincia: ");
				String provincia = scanner.nextLine();

				System.out.print("Introduce el número de votos obtenidos por el partido A: ");
				int votosA = scanner.nextInt();

				System.out.print("Introduce el número de votos obtenidos por el partido B: ");
				int votosB = scanner.nextInt();

				System.out.print("Introduce el número de abstenciones: ");
				int abstenciones = scanner.nextInt();
				scanner.nextLine();

				totalVotos += votosA + votosB;
				totalAbstenciones += abstenciones;

				if (votosA > maxVotosA) {
					maxVotosA = votosA;
					provinciaMaxA = provincia;
				}

				if (votosB > maxVotosB) {
					maxVotosB = votosB;
					provinciaMaxB = provincia;
				}

				if (abstenciones > 100000) {
					altaAbstencion = true;
				}
			}

			double porcentajeVotos = totalVotos * 100.0 / (totalVotos + totalAbstenciones);
			double porcentajeAbstencion = totalAbstenciones * 100.0 / (totalVotos + totalAbstenciones);

			System.out.println("Porcentaje de votos totales: " + porcentajeVotos + "%");
			System.out.println("Porcentaje de abstención: " + porcentajeAbstencion + "%");
			System.out.println("Provincia donde el partido A ha obtenido más votos: " + provinciaMaxA);
			System.out.println("Provincia donde el partido B ha obtenido más votos: " + provinciaMaxB);

			if (altaAbstencion) {
				System.out.println("Alta abstención");
			}
		}

		scanner.close();
	}
}