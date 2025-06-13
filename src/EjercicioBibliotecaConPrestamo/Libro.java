package EjercicioBibliotecaConPrestamo;

import java.util.Objects;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String genero;
	private int anyoPublicacion;
	private EstadoLibro estado;

	public Libro(String isbn, String titulo, String autor, String genero, int anyoPublicacion, EstadoLibro estado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anyoPublicacion = anyoPublicacion;
		this.estado = estado;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public EstadoLibro getEstado() {
		return estado;
	}

	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + isbn + ", Título=" + titulo + ", Autor=" + autor + ", Género=" + genero
				+ ", Año Publicación=" + anyoPublicacion + ", Estado=" + estado + "]";
	}
}
