package ExamenJAVA;

import java.util.Scanner;

/*
 * Funciones:
 * 
 * introduceTexto= el usuario introducirá un texto.
 * 
 * funcion esvocal: validará si la palabra introducida es una vocal.
 * 
 * funcion devuelveTextoVocales devolverá las palabras si el booleano es verdadero.
 * 
 * */
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ejercicio1 sc = new Ejercicio1();
		String texto = sc.introduceTexto(entrada);
		System.out.println(texto);

		sc.esVocal(texto);
		boolean es = sc.esVocal(texto);
		sc.devuelveTextoVocales(texto, es);
	}

	String introduceTexto(Scanner entrada) {
		System.out.println("Introduce un texto:");
		String frase = entrada.nextLine();
		return frase;
	}

	boolean esVocal(String texto) {
		boolean es = false;
		String[] vocales = { "a", "e", "i", "o", "u" };

		for (int i = 0; i < texto.length(); i++) {
			if (texto.equals(vocales[i])) {
				es = true;
			} else {
				es = false;
			}
		}
		return es;
	}

	String devuelveTextoVocales(String frase, boolean es) {
		if (es == true) {
			String fraseConVocales = frase;
			frase = fraseConVocales;
		}
		return frase;
	}
}