package EjercicioRoles;

import java.util.Objects;

public class Personaje {
	private String nombre;
	private int nivel;
	private float HP;
	private String arma;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getNivel() {
		return nivel;
	}
	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}
	protected float getHP() {
		return HP;
	}
	protected void setHP(float hP) {
		HP = hP;
	}
	protected String getArma() {
		return arma;
	}
	protected void setArma(String arma) {
		this.arma = arma;
	}
	
	public boolean esAtacado(Personaje atacante) {
		return true;
	}
	
	public boolean esAtacado(Personaje atacante, int distancia) {
		
		
		
		
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", HP=" + HP + ", arma=" + arma + "]";
	}
	public Personaje(String nombre, int nivel, float hP, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		HP = hP;
		this.arma = arma;
	}
	@Override
	public int hashCode() {
		return Objects.hash(HP, arma, nivel, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Float.floatToIntBits(HP) == Float.floatToIntBits(other.HP) && Objects.equals(arma, other.arma)
				&& nivel == other.nivel && Objects.equals(nombre, other.nombre);
	}
	
}