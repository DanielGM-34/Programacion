package EJERCICIORAFA;

import java.util.Objects;

public class Provincias {
	private String nombre;
	private int poblacion;

	public Provincias(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Provincias [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincias other = (Provincias) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
