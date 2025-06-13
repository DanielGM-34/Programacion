package EjercicioBibliotecaConPrestamo;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
	private int id;
	private Libro libro;
	private String nombreUsuario;
	private LocalDate fechaPrestamo;

	public Prestamo(int id, Libro libro, String nombreUsuario) {
		this.id = id;
		this.libro = libro;
		this.nombreUsuario = nombreUsuario;
		this.fechaPrestamo = LocalDate.now();
		libro.setEstado(EstadoLibro.PRESTADO);
	}

	public int getId() {
		return id;
	}

	public Libro getLibro() {
		return libro;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(libro.getIsbn(), fechaPrestamo, nombreUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(libro.getIsbn(), other.libro.getIsbn())
				&& Objects.equals(fechaPrestamo, other.fechaPrestamo)
				&& Objects.equals(nombreUsuario, other.nombreUsuario);
	}

	@Override
	public String toString() {
		return "Prestamo [ID=" + id + ", Libro=" + libro.getTitulo() + ", Usuario=" + nombreUsuario
				+ ", Fecha Prestamo=" + fechaPrestamo + "]";
	}
}
