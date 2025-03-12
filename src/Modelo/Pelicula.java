package Modelo;

public class Pelicula extends ElementosMultimedia{
	private int duracionMinutos;


	public Pelicula(String ubicacion, String nombre, String genero, int duracionMinutos) {
		super(ubicacion, nombre, genero);
		this.duracionMinutos = duracionMinutos;
	}

	@Override
	public int duracion() {
		return this.duracionMinutos;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public double getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
}