package BoletinTablas;

public class Ejemplo {

	public static void main(String[] args) {

		int[] edad = new int[10];
		edad[0] = 1;
		edad[1] = 2;
		edad[2] = 3;
		System.out.println(edad);

		int[] tabla = { 1, 2, 3 };
		System.out.println(tabla);

		String[] coches = { "Volvo", "BMW", "Ford" };

		// POR POSICIÓN
		for (int i = 0; i < coches.length; i++)

			System.out.println(coches[i]);

		// POR VALOR
		for (String coche : coches) {
			System.out.println(coche);
		}

	}

}
