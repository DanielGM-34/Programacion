package Excepciones;

import java.io.IOException;
import java.util.Scanner;

public class GestionaExcepciones {

	public static void main(String[] args) throws IOException {
		GestionaExcepciones g = new GestionaExcepciones();
	//g.generaIOException();
		
//		g.generaInputMismatchException();
		Scanner n = new Scanner(System.in);
		int num1= n.nextInt();
		try {
			g.metodo1(num1);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	
		
		
	}



public void metodo1(int n2) throws MiExcepcion {
	try {
		if (n2 % 2 != 0) {
			throw new MiExcepcion("Lanzando mis excepciones.");
		}
		else {
			System.out.println("Es par.");
		}

	} catch (MiExcepcion e) {
		System.out.println(e.getMessage());
		throw e;
	}}}