package Modelo;

import java.time.LocalDate;

public class Puerta extends Dispositivo {

	public Puerta(String mac, EstadoDispositivo estado, LocalDate fecha) {
		super(mac, estado, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conectan usando WPA.");

	}

	@Override
	public boolean pendienteActualización() {
		LocalDate fechaHoy = LocalDate.now();
		return getFecha().plusDays(30).isBefore(fechaHoy) || getFecha().plusDays(30).isEqual(fechaHoy);
	}

}