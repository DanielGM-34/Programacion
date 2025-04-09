package SIMULACIONES.Reservas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Evento {
	private String idEvento;
	private String nombreEvento;
	private LocalDate fechaEvento;
	private String lugarCelebracion;
	private List<Reserva> listaReservas;

	public Evento(String nombreEvento, LocalDate fechaEvento, String lugarCelebracion) {
		super();
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.lugarCelebracion = lugarCelebracion;
		this.listaReservas = new ArrayList<>();
	}

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getLugarCelebracion() {
		return lugarCelebracion;
	}

	public void setLugarCelebracion(String lugarCelebracion) {
		this.lugarCelebracion = lugarCelebracion;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaEvento, nombreEvento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(fechaEvento, other.fechaEvento) && Objects.equals(nombreEvento, other.nombreEvento);
	}

}
