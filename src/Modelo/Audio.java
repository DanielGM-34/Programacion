package Modelo;

public class Audio extends ElementosMultimedia {
	private int duracion;

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Audio(String ubicacion, String nombre, String genero, int duracion) {
		super(ubicacion, nombre, genero);
		this.duracion = duracion;
	}

	@Override
	public int duracion() {
		return this.duracion;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

}
