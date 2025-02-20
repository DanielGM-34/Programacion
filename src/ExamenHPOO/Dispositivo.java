package ExamenHPOO;

import java.util.Objects;

public class Dispositivo {
	private String marca;
	private String modelo;
	private double precio;

	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		setPrecio(precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		if (precio < 0) {
			System.out.println("[ERROR:] EL PRECIO NO PUEDE SER NEGATIVO");
			this.precio = 1;
		} else {
			this.precio = precio;
		}

	}

	public double calcularPrecioDescuento() {
		double precioconDescuento = (precio * 10) / 100 - precio;
		return precioconDescuento;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " -  Modelo: " + modelo + " - Precio: " + precio + " - Precio con descuento: "
				+ this.calcularPrecioDescuento();
	}

}