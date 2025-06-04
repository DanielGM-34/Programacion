package EjercicioInstitutoB1Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instituto {
	private List<Grupo> Listagrupos;

	public Instituto() {
		super();
		Listagrupos = new ArrayList<Grupo>();
	}

	public List<Grupo> getListagrupos() {
		return Listagrupos;
	}

	public void setListagrupos(List<Grupo> listagrupos) {
		Listagrupos = listagrupos;
	}

	@Override
	public String toString() {
		return "Instituto [Listagrupos=" + Listagrupos + "]";
	}

	public void agregarGrupo(Grupo a) {
		this.getListagrupos().add(a);
	}

	public Grupo obtenerGrupoPorDescripcion(String descripcion) throws GrupoException {
		Grupo encontrado = null;
		Iterator<Grupo> iterarGrupos = this.getListagrupos().iterator();

		while (iterarGrupos.hasNext()) {
			Grupo grupo = iterarGrupos.next();
			if (grupo.getDescripcion().equals(descripcion)) {
				encontrado = grupo;
			}
		}

		if (encontrado == null) {
			throw new GrupoException("Grupo no encontrado");
		}
		return encontrado;
	}

	public Estudiante obtenerEstudiantePorId(int id) throws EstudianteException {
		Estudiante encontrado = null;
		Iterator<Grupo> iteradorGrupos = Listagrupos.iterator();

		while (iteradorGrupos.hasNext()) {
			Grupo grupo = iteradorGrupos.next();
			Iterator<Estudiante> iteradorEstudiantes = grupo.getEstudiantes().iterator();

			while (iteradorEstudiantes.hasNext()) {
				Estudiante estudiante = iteradorEstudiantes.next();
				if (estudiante.getId() == id) {
					encontrado = estudiante;
				}
			}
		}

		if (encontrado == null) {
			throw new EstudianteException("Estudiante no encontrado");
		}

		return encontrado;
	}

}
