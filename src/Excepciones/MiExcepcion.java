package Excepciones;

import java.util.Arrays;

public class MiExcepcion extends Exception {

	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	

	@Override
	public String toString() {
		return "MiExcepcion [getMessage()=" + getMessage() + "]";
	}

	

}