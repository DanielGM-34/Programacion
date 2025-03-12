package Modelo;

import java.sql.Date;

public class Vino extends Producto implements ILiquido, IAlimento, IDescuento {
	private String marca;
	private TipoVino tipoDeVino;
	private int gradosDeAlcohol;
	private double precio;

	public Vino(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra, String marca, TipoVino tipoDeVino, int gradosDeAlcohol, double precio) {
		super(identificador, nombre, descripcion, peso, precioVenta, precioCompra);
		this.marca = marca;
		this.tipoDeVino = tipoDeVino;
		this.gradosDeAlcohol = gradosDeAlcohol;
		this.precio = precio;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected TipoVino getTipoDeVino() {
		return tipoDeVino;
	}

	protected void setTipoDeVino(TipoVino tipoDeVino) {
		this.tipoDeVino = tipoDeVino;
	}

	protected int getGradosDeAlcohol() {
		return gradosDeAlcohol;
	}

	protected void setGradosDeAlcohol(int gradosDeAlcohol) {
		this.gradosDeAlcohol = gradosDeAlcohol;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setCaducidad(Date fecha) {
		// TODO Auto-generated method stub

	}

	@Override
	public Date getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCalorias() {
		// TODO Auto-generated method stub
		double calorias = 0;
		calorias = this.getGradosDeAlcohol() * 10;
		return calorias;
	}

	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularPrecioSinIva(double precioProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPrecioConIva(double precioProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}