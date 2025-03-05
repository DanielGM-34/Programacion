package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", Clase()=" + getClass() + "]";
	}

	public Mascota(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract String muestra();

	public abstract boolean habla();

	public void cumpleanyo() {
		System.out.println(getFechaNacimiento());
	}

	public boolean morir() {
		boolean muerto = false;
		if (2025 - getFechaNacimiento().getYear() > 20) {
			muerto = true;
		}
		return muerto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(	this.getClass().getName());//devuelve el paquete);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
}