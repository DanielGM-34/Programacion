package Excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio1BoletinExcp {
	public static void main(String[] args) {

		// Declaro objeto fichero
		File fichero = new File("salida.txt");
		// Lo creo si no existe

		try {
			boolean creado = fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}