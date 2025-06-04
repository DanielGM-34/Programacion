package EjercicioInstitutoB1Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {
	private String nombre;
	private int id;
	private List<Double> notas;

	public Estudiante(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.notas = new ArrayList<Double>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", id=" + id + ", notas=" + notas + "]";
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
		Estudiante other = (Estudiante) obj;
		return id == other.id;
	}

	public void agregarNota(double nota) {
		this.getNotas().add(nota);
	}

	public double calcularPromedio() {
		double notaMedia = 0;
		if (this.getNotas().isEmpty()) {
			notaMedia = 0;

		} else {
			for (double nota : notas) {
				notaMedia += nota;
			}
		}
		return notaMedia / notas.size();
	}

}
