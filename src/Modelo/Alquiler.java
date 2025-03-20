package Modelo;

import java.time.LocalDate;

public class Alquiler {
	private String id;
	private String numPermiso;
	private LocalDate fechaEntrega;
	private LocalDate fechaAlquiler;
	private VehiculoGeneral vehiculo;

	public VehiculoGeneral getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoGeneral vehiculo) {
		this.vehiculo = vehiculo;
	}

	private int numDias;
	private EstadoAlquiler estado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumPermiso() {
		return numPermiso;
	}

	public void setNumPermiso(String numPermiso) {
		this.numPermiso = numPermiso;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public EstadoAlquiler getEstado() {
		return estado;
	}

	public void setEstado(EstadoAlquiler estado) {
		this.estado = estado;
	}

	public Alquiler(String id, String numPermiso, LocalDate fechaEntrega, LocalDate fechaAlquiler, int numDias,
			EstadoAlquiler estado) {
		super();
		this.id = id;
		this.numPermiso = numPermiso;
		this.fechaEntrega = fechaEntrega;
		this.fechaAlquiler = fechaAlquiler;
		this.numDias = numDias;
		this.estado = estado;
	}

	public double getPrecioPorDias() {
		return numDias;
	}

	public double getImporteGeneradoPorDia() {
		int diasAlquiler = this.numDias;
		double importe = 0;
		double precioPorDia = 0;

		if (this.vehiculo instanceof Patinete) {
			importe = getPrecioPorDias() + 30 * (numDias - 1);
		}
		
		//TO DO 
		
		
		return importe;

	}

}