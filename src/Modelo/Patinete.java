package Modelo;

public class Patinete extends VehiculoGeneral {
	public Patinete(String id, Alquiler[] alquileres, boolean alquilado, int tiempoAutonomia, String marca,
			String modelo, double cuantiaFianza, boolean abonada) {
		super(id, alquileres, alquilado);
		this.tiempoAutonomia = tiempoAutonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.cuantiaFianza = cuantiaFianza;
		this.abonada = abonada;
	}

	private int tiempoAutonomia;
	private String marca;
	private String modelo;
	private double cuantiaFianza;
	private boolean abonada;

	public int getTiempoAutonomia() {
		return tiempoAutonomia;
	}

	public void setTiempoAutonomia(int tiempoAutonomia) {
		this.tiempoAutonomia = tiempoAutonomia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCuantiaFianza() {
		return cuantiaFianza;
	}

	public void setCuantiaFianza(double cuantiaFianza) {
		this.cuantiaFianza = cuantiaFianza;
	}

	public boolean isAbonada() {
		return abonada;
	}

	public void setAbonada(boolean abonada) {
		this.abonada = abonada;
	}

	public boolean getEstadoAbonadaFianza() {
		return this.abonada;
	}



}
