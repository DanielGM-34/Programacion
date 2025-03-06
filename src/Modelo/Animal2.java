package Modelo;

public abstract class Animal2 implements Depredador, Presa {
	private String nombre;
	private Familia tipoFamilia;
	private String habitat;
	private Animal2[] animalComido;
	private Animal2[] animalQueComido;

	public Animal2(String nombre, Familia tipoFamilia, String habitat, Animal2[] animalComido,
			Animal2[] animalQueComido) {
		super();
		this.nombre = nombre;
		this.tipoFamilia = tipoFamilia;
		this.habitat = habitat;
		this.animalComido = animalComido;
		this.animalQueComido = animalQueComido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Familia getTipoFamilia() {
		return tipoFamilia;
	}

	public void setTipoFamilia(Familia tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Animal2[] getAnimalComido() {
		return animalComido;
	}

	public void setAnimalComido(Animal2[] animalComido) {
		this.animalComido = animalComido;
	}

	@Override
	public boolean huir(Animal2 a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atacar(Animal2 a) {
		// TODO Auto-generated method stub
		return false;
	}

}