package POO;

public class Pokemon {
	String nombre;
	String tipo;
	int nivelDeVida;
	String evoluciones;

	String convierteCadena() {
		String cadena = "Pokemon:" + nombre + "tipo:" + tipo + "nivelDeVida:" + nivelDeVida;
		return cadena;
	}

	boolean fight(Pokemon p2) {
		boolean gana = true;

		if (nivelDeVida > p2.nivelDeVida) {
			nivelDeVida += 1;
		}

		else {
			gana = false;
			p2.nivelDeVida = p2.nivelDeVida + 1;
		}
		return gana;

	}
}