package EjercicioRoles;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, float hP) {
		super(nombre, nivel, hP, "flecha");
	}

	@Override
	public String toString() {
		return "Arquero [getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getHP()=" + getHP()
				+ ", getArma()=" + getArma() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		boolean atacado = false;
		return atacante instanceof Mago|| distancia<50;
	}

	public boolean esAtacado(Personaje atacante) {
		boolean atacado = false;
		if (atacante instanceof Mago) {
			atacado = true;
		}
		else {
			atacado = false;
		}
		return atacado;
	}
}