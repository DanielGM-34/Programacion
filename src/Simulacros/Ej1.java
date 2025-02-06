package Simulacros;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char letraGrupo;
		do {
			System.out.print("Ingrese la letra del grupo (A, B, C, D): ");
			letraGrupo = scanner.nextLine().toUpperCase().charAt(0);
		} while (letraGrupo != 'A' && letraGrupo != 'B' && letraGrupo != 'C' && letraGrupo != 'D');

		int numAlumnos = (letraGrupo == 'A') ? 25 : (letraGrupo == 'B') ? 28 : (letraGrupo == 'C') ? 31 : 29;
		//NombresA[new int 25] NombresB [new int 28] NombresC [new int 31] NombresD [new int 29]

		double maxMedia = 0;
		String mejorAlumno = "";
		int alumnosSuspensos = 0;
		boolean existenSobresalientes = false;

		for (int i = 0; i < numAlumnos; i++) {
			System.out.print("Ingrese el nombre del alumno: ");
			String nombre = scanner.next();
			System.out.print("Ingrese la nota del primer parcial: ");
			double nota1 = scanner.nextDouble();
			System.out.print("Ingrese la nota del segundo parcial: ");
			double nota2 = scanner.nextDouble();
			System.out.print("Ingrese la nota del tercer parcial: ");
			double nota3 = scanner.nextDouble();

			double media = (nota1 + nota2 + nota3) / 3;

			if (media > maxMedia) {
				maxMedia = media;
				mejorAlumno = nombre;
			}
			if (media < 5) {
				alumnosSuspensos++;
			}
			if (nota1 >= 9 || nota2 >= 9 || nota3 >= 9) {
				existenSobresalientes = true;
			}
		}

		System.out.println("El nombre del alumno con mayor nota media: " + mejorAlumno);
		System.out.println("Número de alumnos con la nota media suspensa: " + alumnosSuspensos);
		if (existenSobresalientes) {
			System.out.println("Existen sobresalientes");
		}

		scanner.close();
	}
}