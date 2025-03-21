package Modelo.Deportistas;

import java.time.LocalDate;

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
	public double getCaloriasNecesarias() {
		double kcal = this.getPeso() * 50;

		return kcal;
	}

	@Override
	public double getTiempoPrueba(LocalDate fechaCal) {
		// TODO Auto-generated method stub
		return 0;
	}

}