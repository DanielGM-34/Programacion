package ExamenSorayaEjercicio2;

public class RutaBase implements IRuta {
	@Override
	public String toString() {
		return "RutaBase [id=" + id + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino
				+ ", distanciaKm=" + distanciaKm + "]";
	}

	private int id;
	Ciudad ciudadOrigen;
	Ciudad ciudadDestino;
	private double distanciaKm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public double getDistanciaKm() {
		return distanciaKm;
	}

	public void setDistanciaKm(double distanciaKm) {
		this.distanciaKm = distanciaKm;
	}

	public RutaBase(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double distanciaKm) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKm = distanciaKm;
	}

	@Override
	public double getCoste() {
		return 0;
	}

	@Override
	public String getTipoRuta() {
		return null;
	}

}