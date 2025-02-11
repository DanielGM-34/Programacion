package EjemploPersonasEjercicioClase;

public class Personas {
	protected String nombre;
	public Personas(String nombre) {
		super();
		this.nombre = nombre;
	}


	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + "]";
	}
}
