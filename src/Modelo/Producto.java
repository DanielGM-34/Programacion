package Modelo;

public abstract class Producto {
	private int identificador;
	private String nombre;
	private String descripcion;
	private double peso;
	private float precioVenta;
	private float precioCompra;

	public Producto(int identificador, String nombre, String descripcion, double peso, float precioVenta,
			float precioCompra) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", peso=" + peso + ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra + "]";
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected float getPrecioVenta() {
		return precioVenta;
	}

	protected void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	protected float getPrecioCompra() {
		return precioCompra;
	}

	protected void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public abstract double calcularPrecioSinIva(double precioProducto);
	public abstract double calcularPrecioConIva(double precioProducto);

}