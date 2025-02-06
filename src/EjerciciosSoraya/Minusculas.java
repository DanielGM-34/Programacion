package EjerciciosSoraya;

public class Minusculas {

	public static void main(String[] args) {
		Minusculas funcion = new Minusculas();
		String[] palabras = { "hola", "mundo", "programacion", "PepO" };
		for (String palabra : palabras) {
			System.out.println(funcion.modificaPalabraMinusculas(palabra));
		}

	}

	String modificaPalabraMinusculas(String palabra) {
		palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
		palabra = palabra.substring(0, palabra.length() - 1) + palabra.length();
		palabra = palabra.replace('o', '0').replace('O', '0');
		return palabra;
	}

	public String[] convierteTabla(String[] palabras) {
		String[] convertidas = new String[palabras.length];
		for (int i = 0; i < palabras.length; i++) {
			convertidas[i] = modificaPalabraMinusculas(palabras[i]);
		}
		return convertidas;
	}
}