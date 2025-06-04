package EjercicioEquiposB1Listas;

import java.util.Set;
import java.util.TreeSet;

public class Equipo {
	private String nombreEquipo;
	private Set<Alumno> grupoAlumnos;

	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.grupoAlumnos = new TreeSet<Alumno>();
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
			DeportivosException p2 = new DeportivosException("El alumno que quieres eliminar no existe.");
			throw p2;
		
		}
		return existe;
	}

	public String siExiste(Alumno p) {
	    return grupoAlumnos.contains(p) ? "El alumno " + p.getNombre() + " pertenece al equipo " + this.getNombreEquipo() : "Alumno no encontrado llamado " + p.getNombre();
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", grupoAlumnos=" + grupoAlumnos + "]";
	}
	
	public Equipo unirEquipos(Equipo otroEquipo) {
	    Equipo equipoUnido = new Equipo(this.nombreEquipo + " y " + otroEquipo.getNombreEquipo());
	    equipoUnido.getGrupoAlumnos().addAll(this.grupoAlumnos); 
	    equipoUnido.getGrupoAlumnos().addAll(otroEquipo.getGrupoAlumnos()); 
	    return equipoUnido;
	}
	
	public Equipo interseccionEquipos(Equipo otroEquipo) {
	    Equipo equipoInterseccion = new Equipo(this.getNombreEquipo() + " y " + otroEquipo.getNombreEquipo());
	    equipoInterseccion.grupoAlumnos.addAll(this.getGrupoAlumnos()); 
	    equipoInterseccion.grupoAlumnos.retainAll(otroEquipo.grupoAlumnos);
	    
	    if (equipoInterseccion.grupoAlumnos.isEmpty()) {
	        System.out.println("No hay alumnos en común entre los equipos.");
	    }
	    
	    return equipoInterseccion;
	}




}
