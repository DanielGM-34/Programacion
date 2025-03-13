package Modelo;

import java.time.LocalDate;

public class Pescado extends Producto implements IAlimento{
	private String origen;
	private int duracion;
	private TipoPescado tipoDePescado;
	private LocalDate fechaCaducidad;
	private static final int IVA=7;

	public Pescado(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra, String origen, double peso2, int duracion, TipoPescado tipoDePescado,
			LocalDate fechaCaducidad) {
		super(identificador, nombre, descripcion, peso, precioVenta, precioCompra);
		this.origen = origen;
		peso = peso2;
		this.duracion = duracion;
		this.tipoDePescado = tipoDePescado;
		this.fechaCaducidad = fechaCaducidad;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}


	protected int getDuracion() {
		return duracion;
	}

	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	protected TipoPescado getTipoDePescado() {
		return tipoDePescado;
	}

	protected void setTipoDePescado(TipoPescado tipoDePescado) {
		this.tipoDePescado = tipoDePescado;
	}

	
	@Override
	public void setCaducidad(LocalDate fecha) {
		this.fechaCaducidad = fechaCaducidad;

	}

	@Override
	public LocalDate getCaducidad() {
		return fechaCaducidad;
	}

	@Override
	public double getCalorias() {
		double calorias = 0;
		if (this.tipoDePescado == TipoPescado.BLANCO) {
			calorias = this.getPeso() * 3;
		}

		else if (this.tipoDePescado == TipoPescado.AZUL) {
			calorias = this.getPeso() * 2;
		}

		else if (this.tipoDePescado == TipoPescado.MARISCO) {
			calorias = this.getPeso() * 1;
		}
		return calorias;
	}

}
