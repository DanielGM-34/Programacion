package Modelo.Deportistas;

public class Corredor extends Deportista {

	public Corredor(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super(nombre, pais, edad, peso, altura, pruebas);
	}

	@Override
	public void competir() {
		System.out.println("Corre.");
		// TODO Auto-generated method stub

	}

	@Override
	public int getTiempoCalentamiento() {
		int tiempoCalentamiento = 30;
		return tiempoCalentamiento;
	}

	@Override
	public double getCaloriasNecesarias(double peso) {
		double kcal = peso * 50;

		return kcal;
	}

}