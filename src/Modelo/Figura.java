package Modelo;

public abstract class Figura {
	private String color;

	public abstract double calculaArea();

	public String getColor() {
		return color;
	}

	public Figura(String color) {
		super();
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}