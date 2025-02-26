package Modelo;

public class Moneda {
	static final float EUROS = 0.95f;
	static final float DOLARES = 1.05f;

	public static float conversorDolar(float euros) {
		float conversionDolar = euros / DOLARES;
		return conversionDolar;
	}

	public static float conversorEuro(float dolar) {
		float conversionEuro = dolar * DOLARES;
		return conversionEuro;
	}
}