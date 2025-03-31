package ListasNuevasMarzo;

import java.util.Objects;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String genero;
	private int anyoPublicacion;
	private EstadoLibro estado;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", anyoPublicacion=" + anyoPublicacion + ", estado=" + estado + "]";
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	protected void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	protected EstadoLibro getEstado() {
		return estado;
	}

	protected void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}

	public Libro(String isbn, String titulo, String autor, String genero, int anyoPublicacion, EstadoLibro estado) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anyoPublicacion = anyoPublicacion;
		this.estado = estado;
	}

}