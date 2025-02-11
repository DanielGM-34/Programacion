package Herencias;

public class GestionaVechiculos {

	public static void main(String[] args) {
		
        Vehiculo coche1 = new Automovil("Juan", 4, 0, "A+");
        Vehiculo coche2 = new Automovil("Juan", 4, 0, "A+");	
        Vehiculo camion1 = new Camion(null, 0, 0, 0, 0, 0);
      
        boolean esVehiculo = coche1 instanceof Vehiculo;
        boolean esCoche = coche1 instanceof Automovil;
        boolean esCamion = coche1 instanceof Camion;

        System.out.println("¿Es vehículo? "+ esVehiculo);
        System.out.println("¿Es coche? "+ esCoche);
        System.out.println( "¿Es camión? "+ esCamion);
        
        
			
		}
	}
