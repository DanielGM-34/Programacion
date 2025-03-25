package ExamenSorayaEjercicio2;

public class RutaTerrestre extends RutaBase {
	public RutaTerrestre(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm, boolean siEsCarretera) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.siEsCarretera = siEsCarretera;
	}

	private boolean siEsCarretera;
	private final double costeCienKm = 0.65;

	public boolean isSiEsCarretera() {
		return siEsCarretera;
	}

	public void setSiEsCarretera(boolean siEsCarretera) {
		this.siEsCarretera = siEsCarretera;
	}

	public double getCosteCienKm() {
		return costeCienKm;
	}

	@Override
	public double getCoste() {
		double coste = this.getDistanciaKm() * costeCienKm;
		return coste;
	}

	@Override
	public String getTipoRuta() {
		String tipoRuta = "";
		if (this.isSiEsCarretera() == true) {
			tipoRuta = this.getClass().getName() + " - es carretera.";
		}

		else {
			tipoRuta = this.getClass().getName() + " - tren.";
		}
		return tipoRuta;
	}
 
}
