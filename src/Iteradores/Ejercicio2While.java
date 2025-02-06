package Iteradores;

import java.util.Scanner;

public class Ejercicio2While {

	public static void main(String[] args) {


			
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduce un número de filas: ");
	int fila= entrada.nextInt();
	
	String espacios =" ";
	
	for(int i=1;i<=fila;i++) {
		
		System.out.println(espacios+espacios+"*");
		
	}
	
	System.out.println("_||_");

	}
}
					
		
	

