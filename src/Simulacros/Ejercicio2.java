package Simulacros;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//pedirTipoArbol
		//CalculaMax
		//CalculaMin
		//SumaAlturas
		//AlturaMax
		//AlturaMin
		//CalculaMedia
		//DiametroMax
		//DiametroMin
		//CalculaEdad
		//CalculaArbolesTipoB
		//CalculaNumArboles
		
		//CargaDatos(tipoArbol, diametro, alturas, edadB, numtotal, numTipoB) numArbol= dime el numero de arbol, for (int i=0;i<NumArbol;i++) 
		//tipo=scanner dime el tipo, diametro, altura
		/*
		 * 
		 * main:
		 * char [] tipoArbol 
		 * double [] diametros 
		 * double [] alturas
		 * int [] edadB
		 * 
		 * 
		 * 
		 * 
		 * */

		System.out.println("Introduce el número de árboles:");
		int numArboles = scanner.nextInt();
		double sumaAlturas = 0;
		double alturaMax = 0;
		double alturaMin = 0;
		double diametroMax = 0;
		double diametroMin = 0;
		double sumaEdadesB = 0;
		int contadorB = 0;
		boolean existeMasDe30m = false;

		for (int i = 0; i < numArboles; i++) {
			System.out.println("Introduce el tipo del árbol (A o B):");
			char tipo = scanner.next().charAt(0);

			System.out.println("Introduce el diámetro del tronco:");
			double diametro = scanner.nextDouble();

			System.out.println("Introduce la altura en metros:");
			double altura = scanner.nextDouble();

			sumaAlturas += altura;
			if (i == 0) {
				alturaMin = altura;
				alturaMax = altura;
				diametroMin = diametro;
				diametroMax = diametro;
			}
			if (altura > alturaMax) {
				alturaMax = altura;
			}
			if (altura < alturaMin) {
				alturaMin = altura;
			}
			if (diametro > diametroMax) {
				diametroMax = diametro;
			}
			if (diametro < diametroMin) {
				diametroMin = diametro;
			}
			if (altura > 30) {
				existeMasDe30m = true;
			}

			if (tipo == 'B' || tipo == 'b') {
				System.out.println("Introduce la edad del árbol:");
				int edad = scanner.nextInt();
				sumaEdadesB += edad;
				contadorB++;
			}
		}
		double media = sumaAlturas / numArboles;
		System.out.println("Media de las alturas de los árboles:" + media);
		System.out.println("Altura máxima:" + alturaMax);
		System.out.println("Altura mínima:" + alturaMin);
		System.out.println("Diámetro máximo:" + diametroMax);
		System.out.println("Diámetro mínimo:" + diametroMin);

		if (contadorB > 0) {
			System.out.println("Media de las edades de árboles del tipo B:" + (sumaEdadesB / contadorB));
		} else {
			System.out.println("No hay árboles del tipo B para calcular la media de edades.");
		}

		if (existeMasDe30m) {
			System.out.println("Existen árboles de más de 30 m.");
		}
	}
}

