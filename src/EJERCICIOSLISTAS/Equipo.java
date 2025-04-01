package EJERCICIOSLISTAS;

import java.util.HashSet;
import java.util.Set;

public class Equipo{
	private String nombreEquipo;
	private Set<Alumno> grupoAlumnos = new HashSet<Alumno>();

	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		grupoAlumnos = new HashSet<Alumno>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Set<Alumno> getGrupoAlumnos() {
		return grupoAlumnos;
	}

	public void setGrupoAlumnos(Set<Alumno> grupoAlumnos) {
		this.grupoAlumnos = grupoAlumnos;
	}

	public boolean agregaAlumno(Alumno p) throws DeportivosException {
		boolean agregado = false;

		if (grupoAlumnos.contains(p)) {
			throw new DeportivosException("Alumno repetido.");
		} else {
			agregado = grupoAlumnos.add(p);
		}
		return agregado;
	}

	public boolean deleteAlumno(Alumno p) throws DeportivosException {
		boolean existe = false;
		if (grupoAlumnos.contains(p)) {
			grupoAlumnos.remove(p);
			existe = true;
		} else {
			existe = false;
			throw new DeportivosException("El alumno que quieres eliminar no existe.");
		}
		return existe;
	}

	public Alumno siExiste(Alumno p) {
		boolean esta = false;
		Alumno i = null;
		if (grupoAlumnos.contains(p)) {
			esta = true;
		} else {
			grupoAlumnos.add(null);
			esta = false;
		}

		if (esta == true) {
			i = p;
		}

		else {
			i = null;
		}
		return i;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", grupoAlumnos=" + grupoAlumnos + "]";
	}

}
