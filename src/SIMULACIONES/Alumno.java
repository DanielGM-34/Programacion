package SIMULACIONES;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	private String nombre;

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
}
