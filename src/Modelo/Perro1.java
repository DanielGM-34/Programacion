package Modelo;

import java.time.LocalDate;

public class Perro1 extends Mascota {
	private String raza;
	private boolean pulgas;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	public Perro1(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String muestra() {
		return toString();
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	boolean pulgas() {
		boolean tiene = true;
		boolean pulgas = isPulgas();
		if (pulgas == true) {
			tiene = true;
		}

		else {
			tiene = false;
		}
		return tiene;
	}

}