package Controlador;

import POO.Pokemon;

public class GestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre="Pikachu";
		pikachu.nivelDeVida = 11;
		pikachu.tipo = "Eléctrico";
		pikachu.evoluciones = "Raichu";

		Pokemon mew = new Pokemon();

		mew.nombre = "Mewto";
		mew.nivelDeVida = 20;
		mew.tipo = "Psíquico";
		mew.evoluciones = "";

		System.out.println("Pokemon1: " + mew.nombre);
		System.out.println("Nivel: " + mew.nivelDeVida);

		// Cambiar nivel
		pikachu.nivelDeVida += 2;
		System.out.println("Nivel: " + pikachu.nivelDeVida);
		System.out.println("Pokemon2: " + pikachu.nombre);

		String cadenaPikachu = pikachu.convierteCadena();
	
		System.out.println(pikachu.fight(mew));
		System.out.println(cadenaPikachu);
		System.out.println("Pikachu gana");
	}

	{

	}
}
