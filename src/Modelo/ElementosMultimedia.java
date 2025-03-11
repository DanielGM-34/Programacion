package Modelo;

public class ElementosMultimedia extends Recurso {
	private String nombre;
	private String genero;
	private int diasPrestamo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

	public ElementosMultimedia(int id, String ubicacion, String nombre, String genero) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
		this.diasPrestamo = 10;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return this.getDiasPrestamo();
	}

}
