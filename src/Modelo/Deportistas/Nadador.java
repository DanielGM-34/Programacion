package Modelo.Deportistas;

import java.time.LocalDate;

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
	public double getCaloriasNecesarias() {
		double kcal = this.getPeso() * 100;

		return kcal;
	}

	@Override
	public double getTiempoPrueba(LocalDate fechaCal) {
		// TODO Auto-generated method stub
		return 0;
	}


}