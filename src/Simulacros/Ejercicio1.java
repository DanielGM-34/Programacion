package Simulacros;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Funciones que usaré en cada opción:
	 * 
	 * muestraMenu: mostrará el menu y devolverá la opción.
	 * 
	 * 
	 * pedirNumApuesta: recibe el numero al que quieres apostar y devuelve el numero del dado.
	 * 
	 * pedirCantidadApuesta recibe el la cantidad a apostar y devuelve la cantidad de dinero.
	 * 
	 * mostrarResultadoDados recibe el numero a apostar, el dinero a apostar y un objeto random. y devuelve la suma de los dados y el número que ha puesto el usuario 
	 * y la cantidad de dinero apostada si ha acertado y si no, hace un syso de la cantidad apostada perdida.
	 * 
	 * mostrarHistorial no recibe ni devuelve nada, muestra el historial de partidas jugadas, la suma de los dados y las ganancias o pérdidas.
	 * 
	 * mostrarSaldoTotal no recibe ni devuelve nada, muestra la cantidad que ha ganado o perdido el usuario 
	 * 
	 * */
	
	
	String[][] historial = new String[100][3];
	int numJugadas = 0;
	float saldoTotal = 0;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ejercicio1 sc = new Ejercicio1();
		Random aleatorioR = new Random();
		int opcion;

		do {
			opcion = sc.mostrarMenu(entrada);
			switch (opcion) {
			case 1:
				int numApuesta = sc.pedirNumApuesta(entrada);
				float dineroApuesta = sc.pedirCantidadApuesta(entrada);
				sc.mostrarResultadoDados(numApuesta, dineroApuesta, aleatorioR);
				break;
			case 2:
				sc.mostrarHistorial();
				break;
			case 3:
				sc.mostrarSaldoTotal();
				System.out.println("Gracias por jugar, vuelve pronto ;)");
				break;
			default:
				System.out.println("Opción no válida (;-;)");
			}
		} while (opcion != 3);

	}

	int mostrarMenu(Scanner entrada) {
		System.out.println("1. Apostar.");
		System.out.println("2. Mostrar historial.");
		System.out.println("3. Retirarse.");
		System.out.print("Elige una opción: (1/2/3): ");
		int opcion=entrada.nextInt();
		return opcion;
	}

	int pedirNumApuesta(Scanner entrada) {
		System.out.print("Introduce el número al que quieres apostar: ");
		int numApuesta = entrada.nextInt();
		return numApuesta;
	}

	float pedirCantidadApuesta(Scanner entrada) {
		System.out.print("Introduce la cantidad que estás dispuesta a perder: ");
		float  CantidadDinero = entrada.nextFloat();
		return CantidadDinero;
	}

	void mostrarResultadoDados(int numApuesta, float dineroApuesta, Random aleatorioR) {
		int dado1 = aleatorioR.nextInt(6) + 1;
		int dado2 = aleatorioR.nextInt(6) + 1;
		int sumaDados = dado1 + dado2;

		String resultado="";
		if (numApuesta == sumaDados) {
			saldoTotal += dineroApuesta * 2;
			resultado = "ganaste " + (dineroApuesta * 2) + "€";
		} else {
			saldoTotal -= dineroApuesta;
			resultado = "perdiste " + dineroApuesta + "€";
		}
		historial[numJugadas][0] = String.valueOf(numApuesta); 
		historial[numJugadas][1] = String.valueOf(sumaDados);
		historial[numJugadas][2] = resultado;
		numJugadas++;

		System.out.println("Los dados han salido: " + dado1 + " y " + dado2 + ". La suma es " + sumaDados + ".");
		System.out.println("Has puesto el número " + numApuesta + " y la suma de los dados es " + sumaDados + ", " + resultado);
	}

	void mostrarHistorial() {
		if (numJugadas == 0) {
			System.out.println("No hay historial de jugadas.");
		} else {
			for (int i = 0; i < numJugadas; i++) {
				System.out.println("En la " + (i + 1) + "º jugada, apostó al valor " + historial[i][0] + " y sumó " + historial[i][1] + ", " + historial[i][2] + ".");
			}
		}
	}

	void mostrarSaldoTotal() {
		System.out.println("El saldo total neto (ganancias - pérdidas) es: " + saldoTotal + "€.");
	}
}