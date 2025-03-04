package Modelo;

public class Cuadrado extends Figura {

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}