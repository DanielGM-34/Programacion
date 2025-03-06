package Modelo;

public abstract class SerVivo {
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public abstract boolean estaVivo();

	public abstract boolean seDesplaza();

}