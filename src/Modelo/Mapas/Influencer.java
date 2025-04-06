package Modelo.Mapas;

import java.util.Objects;

public class Influencer {
	private String nombre;
	private String nick;
	private int numSeguidores;
	private String plataforma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getNumSeguidores() {
		return numSeguidores;
	}

	public void setNumSeguidores(int numSeguidores) {
		this.numSeguidores = numSeguidores;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Influencer(String nombre, String nick, int numSeguidores, String plataforma) {
		super();
		this.nombre = nombre;
		this.nick = nick;
		this.numSeguidores = numSeguidores;
		this.plataforma = plataforma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nick, plataforma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Influencer other = (Influencer) obj;
		return Objects.equals(nick, other.nick) && Objects.equals(plataforma, other.plataforma);
	}

}
