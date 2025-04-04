package Modelo.Agenda;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private String numTelef;

	public Contacto(String nombre, String apellidos, String email, String direccion, String numTelef) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.numTelef = numTelef;
	} 

	public Contacto(String nombre, String apellidos, String numTelef) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numTelef = numTelef;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", direccion=" + direccion
				+ ", numTelef=" + numTelef + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumTelef() {
		return numTelef;
	}

	public void setNumTelef(String numTelef) {
		this.numTelef = numTelef;
	}

	@Override 
	public int compareTo(Contacto otro) {
		int resultado = this.nombre.compareTo(otro.nombre);
		if (resultado == 0) {
			resultado = this.apellidos.compareTo(otro.apellidos);
		}
		return resultado;
	}
}
