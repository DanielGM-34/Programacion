package ExamenSorayaEjercicio2;

public class RutaAerea extends RutaBase {
	public RutaAerea(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm, TipoVuelo tipo) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKm);
		this.tipo = tipo;
	}

	private TipoVuelo tipo;
	
	public TipoVuelo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVuelo tipo) {
		this.tipo = tipo;
	}

	@Override
	public double getCoste() {
		double coste = 0;
		if (this.getTipo() == TipoVuelo.LOW_COST) {
			coste = 0.75 * this.getDistanciaKm();
		}

		else if (this.getTipo() == TipoVuelo.NORMAL) {
			coste = 1.1 * this.getDistanciaKm();
		}

		else if (this.getTipo() == TipoVuelo.EXPRESS) {
			coste = 1.5 * this.getDistanciaKm();
		}

		return coste;

	}
	
	@Override
	public String getTipoRuta() {
		String tipoRuta = this.getClass().getName() + this.getTipo();
		return tipoRuta;
	}
}
