package Excepciones;

import java.util.Arrays;

public class MiExcepcion extends Exception {

	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public void metodo1(int n2) throws MiExcepcion {
		try {
			if (n2 % 2 != 0) {
				throw new MiExcepcion("Lanzando mis excepciones.");
			}
 
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}}

	@Override
	public String toString() {
		return "MiExcepcion [getMessage()=" + getMessage() + "]";
	}

	

}