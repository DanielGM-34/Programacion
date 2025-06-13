package EjercicioBibliotecaConPrestamo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaBiblioteca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Libro> listaLibrosBiblioteca = new ArrayList<>();
		Biblioteca biblioteca = new Biblioteca(listaLibrosBiblioteca);
		RepositorioPrestamos repositorio = new RepositorioPrestamos();
		boolean continuar = true;

		while (continuar) {
			System.out.println("Menú:");
			System.out.println("1. Agregar libro");
			System.out.println("2. Prestar libro");
			System.out.println("3. Devolver libro");
			System.out.println("4. Mostrar préstamos");
			System.out.println("5. Buscar préstamos por ISBN");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");

			int opcion = Integer.parseInt(scanner.nextLine());

			try {
				switch (opcion) {
				case 1:
					System.out.print("Introduce ISBN, título, autor, género y año: ");
					biblioteca.anyadirLibro(new Libro(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),
							scanner.nextLine(), Integer.parseInt(scanner.nextLine()), EstadoLibro.LIBRE));
					System.out.println("Libro agregado.");
					break;
				case 2:
					System.out.print("Introduce título y usuario: ");
					repositorio.agregarPrestamo(biblioteca.buscarLibro(scanner.nextLine()), scanner.nextLine());
					break;
				case 3:
					System.out.print("Introduce título: ");
					repositorio.devolverLibro(biblioteca.buscarLibro(scanner.nextLine()));
					break;
				case 4:
					repositorio.mostrarPrestamos();
					break;
				case 5:
					System.out.print("Introduce ISBN: ");
					repositorio.mostrarPrestamosPorISBN(scanner.nextLine());
					break;
				case 6:
					continuar = false;
					System.out.println("Saliendo...");
					break;
				}
			} catch (BibliotecaException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		scanner.close();
	}
}
