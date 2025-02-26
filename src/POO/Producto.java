package POO;

import java.util.Scanner;

public class Producto {
	private String nombre;
	private int unidades;
	private float precioVenta;

	String convierteCadena() {
		String cadena = "Nombre: " + getNombre() + " Unidades: " + getUnidades() + "precio de venta: " + getPrecioVenta();
		return cadena;
	}

	public Boolean PedirUnidades() {
		boolean pedir = true;
		if (getUnidades() < 3) {
			pedir = true;
		}

		else {
			pedir = false;
		}
		return pedir;
	}
	
	public int aumentaUnds(Producto n1, boolean pedir) {
		int nuevasUnd = 0;
		Scanner entrada = new Scanner(System.in);
		if (pedir=true) {
			System.out.println("Introduce cuántas unidades quieres: ");
			nuevasUnd = entrada.nextInt();
			nuevasUnd = n1.getUnidades() + nuevasUnd;
			entrada.close();
		}
		
		else {
			nuevasUnd = n1.getUnidades() + nuevasUnd;
		}
		return nuevasUnd;
	}

	
	public String pasoCadena(int unidades2) {
		String cadena= "" + unidades2;
		return cadena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}




//Hacer métodos hayquepedirUnds, pedirá unidades si es unds menor que 3.
//devuelve true or false.


/*Aumenta unds: recibe las nuevas unidades y delvuelve la suma de unidades antiguas con las nuevas.
 * 
 *  * 
 * */
 