package Modelo;

public class Rapaz extends Animal2 {

	public Rapaz(String nombre, Familia tipoFamilia, String habitat, Animal2[] animalComido,
			Animal2[] animalQueComido) {
		super(nombre, tipoFamilia, habitat, animalComido, animalQueComido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean huir(Animal2 a) {
		return a instanceof Leon;
	}

	@Override
	public boolean atacar(Animal2 a) {
		return a instanceof Serpiente || a instanceof Roedor;
	}
}