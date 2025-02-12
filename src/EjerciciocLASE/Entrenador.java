package EjerciciocLASE;

import java.util.Objects;

public class Entrenador extends Persona{
			
	public Entrenador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entrenador(String nombre, String email, int edad, float salario, String idFederacion) {
		super(nombre, email, idFederacion, edad, salario);
		this.idFederacion = idFederacion;
	}
	
	public Entrenador(String nombre, String apellido, String email, int edad, float salario) {
		super(nombre, apellido, email, edad, salario);
		this.idFederacion = "ESP";
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse entrenador");
	}

	
	public void viajar() {
		System.out.println("Viajar entrenador.");
	}

	public void dirigirPartido() {
		System.out.println("Dirige partido Entrenador");
	}
	

	private String idFederacion;
	protected String getIdFederacion() {
		return idFederacion;
	}
	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idFederacion);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrenador other = (Entrenador) obj;
		return Objects.equals(idFederacion, other.idFederacion);
	}
	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", salario=" + getSalario() + "]";
	}
}