package CADENAS;

import java.util.Scanner;
import java.util.Arrays;

public class EjemploCadenas {

	public static void main(String[] args) {
		
	//Arrays.toString();
	
		
		
		
		
		
		
		
		
		
//		Character c = ('a');
//		System.out.println(c);
//		
//		c.toString();
//		Character.isUpperCase(c);
//		String hola="HOLA";
//	
//		System.out.println(	hola.charAt(2));
//		
//		String cadena2="HOLAADIOS";
//		System.out.println(hola.concat(cadena2));
//		System.out.println(cadena2.contains("D"));
//		cadena2.startsWith(hola);
//		cadena2.endsWith(hola); 
//		
//		String s="Adios";
//		cadena2.equalsIgnoreCase(s);
//		
//		System.out.println(cadena2.indexOf("O"));
//		
//
//	
////		String[] palabras=cadena2.split(" ");
////		
////	for (String palabra:palabras) {
////			System.out.println(palabra);
////	}
//////		
////		
//		System.out.println("-" + cadena2.trim()+ "-");
//		//Devuelve la posición del caracter a buscar.
//		int posicion= cadena2.indexOf("O");
//		
//		 
//		String cadena= cadena2.substring(posicion);
//		System.out.println(cadena);
//		
//		cadena.lastIndexOf(posicion);
//		
//		cadena2.replaceAll("HOLA", "hola");
//		cadena2.compareTo(s );		
//		
//		
//		
//		
//		
//		
//		Character caracter='a';
//		//Devuelve a char
//		caracter.charValue();
//	
//		
//		
//		//apunta a otro espacio en memoria
//		String h="HOLA";	
//		h= h + " Y ADIOS";
//		
//		System.out.println(h);
//			
//		
//		
//		

//		String cadena = "Hello planet earth, a great planet";
//		// Reemplaza un elemento por otro
//		String cadena2 = cadena.replace("Hello", "Hola");
//
//		// Reemplaza todo.
//		String cadena3 = cadena.replaceAll(cadena, "PIPPI");
//		System.out.println(cadena2);
//		System.out.println("-" + cadena2.trim() + "-");
//
//		//
		EjemploCadenas r = new EjemploCadenas();
		//
		int suma = r.suma(4, 5);
		System.out.println(suma);

		String[] tabla = r.cargaTabla();
		r.inmprimeTabla(tabla);

		
		
		
		String [] palabras= r.cargaTabla();
		r.filtraNumeros(tabla);
		
		String[] nums= r.filtraNumeros(palabras);
		
		
	r.isCadenaEsNumero("1,2,3,4");
	System.out.println(r.isCadenaEsNumero("1234fgfgf"));

	System.out.println(r.isCadenaEsNumero("1234"));

	r.filtraNumeros(tabla);
		
	String [] minusculas= r.filtraPrimeraMinuscula(palabras);
	r.inmprimeTabla(minusculas);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	int suma(int x, int y) {
		return x + y;
	}

	String[] cargaTabla() {
		System.out.println("Pon una frase:");
		Scanner entrada = new Scanner(System.in);

		String frase = entrada.nextLine();
		String[] tabla = frase.split(" ");
		return tabla;
 
	}

	// No devuelve nada
	void inmprimeTabla(String[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}

	}

	String[] filtraNumeros(String[] tabla) {
		String[] numeros = new String[tabla.length];

		for (int i = 0; i < numeros.length; i++) {

			if (isCadenaEsNumero((tabla[i]))) {
				numeros[i] = tabla[i];
			}

		}
		return numeros;
	}

	boolean isCadenaEsNumero(String palabra) {
		boolean es = true;

		for (int i = 0; i < palabra.length(); i++) {
			Character c = palabra.charAt(i);
			es = es && Character.isDigit(c);

		}

		return es;
	}
	
	boolean isMinusculaPrimeraLetra(String palabra) {
		boolean esMin = false;

		if (Character.isLowerCase(palabra.charAt(0))) {
			esMin = true;
		}
		return esMin;
	}

	String[] filtraPrimeraMinuscula(String[] tabla) {
		String[] minusculas = new String[tabla.length];

		for (int i = 0; i < minusculas.length; i++) {

			if (isMinusculaPrimeraLetra(tabla[i])) {
				minusculas[i] = tabla[i];
			}

		}
		return minusculas;
	}
	
	
	String[] CargaNum(String[] tabla) {
		String[] numeros = new String[tabla.length];
		return numeros;
	}








	String realizaConversion(String palabra) {
		String palabraConvertida = "";
//		Convierto el primer caracter a Mayusculas
		palabra.charAt(0);
		
//		Si es una o lo cambio por 0
		palabra.replace("o", "0");
		
//		Cambio el último caracter a la longitud de la palabra
		palabra.charAt(palabra.length()-1);
		
		
		
		
		
		return palabraConvertida;
	}
	





	String[] convierteTabla(String[] palabras) {
		String[] convertidas = new String[palabras.length];
		return convertidas;
	}

}
















