package Modelo.Deportistas;

public class Nadador extends Deportista {

	public Nadador(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super(nombre, pais, edad, peso, altura, pruebas);
	}

	@Override
	public void competir() {
		System.out.println("Nada.");
	}

	@Override
	public int getTiempoCalentamiento() {
		int tiempoCalentamiento = 120;
		return tiempoCalentamiento;
	}

	@Override
	public double getCaloriasNecesarias(double peso) {
		double kcal = peso * 100;

		return kcal;
	}

}