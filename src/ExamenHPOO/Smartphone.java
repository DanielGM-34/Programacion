package ExamenHPOO;

public class Smartphone extends Telefono {
	private int cantidadCamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}



	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}

	public double calcularPrecioDescuento() {
		double precioF = 0;
		
		precioF = (0.15 * getPrecio()) - getPrecio() ;
		return precioF;
	}
}