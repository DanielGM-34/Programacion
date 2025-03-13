package Modelo;

public class Detergente extends Producto implements ILiquido, IDescuento {
	private String marca;
	private TipoDetergente tipoDet;
	private TipoRopa tipoRopa;
	private float descuento;
	private double volumen;
	private String tipoEnvase;
	private final int iva;

	

	public Detergente(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra, String marca, TipoDetergente tipoDet, TipoRopa tipoRopa, float descuento,
			double volumen, String tipoEnvase, int iva) {
		super(identificador, nombre, descripcion, peso, precioVenta, precioCompra);
		this.marca = marca;
		this.tipoDet = tipoDet;
		this.tipoRopa = tipoRopa;
		this.descuento = descuento * this.getPrecioVenta() /100;
		this.volumen = volumen;
		this.tipoEnvase = tipoEnvase;
		this.iva = 21;
	}



	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected TipoDetergente getTipoDet() {
		return tipoDet;
	}

	protected void setTipoDet(TipoDetergente tipoDet) {
		this.tipoDet = tipoDet;
	}

	protected TipoRopa getTipoRopa() {
		return tipoRopa;
	}

	protected void setTipoRopa(TipoRopa tipoRopa) {
		this.tipoRopa = tipoRopa;
	}


	@Override
	public void setVolumen(double v) {
		this.volumen = v;
		// TODO Auto-generated method stub

	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return this.volumen;
	}

	@Override
	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;

	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return this.tipoEnvase;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = descuento;
	}

	@Override
	public double getDescuento() {
		return descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return this.getPrecioVenta() - this.descuento * this.getPrecioVenta();
	}

}