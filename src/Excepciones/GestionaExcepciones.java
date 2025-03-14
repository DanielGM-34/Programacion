package Excepciones;

import java.io.IOException;

public class GestionaExcepciones {

	public static void main(String[] args) throws IOException {
		GeneraExcepcion g = new GeneraExcepcion();
		//g.generaIOException();
		g.generaInputMismatchException();
		
		
	}

}