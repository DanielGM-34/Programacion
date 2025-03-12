package Modelo;

public class Detergente extends Producto implements ILiquido, IDescuento {
	private String marca;
	private TipoDetergente tipoDet;
	private TipoRopa tipoRopa;

	public Detergente(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra, String marca, TipoDetergente tipoDet, TipoRopa tipoRopa) {
		super(identificador, nombre, descripcion, peso, precioVenta, precioCompra);
		this.marca = marca;
		this.tipoDet = tipoDet;
		this.tipoRopa = tipoRopa;
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
	public double calcularPrecioSinIva(double precioProducto) {
		return precioProducto - (precioProducto * (21 / 100));
	}

	@Override
	public double calcularPrecioConIva(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto + (precioProducto * (21 / 100));
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