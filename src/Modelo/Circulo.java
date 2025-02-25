package Modelo;

public class Circulo {
	private double radio;
	public static final double PI = 3.141621;
	private int id;
	private static int contador;

	public Circulo(double radio) {
		super();
		this.radio = radio;
		this.id = contador + 1;
		contador = contador + 1;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", id= " + id + ", área= " + this.calculaArea() + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calculaArea() {
		return PI * this.radio * this.radio;
	}

}