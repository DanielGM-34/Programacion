package EjercicioVechiculos.copy;

public class GestionaVehiculos {

	public static void main(String[] args) {
		Vechiculo coche = new Vechiculo("Renault", "Clio", 2015, "gasolina", 50, 550, 6.4F);
		Vechiculo coche2 = new Vechiculo("Hyundai", "i30", 2015, "gasolina", 50, 200, 6.4F);

		float consumoCoche1 = coche.calcularConsumo(5);
		boolean repostarCoche1 = coche.hayQueRepostar();
		System.out.println(repostarCoche1);
		System.out.println(consumoCoche1);
		
		System.out.println();
	

		float consumoCoche2 = coche2.calcularConsumo(20);
		boolean repostarCoche2 = coche2.hayQueRepostar();
		System.out.println(repostarCoche2);
		System.out.println(consumoCoche2);

	}

}