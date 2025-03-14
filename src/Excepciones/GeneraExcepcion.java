package Excepciones;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneraExcepcion {

	public void generaIOException() throws IOException {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("En el catch de IOException");
			throw e;
		}
		// TODO Auto-generated method stub

	}

	public void generaInputMismatchException() throws InputMismatchException {

		try {
			throw new InputMismatchException();
		} catch (InputMismatchException p) {
			System.out.println("En el catch de InputMismatchException");
			throw p;
		}
	}
}