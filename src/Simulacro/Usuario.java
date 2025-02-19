package Simulacro;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private String dni;
	private String nombreDep;

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombreDep() {
		return nombreDep;
	}

	protected void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}

}

/*
 * 1. Identificar clases 2. UML 3.
 */