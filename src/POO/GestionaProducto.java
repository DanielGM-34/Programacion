package POO;

public class GestionaProducto {

	public static void main(String[] args) {
		Producto chocolate= new Producto();
		
		chocolate.nombre="Chocolate";
		chocolate.precioVenta=1.5f;
		chocolate.unidades=2;
		
		boolean pedir= chocolate.PedirUnidades();
		
		int unidades = chocolate.aumentaUnds(chocolate,pedir);
		System.out.println("Hay " + chocolate.unidades + " del producto" + chocolate.nombre);
		System.out.println("Nuevas unidades: "+unidades);
		chocolate.unidades=unidades;
		System.out.println(chocolate.unidades);
		
		
		String cadena=chocolate.pasoCadena(chocolate.unidades);
		System.out.println(cadena);
		
		
		
		
		
	}
	
}