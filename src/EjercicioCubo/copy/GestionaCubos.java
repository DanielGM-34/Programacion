package EjercicioCubo.copy;

public class GestionaCubos {

	public static void main(String[] args) {
		Cubo pablo = new Cubo(4);
		
		pablo.imprimeAreaYVolumen();
		pablo.llenarCubo(6);
		pablo.vaciarCubo(4);
		pablo.vaciarCubo(3);
		pablo.llenarCubo(16);
		System.out.println();
		System.out.println(pablo);
	}
}