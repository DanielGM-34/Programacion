package Modelo;

public class CorreoElectronico {
	private String nombre;
	private String dominio;

	public CorreoElectronico(String correoCompleto) {
		super();
		String[] partes = correoCompleto.split("@");
		this.nombre = partes[0];
		this.dominio = partes[1];
	}

	public static boolean validaCorreo(String correo) {
		boolean valida = true;

		/*
		 * correo.matches("\\[A-Za-z]+@[A-Za-z]+(.[A-Za-z]");
		 */

		valida = correo.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
		return valida;
	}

	@Override
	public String toString() {
		return "CorreoElectronico [nombre=" + nombre + ", dominio=" + dominio + "]";
	}
}