package Recuperacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grupo {
	private int id;
	private String descripcion;
	private List<Estudiante> estudiantes;

	public Grupo(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.estudiantes = new ArrayList<Estudiante>();
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

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", descripcion=" + descripcion + ", estudiantes=" + estudiantes + "]";
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

	public void agregarEstudiante(Estudiante a) {
		this.getEstudiantes().add(a);
	}

}
