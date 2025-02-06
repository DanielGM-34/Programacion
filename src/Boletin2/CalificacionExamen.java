package Boletin2;

import java.util.Scanner;

public class CalificacionExamen {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
	
		System.out.println("Introduce tu calificación: ");
		int nota=entrada.nextInt();
		
		if (nota >=90) {
			char letra='A';
			System.out.println(letra);
		}
		
		else if (nota >=80) {
			char letra='B';
			System.out.println(letra);
		}
		
		else if (nota>=70) {
			char letra='C';
			System.out.println(letra);
		}
		
		else if (nota >=60) {
			char letra='D';
			System.out.println(letra);
		}

		else {
			char letra='F';
			System.out.println(letra);
		}
				
	}

}
