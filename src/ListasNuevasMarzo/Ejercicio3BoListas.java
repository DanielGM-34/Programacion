package ListasNuevasMarzo;

import java.util.Scanner;

public class Ejercicio3BoListas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		while (opcion != 7) {
			System.out.println("1. Agregar un nuevo libro al inventario.");
			System.out.println("2. Prestar un ejemplar de un libro.");
			System.out.println("3. Devolver un ejemplar prestado.");
			System.out.println("4. Mostrar la lista de todos los libros en el inventario.");
			System.out.println(
					"5. Mostrar información detallada de un libro: título, autor, género, año de publicación, ejemplares disponibles y ejemplares prestados");
			System.out.println("6. Buscar libros por título o autor.");
			System.out.println("7. Salir del programa.");
			System.out.println("Introduce una opción: ");
			opcion = entrada.nextInt();
			
			

		}

	}

}
