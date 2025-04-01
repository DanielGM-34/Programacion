package BoletinListasOrdenadas;

import java.time.LocalDate;
import java.util.Objects;

public class Animal implements Comparable<Animal> {
	private String identificador;
	private String nombre;
	private String especie;
	private int edad;
	private ClasificacionComida tipoComida;
	private LocalDate fechaNacimiento;
	private double peso;
	private Medio tipoMedio;
	private clasificacicionGestacion tipoGestacion;

	public Animal(String identificador, String nombre, String especie, int edad, ClasificacionComida tipoComida,
			LocalDate fechaNacimiento, double peso, Medio tipoMedio, clasificacicionGestacion tipoGestacion) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.tipoComida = tipoComida;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.tipoMedio = tipoMedio;
		this.tipoGestacion = tipoGestacion;
	}

	public clasificacicionGestacion getTipoGestacion() {
		return tipoGestacion;
	}

	public void setTipoGestacion(clasificacicionGestacion tipoGestacion) {
		this.tipoGestacion = tipoGestacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(identificador, other.identificador);
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ClasificacionComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(ClasificacionComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Medio getTipoMedio() {
		return tipoMedio;
	}

	public void setTipoMedio(Medio tipoMedio) {
		this.tipoMedio = tipoMedio;
	}

	@Override
	public String toString() {
		return "Animal [identificador=" + identificador + ", nombre=" + nombre + ", especie=" + especie + ", edad="
				+ edad + ", tipoComida=" + tipoComida + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso
				+ ", tipoMedio=" + tipoMedio + "]";
	}

	@Override
	public int compareTo(Animal o) {
		return this.nombre.compareTo(o.nombre);
	}

}
