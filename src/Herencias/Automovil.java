package Herencias;

public class Automovil extends Vehiculo {
	private String calificacionEcologica;

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public Automovil(String dueno, int numPuertas,int numRuedas, String calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + "]";
	}

	void imprimeResumen() {

	}

	boolean tieneLicenciaParaCircular(String ciudad) {
		
		return true;
	}
}
