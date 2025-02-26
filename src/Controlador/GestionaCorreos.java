package Controlador;

import Modelo.CorreoElectronico;

public class GestionaCorreos {
	public static void main(String[] args) {
		boolean sigo = true;
		while (sigo) {
			int contador = 0;
			CorreoElectronico[] correos = new CorreoElectronico[5];
			if (CorreoElectronico.validaCorreo("ejemplo")) {

				CorreoElectronico c = new CorreoElectronico("ejemplo");
				correos[contador] = c;
				contador += 1;
			}
			sigo = contador != 5;
		}
		System.out.println(CorreoElectronico.validaCorreo("44"));
	}
}