package EjercicioBibliotecaSinPrestamo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> listaLibros;

	public Biblioteca(List<Libro> listaLibrosBiblioteca) {
		this.listaLibros = new ArrayList<>();
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Biblioteca [listaLibros=" + listaLibros + "]";
	}

	public void anyadirLibro(Libro l) {
		listaLibros.add(l);
	}

	public Libro buscarLibro(String titulo) {
		Libro libroEncontrado = null;

		for (Libro libro : listaLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				libroEncontrado = libro;
			}
		}

		return libroEncontrado;
	}

	public List<Libro> buscarLibroAutor(String autor) {
		List<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : listaLibros) {
			if (libro.getAutor().equalsIgnoreCase(autor)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}
}
