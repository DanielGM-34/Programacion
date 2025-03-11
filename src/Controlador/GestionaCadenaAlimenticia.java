package Controlador;

import java.util.Arrays;

import Modelo.*;

public class GestionaCadenaAlimenticia {

	public static void main(String[] args) {

		Animal2[] atacaLeon = { new Leon() };
		Animal2[] atacaRoedor = { new Roedor(), new Rapaz() };
		Animal2[] atacaRapaz = { new Rapaz() };
		Animal2[] atacaSerpiente = { new Serpiente() };

		Animal2 a1 = new Serpiente("Cobra", Familia.serpiente, "selva", atacaLeon, atacaRoedor);
		System.out.println(a1);
		Animal2 a2 = new Rapaz("Águila", Familia.rapaz, "selva", null, null);

		Animal2 a3 = new Roedor("Mickey", Familia.roedor, "casa", null, null);
		Animal2 a4 = new Leon("León", Familia.leon, "amazonas", null, null);

		System.out.println("Serpiente");
		System.out.println(a1.atacar(a3));
		System.out.println(a1.huir(a4));

		System.out.println();

		System.out.println("Rapaz");
		System.out.println(a2.atacar(a4));
		System.out.println(a2.huir(a4));

		System.out.println();

		System.out.println("Roedor");
		System.out.println(a3.atacar(a4));
		System.out.println(a3.huir(a4));

		System.out.println();

		System.out.println("Leon");
		System.out.println(a4.atacar(a4));
		System.out.println(a4.huir(a1));

		System.out.println(Arrays.toString(a1.getAnimalComido()));
		System.out.println(Arrays.toString(a1.getAnimalQuehEComido()));
	}
}