package EjercicioRoles;

public class Villano extends Personaje{

	public Villano(String nombre, int nivel, float hP) {
		super(nombre, nivel, hP, "");
	}
	
	

	@Override
	public String toString() {
		return "Villano [getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getHP()=" + getHP()
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
		System.out.println("");
	}
}