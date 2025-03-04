package Modelo;

public class Aves {
	private boolean pico;
	private boolean vuela;

	public Aves(boolean pico, boolean vuela) {
		super();
		this.pico = pico;
		this.vuela = vuela;
	}

	public boolean isPico() {
		return pico;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public boolean volar() {
		boolean volar = true;
		if (this.isVuela() == true) {
			volar = true;
		} else {
			volar = false;
		}
		return volar;
	}
}