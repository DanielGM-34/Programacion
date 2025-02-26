package Controlador;

import POO.Producto;

public class GestionaProducto {

	public static void main(String[] args) {
		Producto chocolate= new Producto();
		
		chocolate.setNombre("Chocolate");
		chocolate.setPrecioVenta(1.5f);
		chocolate.setUnidades(2);
		
		boolean pedir= chocolate.PedirUnidades();
		
		int unidades = chocolate.aumentaUnds(chocolate,pedir);
		System.out.println("Hay " + chocolate.getUnidades() + " del producto" + chocolate.getNombre());
		System.out.println("Nuevas unidades: "+unidades);
		chocolate.setUnidades(unidades);
		System.out.println(chocolate.getUnidades());
		
		
		String cadena=chocolate.pasoCadena(chocolate.getUnidades());
		System.out.println(cadena);
		
		
		
		
		
	}
	
}