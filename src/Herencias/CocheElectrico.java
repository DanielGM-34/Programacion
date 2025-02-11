package Herencias;

public class CocheElectrico extends Automovil{
	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	protected String tipoBateria;

	public CocheElectrico(String dueno, int numPuertas, int numRuedas, String calificacionEcologica, String tipoBateria) {
		super(dueno,numPuertas,numRuedas,calificacionEcologica);
		if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
			this.tipoBateria = tipoBateria;
		}

		else {
			this.tipoBateria = "LFP";
		}
	}

	@Override
	public String toString() {
		return "CocheElectrico [tipoBateria=" + tipoBateria + ", dueno=" + dueno + ", numPuertas=" + numPuertas
				+ ", numRuedas=" + numRuedas + "]";
	}

	public void imprimeResumen() {
		this.toString();
	}
	
}