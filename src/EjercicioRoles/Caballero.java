package EjercicioRoles;

public class Caballero extends Personaje {
	public Caballero(String nombre, int nivel, float hP, String arma) {
		super(nombre, nivel, hP, arma);

	}

	@Override
	public String toString() {
		return "Caballero [getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getHP()=" + getHP()
				+ ", getArma()=" + getArma() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}


	public boolean esAtacado(Personaje atacante, int distancia) {
		boolean atacado = false;
		if(atacante instanceof Arquero&& distancia>100) {
			atacado=true;
			
		}
		
		return atacado;
	}

	public boolean esAtacado(Personaje atacante) {
		boolean atacado = false;
		if (atacante instanceof Mago) {
			atacado = true;
		}
		
		else if (atacante instanceof Arquero) {
			atacado = true;
		}

		else {
			atacado = false;
		}
		return atacado;
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
}