package Excepciones;

import java.util.InputMismatchException;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			throw new InputMismatchException("InputMismatchException porque quiero");
		} catch (InputMismatchException e) {
			System.out.println("Ocurre una excepción: " + e.getMessage());
			// TODO: handle exception
		}
		System.out.println("Llego aquí");
		// TODO Auto-generated method stub
	}
}