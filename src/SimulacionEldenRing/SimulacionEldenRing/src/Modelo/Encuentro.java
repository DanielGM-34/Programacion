package SimulacionEldenRing.SimulacionEldenRing.src.Modelo;

import java.time.LocalDate;
import java.util.List;

public class Encuentro {
	private String nombre;
	private LocalDate fechaEncuentro;
	private int dificultad;
	private List<String> nombreEnemigos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaEncuentro() {
		return fechaEncuentro;
	}

	public void setFechaEncuentro(LocalDate fechaEncuentro) {
		this.fechaEncuentro = fechaEncuentro;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public List<String> getNombreEnemigos() {
		return nombreEnemigos;
	}

	public void setNombreEnemigos(List<String> nombreEnemigos) {
		this.nombreEnemigos = nombreEnemigos;
	}

	public Encuentro(String nombre, LocalDate fechaEncuentro, int dificultad, List<String> nombreEnemigos) {
		super();
		this.nombre = nombre;
		this.fechaEncuentro = fechaEncuentro;
		this.dificultad = dificultad;
		this.nombreEnemigos = nombreEnemigos;
	}

	@Override
	public String toString() {
		return "Encuentro [nombre=" + nombre + ", fechaEncuentro=" + fechaEncuentro + ", dificultad=" + dificultad
				+ ", nombreEnemigos=" + nombreEnemigos + "]";
	}

}
