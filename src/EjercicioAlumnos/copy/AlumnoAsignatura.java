package EjercicioAlumnos.copy;

public class AlumnoAsignatura {
	public AlumnoAsignatura(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}

	String nombre;
	String apellidos;
	String email;
	public NotaAsignatura notaProg;
	public NotaAsignatura notaBD;

	public void ImprimeSiHaAprobado(String nombreAsignatura) {
		if (nombreAsignatura.equals("programacion")) {
			if (notaProg.calcularNotaMedia() >= 5) {
				System.out.println(nombre + " ha aprobado Programación.");
			} else {
				System.out.println(nombre + " no ha aprobado Programación.");
			}
		} else {
			if (notaBD.calcularNotaMedia() >= 5) {
				System.out.println(nombre + " ha aprobado Bases de Datos.");
			} else {
				System.out.println(nombre + " no ha aprobado Bases de Datos.");
			}
		}
	}
}