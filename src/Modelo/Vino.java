package Modelo;

import java.time.LocalDate;

public class Vino extends Producto implements ILiquido, IAlimento, IDescuento {
	private String marca;
	private TipoVino tipoDeVino;
	private int gradosDeAlcohol;
	private double precio;
	private String tipoEnvase;
	private double precioDescuento;
	private int volumen;

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
	public void setCaducidad(LocalDate fecha) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getCaducidad() {
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
		this.tipoEnvase=env;
		// TODO Auto-generated method stub
	}

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}



	@Override
	public void setDescuento(double des) {
		this.precioDescuento=des;
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		return this.precioDescuento;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}