package Modelo;

public class Persona {
	private static final double PI = 3.1416;
	private static int contador;
	private int identificador;
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.identificador = contador + 1;
		this.nombre = nombre;
		this.edad = edad;
		contador = contador + 1;
	}

	@Override
	public String toString() {
		return "Personas [ identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static boolean validaDniValido(String dni) {
		boolean valido = false;

		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		}

		else {
			valido = false;
		}
		return valido;
	}

}