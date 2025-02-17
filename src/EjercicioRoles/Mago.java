package EjercicioRoles;

public class Mago extends Personaje {

	public Mago(String nombre, int nivel, float hP) {
		super(nombre, nivel, hP, "hechizo");
	}

	@Override
	public String toString() {
		return "Mago [getNombre()=" + getNombre() + ", getNivel()=" + getNivel() + ", getHP()=" + getHP()
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

	public boolean esAtacado(Personaje atacante) {
		return false;
	}

	public boolean esAtacado(Personaje atacante, int distancia) {
		if(distancia <5) {
			
		}
		
		
		
		
		return true;
	}

}