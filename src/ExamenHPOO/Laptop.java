package ExamenHPOO;

public class Laptop extends Computadora {
	private double peso;

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	public Laptop(String marca, String modelo, double precio, int capacidadRam, double peso) {
		super(marca, modelo, precio, capacidadRam);
		this.peso = peso;
	}

	public double calcularPrecioDescuento() {
		double descuento = 0.12;
		double precioF = 0;

		if (peso > 0) {
			descuento = 0.12;
			precioF = this.getPrecio() * descuento;
		}

		else if (peso > 2) {
			descuento = 0.20;
			precioF = this.getPrecio() * descuento - getPrecio();
		}

		return precioF;
	}

}
