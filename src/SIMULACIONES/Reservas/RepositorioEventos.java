package SIMULACIONES.Reservas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepositorioEventos {
	private List<Evento> listaEventos;

	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}

	public RepositorioEventos() {
		listaEventos = new ArrayList<>();
	}

	public void agregarEvento(Evento evento) throws ReservaException {
		if (listaEventos.contains(evento)) {
			throw new ReservaException("Evento con el mismo nombre y misma fecha.");
		} else {
			listaEventos.add(evento);
		}
	}

	public Reserva buscarReserva(int idReserva, String nombreEvento, LocalDate fechaEvento) {
		Reserva reservaEncontrada = null;
		Iterator<Evento> iterador = listaEventos.iterator();
		while (iterador.hasNext()) {
			Evento elemento = iterador.next();
			if (elemento.getNombreEvento().equals(nombreEvento) && elemento.getFechaEvento().isEqual(fechaEvento)) {
				Iterator<Reserva> iteratorReservas = elemento.getListaReservas().iterator();
				while (iteratorReservas.hasNext()) {
					Reserva reserva = iteratorReservas.next();
					if (reserva.getReserva() == idReserva) {
						reservaEncontrada = reserva;
					}
				}
			}
		}

		return reservaEncontrada;
	}

	public void agregarReserva(String email, String id) throws ReservaException {
		Iterator<Evento> iterador = listaEventos.iterator();
		while (iterador.hasNext()) {
			Evento elemento = iterador.next();
			if (elemento.getIdEvento().equals(id)) {
				Iterator<Reserva> iteradorReservas = elemento.getListaReservas().iterator();
				while (iteradorReservas.hasNext()) {
					Reserva reserva = iteradorReservas.next();
					if (reserva.getUsuario().getEmail().equals(email)) {
						throw new ReservaException("El usuario ya tiene una reserva en este evento.");


					}
				}
			}
		}
	}

	public void modificarReserva(int idReserva, String nombreEvento, String idEvento) {
		Iterator<Evento> iterador = listaEventos.iterator();
		while (iterador.hasNext()) {
			Evento elemento = iterador.next();
			if (elemento.getIdEvento().equals(idEvento) && elemento.getNombreEvento().equals(nombreEvento)) {
				Iterator<Reserva> iteradorReservas = elemento.getListaReservas().iterator();
				while (iteradorReservas.hasNext()) {

				}

			}

		}
	}
}
