package EjercicioRoles;

public class Caballero extends Personaje{
	public Caballero(String nombre, int nivel, float hP, String arma) {
		super(nombre, nivel, hP, arma);
		
	}

	@Override
	public String toString() {
		return "Caballero [getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getHP()=" + getHP()
				+ ", getArma()=" + getArma() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}
	
	public void getTipoArma() {
		System.out.println("Espada");
	}
	
	public boolean esAtacado(Personaje atacante) {
		return true;
	}
	
	public boolean esAtacado(Personaje atacante, int distancia) {
		return true;
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