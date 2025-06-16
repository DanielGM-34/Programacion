package repositorio;

import java.util.*;
import modelo.*;

public class PlataformaVideojuegos {

	// TODO Definir atributo plataforma usando estructura datos adecuada
	private Map<Juego, EstudioDesarrollo> plataforma;

	// TODO Justificar porqué eliges esta estructura
	// Hay que usar la estructura de treemap para que no haya repetidos y para
	// ordenar en el futuro.

	public PlataformaVideojuegos() {
		// TODO Inicializar atributo plataforma
		this.plataforma = new TreeMap<Juego, EstudioDesarrollo>();
	}

	public Map<Juego, EstudioDesarrollo> getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Map<Juego, EstudioDesarrollo> plataforma) {
		this.plataforma = plataforma;
	}

	public void agregarJuego(Juego juego, EstudioDesarrollo estudio) {
		// TODO: implementar
		this.plataforma.put(juego, estudio);

	}

	public Juego buscarJuego(String titulo, String añoPublicacion) {
		Juego juego = null;
		boolean encontrado = false;
		Iterator<Juego> listaJuegos = this.plataforma.keySet().iterator();
		while (listaJuegos.hasNext() && !encontrado) {
			Juego juego2 = listaJuegos.next();
			if (juego2.getTitulo().equals(titulo) && juego2.getAñoPublicacion().equals(añoPublicacion)) {
				encontrado = true;
				juego = juego2;
			}
		}

		// TODO: implementar método buscarJuego
		return juego;
	}

	public boolean cambiarEstado(String titulo, String añoPublicacion, EstadoJuego nuevoEstado) {
		boolean modificado = false;
		Iterator<Juego> listaJuegos = this.plataforma.keySet().iterator();
		while (listaJuegos.hasNext() && !modificado) {
			Juego juego2 = listaJuegos.next();
			if (juego2.getTitulo().equals(titulo) && juego2.getAñoPublicacion().equals(añoPublicacion)) {
				modificado = true;
				juego2.setEstado(nuevoEstado);
			}
		}

		// TODO: implementar
		return modificado;
	}

	public List<Juego> top3PorDescargas() {
		List<Juego> juegosMasDescargados = null;
		// TODO: implementar
		return juegosMasDescargados;
	}

	public List<Juego> filtrarPorPais(String pais) {
		// TODO: implementar usando Iterator
		return null;
	}

}
