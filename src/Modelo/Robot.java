package Modelo;

import java.util.Objects;

public abstract class Robot {
	private static int contador;
	private int identificador;
	private String nombre;
	private int bateria;
	private Estado estado;
	private String combustible;
	private String descripcion;

	public Robot(String nombre, int bateria, Estado estado, String combustible, String descripcion) {
		super();
		this.identificador = contador;
		this.nombre = nombre;
		setBateria(bateria);
		this.estado = estado;
		this.combustible = combustible;
		this.descripcion = descripcion;
		contador = contador + 1;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Robot.contador = contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		if (bateria > 10) {
			System.out.println("Tiene batería suficiente.");
			this.bateria = bateria;
		} else {
			System.out.println("No hay batería suficiente.");
			this.bateria = 10;
		}
	}

	@Override
	public String toString() {
		return "Robot [identificador=" + identificador + ", nombre=" + nombre + ", bateria=" + bateria + ", estado="
				+ estado + "]";
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
		Robot other = (Robot) obj;
		return identificador == other.identificador;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract String ejecutarTarea();

	public abstract boolean recargar();
}
