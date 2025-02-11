package EjemploPersonasEjercicioClase;

public class Profesor extends Personas {
	protected String nombreDepartamento;
	private double sueldo;

	protected double getSueldo() {
		return sueldo;
	}

	protected void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Profesor(String nombre, String nombreDepartamento) {
		super(nombre);
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombreDepartamento=" + nombreDepartamento + ", sueldo=" + sueldo + ", getNombre()="
				+ getNombre() + "]";
	}

	

}