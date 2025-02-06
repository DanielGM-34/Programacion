package BoletinTablas;

public class comparaTablas {

	public static void main(String[] args) {

		int[] tabla1 = { 1, 2, 3, 4 };
		int[] tabla2 = { 1, 2, 4, 4 };
		int[] tabla3 = { 1, 2, 3, 4 };

		boolean sonIguales = true;

		// Comparar si todas las tablas tienen la misma longitud
		if (tabla1.length == tabla2.length && tabla2.length == tabla3.length) {

			for (int i = 0; i < tabla1.length; i++) {
				if (tabla1[i] != tabla2[i] || tabla1[i] != tabla3[i]) {
					sonIguales = false;
				}
			}
		} else {
			sonIguales = false;
		}

		if (sonIguales == true) {
			System.out.println("Son iguales");

		}
		
		else {
			System.out.println("No son iguales");
		}

	}

}
