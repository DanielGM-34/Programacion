package Boletin1;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		//String num_a_mult=JOptionPane.showInputDialog("Introduce un número a multiplicar: ");
		//int num_entero=Integer.parseInt(num_a_mult);
		
		

		Scanner entrada = new Scanner(System.in);

		int num = 1;

		int n;
		System.out.println("Pon un número para realizar su tabla de multiplicar: ");
		n = entrada.nextInt();

		while (num <= 10) {
			int tabla = n * num;
			System.out.println(n + " x " + num + " = " + tabla);
			num++;

		}
	}

}
