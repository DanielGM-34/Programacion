package SIMULACIONES.Reservas;

import java.util.Objects;

public class Usuario {
	@Override
	public String toString() {
		return "Usuario [nombreCompleto=" + nombreCompleto + ", email=" + email + ", id=" + id + "]";
	}

	private String nombreCompleto;
	private static int contador;
	private String email;
	private int id;

	public Usuario(String nombreCompleto, String email) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.id = contador;
		contador = contador + 1;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Usuario.contador = contador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
