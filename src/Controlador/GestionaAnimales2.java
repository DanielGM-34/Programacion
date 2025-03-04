package Controlador;

import Modelo.*;

public class GestionaAnimales2 {

	public static void main(String[] args) {
		AnimalAbs p = new Perro();
		AnimalAbs g = new Gato();
		AnimalAbs pez = new pez();
		
		/*AnimalAbs asa = new AnimalAbs();
		 * Esto da error porque una clase abstracta no se puede instanciar.
		 * */

		
		
		System.out.println(p.getAlimento());
		System.out.println(p.getSonidoQueEmite());
		System.out.println();
		System.out.println(g.getAlimento());
		System.out.println(g.getSonidoQueEmite());
		System.out.println();
		System.out.println(pez.getAlimento());
		System.out.println(pez.getSonidoQueEmite());

	}

}