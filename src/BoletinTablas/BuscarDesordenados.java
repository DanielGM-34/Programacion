package BoletinTablas;

import java.util.Scanner;

public class BuscarDesordenados {

	public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int[] tabla = {1, 3, 4, 7};

	      
	        System.out.print("Ingresa el número a buscar: ");
	        int elemento = entrada.nextInt();  

	        int resultado = -1; 
	        for (int i = 0; i < tabla.length; i++) {
	            if (tabla[i] == elemento) {
	                resultado = i; 
	            }
	        }

	        if (resultado == -1) {
	            for (int i = 0; i < tabla.length; i++) {
	                if (tabla[i] > elemento) {
	                    resultado = -i; 
	                }
	            }

	            if (resultado == -1) {
	                resultado = -(tabla.length);
	            }
	        }

	        System.out.println("Resultado: " + resultado);

	        entrada.close();
	    }
	}

	

