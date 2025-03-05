package Modelo;

import java.time.LocalDate;

public class Gato1 extends Mascota {

	public Gato1(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	private String color;
	private boolean peloLargo;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return toString();
	}
	
	

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

}