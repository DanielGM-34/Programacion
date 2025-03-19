package Modelo;

import java.util.Objects;

public abstract class AEmpleado implements INomina {
	private String nombre;
	private String identificador;
	private String apellidos;
	private float salario;
	private boolean tieneReduccionHoraria;
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isTieneReduccionHoraria() {
		return tieneReduccionHoraria;
	}

	public void setTieneReduccionHoraria(boolean tieneReduccionHoraria) {
		this.tieneReduccionHoraria = tieneReduccionHoraria;
	}

	public AEmpleado() {
		super();
	}

	public AEmpleado(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.apellidos = apellidos;
		this.salario = salario;
		this.tieneReduccionHoraria = tieneReduccionHoraria;
		this.categoria = categoria;
	}

	public abstract String[] devuelveFunciones();

	public abstract void imprimeHorario();

	@Override
	public String toString() {
		return "AEmpleado [nombre=" + nombre + ", identificador=" + identificador + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	protected int calculaElementosDeUnaTabla(String[] tabla) {
		int contador = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] != null) {
				contador = contador + 1;
			}

		}
		return contador;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AEmpleado other = (AEmpleado) obj;
		return Objects.equals(identificador, other.identificador);
	}

}