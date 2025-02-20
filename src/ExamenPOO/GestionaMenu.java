package ExamenPOO;

import java.time.LocalDate;

public class GestionaMenu {

	public static void main(String[] args) {
		Menu p1 = new Menu("Jueves Febrero Veggies", 900, 65.0, 100, TipoDieta.VEGANO, 20, 5, false, LocalDate.now(),
				0);
		Menu p2 = new Menu("Jueves Febrero Veggies", 6500, 65.0, 100, TipoDieta.SIN_GLUTEN, 9, 5, false,
				LocalDate.now(), 0);
		Menu p3 = new Menu("Jueves Febrero Veggies", 6500, 65.0, 100, TipoDieta.SIN_LACTOSA, 15, 5, false,
				LocalDate.now(), 0);

		Cliente cl1 = new Cliente("12345678A", "Pepe", "Lopez", 19, TipoDieta.VEGANO, LocalDate.now(), true);
		Cliente cl2 = new Cliente("12345678A", "Jose", "Martinez", 66, TipoDieta.SIN_GLUTEN, LocalDate.now(), false);
		Cliente cl3 = new Cliente("12345678A", "Jose", "Martinez", 40, TipoDieta.SIN_GLUTEN, LocalDate.now(), false);

		/* Método equals con DNI */
		System.out.println(cl1.equals(cl2));
		System.out.println(cl1.hayQueHacerPromocion());

		System.out.println(p1.contieneCarne());
		System.out.println(p1.dietaBajaEnCal());
		System.out.println(p1);

	}

}