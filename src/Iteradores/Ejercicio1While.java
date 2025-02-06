package Iteradores;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {

		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int n= entrada.nextInt();
		String cadena ="";
		
		int i=1;
		for (i=1;i<=n;i++) {
		
		cadena=cadena+"*";
		
		System.out.println(cadena);
		
		}
		
	}

}