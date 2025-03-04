package Modelo;

public class Canario extends Aves {
	public Canario(boolean pico, boolean vuela, String color, boolean canta) {
		super(pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	private String color;
	private boolean canta;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
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