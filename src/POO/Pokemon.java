package POO;

public class Pokemon {
	public String nombre;
	public String tipo;
	public int nivelDeVida;
	public String evoluciones;

	public String convierteCadena() {
		String cadena = "Pokemon:" + nombre + "tipo:" + tipo + "nivelDeVida:" + nivelDeVida;
		return cadena;
	}

	public boolean fight(Pokemon p2) {
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