package Modelo;

public abstract class VehiculoGeneral implements IAlquilable {
	private String id;
	private Alquiler alquileres[];
	private boolean alquilado;

	@Override
	public boolean estaAlquilado() {
		return this.alquilado;
	}

	public VehiculoGeneral(String id, Alquiler[] alquileres, boolean alquilado) {
		super();
		this.id = id;
		this.alquileres = alquileres;
		this.alquilado = alquilado;
	}

	// public abstract double totalGenerado();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public double totalGenerado() {
		double importeTotal = 0;
		for (Alquiler a : getAlquileres()) {
			if (a.getEstado().equals(a.getEstado().ENTREGADO) || a.equals(a.getEstado().CERRADO)) {

			}
		}
		return importeTotal;

	}
}
