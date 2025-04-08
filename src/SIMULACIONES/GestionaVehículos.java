package SIMULACIONES;

public class GestionaVehículos {

	public static void main(String[] args) {
		RegistroTrafico registro = new RegistroTrafico();

		Vehiculo vehiculo1 = new Vehiculo("1ABC23", "1234ABC", "Toyota", "Corolla", 2015, "Juan Pérez");
		Vehiculo vehiculo2 = new Vehiculo("2XYZ45", "5678XYZ", "Ford", "Fiesta", 2018, "María Gómez");

		Vehiculo vehiculo3 = new Vehiculo("VIN003", "3333CCC", "Honda", "Civic", 2020, "Carlos Ruiz");
		Vehiculo vehiculo4 = new Vehiculo("VIN004", "4444DDD", "BMW", "X5", 2022, "Laura Fernández");
		Vehiculo vehiculo5 = new Vehiculo("VIN005", "5555EEE", "Mercedes", "Clase C", 2017, "Ana López");

		registro.registrarVehiculo(vehiculo1);
		registro.registrarVehiculo(vehiculo2);
		registro.registrarVehiculo(vehiculo3);
		registro.registrarVehiculo(vehiculo4);
		registro.registrarVehiculo(vehiculo5);
		System.out.println(registro.buscarPorPropietario("Carlos Ruiz"));

		System.out.println("🐀 Vehículos registrados:");
		System.out.println(registro.buscarVehiculo("VIN003"));
		System.out.println(registro.buscarVehiculo("VIN004"));
		System.out.println(registro.buscarVehiculo("VIN005"));

	}
}
