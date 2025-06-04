package EjercicioBibliotecaSinPrestamo;

import java.util.LinkedList;
import java.util.List;

public class RepositorioPrestamos {
	private List<Prestamo> prestamos;

	public RepositorioPrestamos() {
		this.prestamos = new LinkedList<>();
	}

	@Override
	public String toString() {
		return "RepositorioPrestamos [prestamos=" + prestamos + "]";
	}

	public void agregarPrestamo(Libro libro, String nombreUsuario) throws BibliotecaException {
		if (libro.getEstado() == EstadoLibro.PRESTADO) {
			throw new BibliotecaException("No es posible realizar el préstamo de un libro que ya está prestado.");
		}

		Prestamo nuevoPrestamo = new Prestamo(prestamos.size() + 1, libro, nombreUsuario);
		prestamos.add(nuevoPrestamo);
		System.out.println("Préstamo registrado: " + nuevoPrestamo);
	}

	public void devolverLibro(Libro libro) throws BibliotecaException {
		boolean prestamoEncontrado = false;

		for (Prestamo prestamo : prestamos) {
			if (prestamo.getLibro().equals(libro)) {
				libro.setEstado(EstadoLibro.LIBRE);
				System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto.");
				prestamoEncontrado = true;
			}
		}

		if (!prestamoEncontrado) {
			throw new BibliotecaException("No se encuentra préstamo asociado a este libro.");
		}
	}

	public void mostrarPrestamos() {
		if (prestamos.isEmpty()) {
			System.out.println("No hay préstamos registrados.");
		} else {
			prestamos.forEach(System.out::println);
			System.out.println(this.prestamos);
		}
	}

	public void mostrarPrestamosPorISBN(String isbn) {
		boolean encontrado = false;
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getLibro().getIsbn().equals(isbn)) {
				System.out.println(prestamo);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontraron préstamos para el libro con ISBN: " + isbn);
		}
	}
}
