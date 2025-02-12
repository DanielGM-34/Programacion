package Herencias;

public class GestionaVechiculos {

	public static void main(String[] args) {

		Automovil coche1 = new Automovil("Juan", 4, 4, "ECO");
		Automovil coche2 = new Automovil("Juan", 4, 0, "C");

		Camion camion1 = new Camion("Alberto", 2, 4, 500, 5, 2);
		Camion camion2 = new Camion("Pepe", 2, 4, 5000, 7, 2);

		boolean esVehiculo = coche1 instanceof Vehiculo;
		boolean esCoche = coche1 instanceof Automovil;

		// boolean esCamion = coche1 instanceof Camion;

		System.out.println("¿Es vehículo? " + esVehiculo);
		System.out.println("¿Es coche? " + esCoche);
		// System.out.println( "¿Es camión? "+ esCamion);
			
		System.out.println(coche1.tieneLimitaciónParaCircular("Madrid"));
		System.out.println(coche2.tieneLimitaciónParaCircular("Sevilla"));

		camion1.tipoLicencia();
		camion2.tipoLicencia();

		
	}
}