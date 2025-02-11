package EjemploPersonasEjercicioClase;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
	private LocalDate fechaFinContrato;

	public ProfesorInterino(String nombre, String nombreDepartamento, LocalDate fechaFinContrato) {
		super(nombre, nombreDepartamento);
		this.fechaFinContrato = fechaFinContrato;
	}

	protected LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}

	protected void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaFinContrato=" + fechaFinContrato + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}

	
	
	
}
