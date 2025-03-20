package Modelo.Deportistas;

import java.time.LocalDate;

public class Prueba {
	private int id;
	private LocalDate fecha;
	private EstadoPrueba estado;

	public int getId() {
		return id;
	}
	
	public Prueba(int id, LocalDate fecha, EstadoPrueba estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public EstadoPrueba getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrueba estado) {
		this.estado = estado;
	}
}
