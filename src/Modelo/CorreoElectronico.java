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

	public static boolean esCorreoValido(String correo) {
		return correo.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
	}

	@Override
	public String toString() {
		return this.nombre + "@" + this.dominio;
	}
}