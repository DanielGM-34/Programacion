package POO;

import java.util.Scanner;

public class Producto {
	String nombre;
	int unidades;
	float precioVenta;

	String convierteCadena() {
		String cadena = "Nombre: " + nombre + " Unidades: " + unidades + "precio de venta: " + precioVenta;
		return cadena;
	}

	Boolean PedirUnidades() {
		boolean pedir = true;
		if (unidades < 3) {
			pedir = true;
		}

		else {
			pedir = false;
		}
		return pedir;
	}
	
	int aumentaUnds(Producto n1, boolean pedir) {
		int nuevasUnd = 0;
		Scanner entrada = new Scanner(System.in);
		if (pedir=true) {
			System.out.println("Introduce cuántas unidades quieres: ");
			nuevasUnd = entrada.nextInt();
			nuevasUnd = n1.unidades + nuevasUnd;
			entrada.close();
		}
		
		else {
			nuevasUnd = n1.unidades + nuevasUnd;
		}
		return nuevasUnd;
	}

	
	String pasoCadena(int unidades2) {
		String cadena= "" + unidades2;
		return cadena;
	}
}




//Hacer métodos hayquepedirUnds, pedirá unidades si es unds menor que 3.
//devuelve true or false.


/*Aumenta unds: recibe las nuevas unidades y delvuelve la suma de unidades antiguas con las nuevas.
 * 
 *  * 
 * */
 