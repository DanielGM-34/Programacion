package REPOSITORIO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import ListasNuevasMarzo.Libro;

public class Prestamo {
	private int id;
	private List<Prestamo> prestamos;
	private Libro libro;
	private LocalDate fechaPrestamo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fechaPrestamo, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(fechaPrestamo, other.fechaPrestamo) && Objects.equals(libro, other.libro);
	}

}