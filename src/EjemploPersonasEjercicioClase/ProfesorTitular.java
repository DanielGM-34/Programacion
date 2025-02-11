package EjemploPersonasEjercicioClase;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
	private LocalDate fechaAdjudicacion;

	public ProfesorTitular(String nombre, String nombreDepartamento, LocalDate fechaAdjudicacion) {
		super(nombre, nombreDepartamento);
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	protected LocalDate getFechaAdjudicacion() {
		return fechaAdjudicacion;
	}

	protected void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacion=" + fechaAdjudicacion + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}
}