package Modelo.Deportistas;

import java.time.LocalDate;
import java.util.Objects;

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

	


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return id == other.id;
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

	@Override
	public String toString() {
		return "Prueba [id=" + id + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
}
