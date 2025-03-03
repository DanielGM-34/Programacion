package Controlador;

import java.util.Scanner;
import Modelo.CorreoElectronico;

public class GestionaCorreos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		CorreoElectronico[] correos = new CorreoElectronico[5];
		int contador = 0;

		while (contador != 5) {
			System.out.println("Introduce un correo: ");
			String correo = entrada.nextLine();

			if (CorreoElectronico.esCorreoValido(correo)) {
				CorreoElectronico c = new CorreoElectronico(correo);
				correos[contador] = c;
				System.out.println("Correo válido: " + c);
				contador = contador + 1;
			} else {
				System.out.println("Correo inválido, pon el correo de nuevo.");
			}
		}
		System.out.println("Correos válidos:");
		for (int i = 0; i < correos.length; i++) {
			System.out.println(correos[i]);
		}
	}
}