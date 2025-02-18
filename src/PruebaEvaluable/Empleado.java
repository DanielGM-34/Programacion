package PruebaEvaluable;

import java.util.Objects;

public class Empleado {
	private String nombre;
	private String dni;
	private float salario;

	public Empleado(String nombre, String dni, float salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
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

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
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
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	
	public void calcularSalarioBase() {
		boolean valido=false;
		if(salario>0) {
			valido=false;
			this.salario=salario;
		}
		else {
			valido=true;
			this.salario= salario+0;
		}
	}
}