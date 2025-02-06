package Arrays;

public class Listas {

	public static void main(String[] args) {
		Listas funcion = new Listas();
		int[] entero1 = { 1, 2, 7, 29 };
		int[] entero2 = { 1, 2, 7, 22 };
		
		
		funcion.ComparaTabla(entero1, entero2);
	}
	

	boolean ComparaTabla(int[] tabla1, int[] tabla2) {
		if (tabla1.length != tabla2.length)
			System.out.println("No tienen la misma longitud");
		for (int i = 0; i < tabla1.length; i++) {
			if (tabla1[i] != tabla2[i])
				System.out.println("No son iguales");
			;
		}
		System.out.println("Son iguales");
		return true;

	}
}