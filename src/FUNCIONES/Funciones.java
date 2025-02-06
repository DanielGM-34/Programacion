package FUNCIONES;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		// SINTAXIS

		// public= visible, void no devuelve nada String[]--> tabla de cadenas, arg -->
		// par1

		Funciones f = new Funciones();
		int resultado = f.sumaNum(5, 6);

		System.out.println(resultado);
		
		String[] TablaNombres = f.generalistas();
		System.out.println(TablaNombres);

	}
	int sumaNum(int n1, int n2) {
		return n1+n2;
	}
	
	String [] generalistas() 
	{
		String nombres[]= new String[5];
		Scanner entrada= new Scanner(System.in);

		for (int i=0; i<nombres.length;i++) {
			System.out.println("Pon un nombre:");
			String nombre= entrada.next();
			nombres[i]=nombre;
		}
		return nombres;
	}
	public String quitaHackeo() {
		// TODO Auto-generated method stub
		return null;
	}
}