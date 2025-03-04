package Modelo;

public abstract class AnimalAbs {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getSonidoQueEmite();

	public abstract String getAlimento();
}