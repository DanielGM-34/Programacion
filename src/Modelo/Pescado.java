package Modelo;

import java.sql.Date;

public class Pescado extends Producto implements IAlimento {
	private String origen;
	private double peso;
	private int duracion;
	private TipoPescado tipoDePescado;

	public Pescado(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra, String origen, double peso2, int duracion, TipoPescado tipoDePescado) {
		super(identificador, nombre, descripcion, peso, precioVenta, precioCompra);
		this.origen = origen;
		peso = peso2;
		this.duracion = duracion;
		this.tipoDePescado = tipoDePescado;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
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
	public double calcularPrecioSinIva(double precioProducto) {
		return precioProducto - (precioProducto * (7 / 100));
	}

	@Override
	public double calcularPrecioConIva(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto + (precioProducto * (7 / 100));
	}

	@Override
	public void setCaducidad(Date fecha) {
	}

	@Override
	public Date getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCalorias() {
		double calorias = 0;
		if (this.tipoDePescado == TipoPescado.blanco) {
			calorias = this.peso * 3;
		}

		else if (this.tipoDePescado == TipoPescado.azul) {
			calorias = this.peso * 2;
		}

		else if (this.tipoDePescado == TipoPescado.marisco) {
			calorias = this.peso * 1;
		}
		return calorias;
	}

}
