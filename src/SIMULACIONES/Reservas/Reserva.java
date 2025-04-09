package SIMULACIONES.Reservas;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
	private int idreserva;
	private LocalDate fechaReserva;
	private Usuario Usuario;
	private EstadoReserva estado;

	public int getReserva() {
		return idreserva;
	}

	public void setReserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public EstadoReserva getEstado() {
		return estado;
	}

	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reserva [idreserva=" + idreserva + ", fechaReserva=" + fechaReserva + ", Usuario=" + Usuario
				+ ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idreserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return idreserva == other.idreserva;
	}
	
	

}
