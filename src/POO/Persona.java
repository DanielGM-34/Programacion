package POO;

public class Persona {
	String nombre;
	String apellidos;
	public String dni;
	int edad;

	public Persona(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad " + edad + "]";

	}

}
