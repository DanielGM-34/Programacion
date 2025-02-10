package Herencias;

public class CocheElectrico extends Automovil{
	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	private String tipoBateria;

	public CocheElectrico(String dueno, int numPuertas, int numRuedas, String calificacionEcologica, String tipoBateria) {
		super(dueno,numPuertas,numRuedas,calificacionEcologica);
		if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
			this.tipoBateria = tipoBateria;
		}

		else {
			this.tipoBateria = "LFP";
		}
	}
}