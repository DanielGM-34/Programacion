package ListasNuevasMarzo;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private int anyoPubli;
	private EstadoLibro estado;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnyoPubli() {
		return anyoPubli;
	}

	public void setAnyoPubli(int anyoPubli) {
		this.anyoPubli = anyoPubli;
	}

	public EstadoLibro getEstado() {
		return estado;
	}

	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}

}
