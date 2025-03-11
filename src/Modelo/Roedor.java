package Modelo;

public class Roedor extends Animal2 {

	public Roedor(String nombre, Familia tipoFamilia, String habitat, Animal2[] animalComido,
			Animal2[] animalQueComido) {
		super(nombre, tipoFamilia, habitat, animalComido, animalQueComido);
		// TODO Auto-generated constructor stub

	}

	public Roedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean huir(Animal2 a) {
		return a instanceof Serpiente;
	}

	@Override
	public boolean atacar(Animal2 a) {
		return false;
	}

}