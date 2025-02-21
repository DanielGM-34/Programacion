package PruebaEvaluable;

public class GestionaEmpleados {

	public static void main(String[] args) {

		Empleado manuel = new Directivo("Juan", "87654321B", 2800, 15);
		System.out.println(manuel);

		Empleado carlos = new Administrativo("Carlos", "87654321B", 1200, 40);
		System.out.println(carlos);
		
		System.out.println(manuel.equals(carlos));
		
	}
}