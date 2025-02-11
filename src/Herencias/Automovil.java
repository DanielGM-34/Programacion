package Herencias;

public class Automovil extends Vehiculo {
	private String calificacionEcologica;

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public Automovil(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}

	void imprimeResumen() {
		this.toString();
	}

	public boolean tieneLimitaciónParaCircular(String ciudad) {
		boolean tiene = false;
		if (ciudad.equals("Barcelona") || ciudad.equals("Madrid") && getCalificacionEcologica().equals("B")
				|| getCalificacionEcologica().equals("C")) {
			tiene = true;

		}

		else if (ciudad.equals("Valencia") || ciudad.equals("Sevilla") && getCalificacionEcologica().equals("C")) {
		}
		return tiene;
	}
}