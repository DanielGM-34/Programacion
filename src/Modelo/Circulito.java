package Modelo;

public class Circulito extends Figura {
	public static final double PI = 3.14;
	private double radio;

	public Circulito(String color, double radio) {
		super(color);
		this.radio = radio;
	}


	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static double getPi() {
		return PI;
	}


	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return PI * (radio * radio);
	}

}
