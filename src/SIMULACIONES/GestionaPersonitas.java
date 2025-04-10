package SIMULACIONES;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GestionaPersonitas {

	public static void main(String[] args) {
		GestionaPersonitas p = new GestionaPersonitas();
		Map<Alumno, Nota> m = new HashMap<Alumno, Nota>();
		Alumno carla = new Alumno("Carla");
		Alumno pepe = new Alumno("Pepe");
		Alumno manuel = new Alumno("Manuel");
		Alumno antonio = new Alumno("Antonio");
		Alumno gustavo = new Alumno("Gustavo");
		Alumno pedro = new Alumno("Pedro");

		Nota n1 = new Nota(8);
		Nota n2 = new Nota(5);

		m.put(pedro, n1);
		m.put(pepe, n1);
		m.put(manuel, n2);
		m.put(gustavo, n2);
		m.put(gustavo, n1);
		float media = p.calculaNotaMedia(m);
		System.out.println(media);
		List<Alumno> alumnoPorEncimaMedia = p.getAlumnosPorEncima(media, m);
		System.out.println(alumnoPorEncimaMedia);

	}

	public float calculaNotaMedia(Map<Alumno, Nota> m) {
		float media = 0;
		Collection<Nota> notas = m.values();
		for (Nota n : notas) {
			media = media + n.getNota();
		}
		media = media / notas.size();
		return media;
	}

	public List<Alumno> getAlumnosPorEncima(float nota, Map<Alumno, Nota> m) {
		List<Alumno> alumnosPorEncima = new ArrayList<>();
		for (Map.Entry<Alumno, Nota> iteracion : m.entrySet()) {
			if (iteracion.getValue().getNota() > nota) {
				alumnosPorEncima.add(iteracion.getKey());
			}
		}
		return alumnosPorEncima;
	}

}
