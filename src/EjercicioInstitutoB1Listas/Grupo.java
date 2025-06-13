package EjercicioInstitutoB1Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grupo {
	private int id;
	private String descripcion;
	private String tutor;
	private String aula;
	private String horario;
	private List<Estudiante> estudiantes;

	public Grupo(int id, String descripcion, String tutor, String aula, String horario) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tutor = tutor;
		this.aula = aula;
		this.estudiantes = new ArrayList<Estudiante>();
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", descripcion=" + descripcion + ", tutor=" + tutor + ", aula=" + aula
				+ ", estudiantes=" + estudiantes + ", horario=" + horario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		return id == other.id;
	}

	public void agregarEstudiante(Estudiante estudiante) throws EstudianteException {
		if (!this.getEstudiantes().contains(estudiante)) {
			this.getEstudiantes().add(estudiante);
		} else {
			throw new EstudianteException("Estudiante ya está en la lista.");
		}
	}

	public double calcularPromedioGrupo() throws EstudianteException {
		double sumaNotas = 0;
		int totalNotas = 0;
		if (estudiantes.isEmpty()) {
			throw new EstudianteException("El grupo no tiene estudiantes.");
		}

		for (Estudiante estudiante : estudiantes) {
			for (double nota : estudiante.getNotas()) {
				sumaNotas += nota;
				totalNotas++;
			}
		}

		if (totalNotas == 0) {
			throw new EstudianteException("No hay notas registradas en este grupo.");
		}

		return sumaNotas / totalNotas;
	}

	public void verListaEstudiante() {
		System.out.println(getEstudiantes());
	}

}
