package EjercicioRoles;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, float hP, String arma) {
		super(nombre, nivel, hP, arma);
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
	
	public void getTipoArma() {	
		System.out.println("Flecha");
	}
	
	
	public boolean esAtacado(Personaje atacante) {
		return true;
	}
	
	public boolean esAtacado(Personaje atacante, int distancia) {
		return true;
	}
}