package Modelo;

public class Juego extends ElementosMultimedia {
	private int numFases;

	public Juego(String ubicacion, String nombre, String genero, int numFases) {
		super(ubicacion, nombre, genero);
		this.numFases = numFases;
	}

	@Override
	public int duracion() {
		return this.numFases;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getNumFases() {
		return numFases;
	}

	public void setNumFases(int numFases) {
		this.numFases = numFases;
	}

}