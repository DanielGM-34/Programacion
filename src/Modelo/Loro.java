package Modelo;

import java.time.LocalDate;

public class Loro extends Aves {
	private String origen;
	private boolean habla;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	public Loro(boolean pico, boolean vuela, String origen, boolean habla) {
		super(pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	public String muestra() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return super.volar();
	}
}