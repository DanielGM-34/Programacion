package EjerciciocLASE;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;
	private int edad;
	private float salario;
	
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected float getSalario() {
		System.out.println("Get salario de persona");
		return salario;
	}
	

	
	
	protected void setSalario(float salario) {
		this.salario = salario;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre,String apellido, String email, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.apellido=apellido;
		this.email = email;
		this.edad = edad;
		this.salario = salario;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse persona");
	}

	public void concentrarse( String lugar) {
		System.out.println("Concentrarse persona lugar: " + lugar);
	}

	public void concentrarse( int dias) {
		System.out.println("Concentrarse persona dias: " + dias);
	}

	public void viajar() {
		System.out.println("Viajar persona.");
	}

	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, email, nombre, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}
	
	
	
	
	
}
