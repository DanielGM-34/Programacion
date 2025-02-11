package Herencias;

public class Vehiculo {
	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	protected String dueno;
	protected int numPuertas;
	protected int numRuedas;

	public int getNumRuedas() {
		return numRuedas; 
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public Vehiculo(String dueno, int numPuertas, int numRuedas) {
		super();
		this.dueno = dueno;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
	}
}
