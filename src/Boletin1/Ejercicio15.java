package Boletin1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce dos números para operar:");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int sum = num1 + num2;
		int rest = num1 - num2;
		int division =  num1 / num2;
		int multiplicacion = num1 * num2;

		System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es " + sum);
		System.out.println("El resultado de la resta de " +num1 + " - "  + num2+  " es " + rest);
		System.out.println("El resultado de la multiplicación es " + multiplicacion);
		System.out.println("El resultado de la división de"+ num1 + " / " + num2 + " es " + division);
	}

}