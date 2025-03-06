package Modelo;

import java.time.LocalDate;

public class Camara extends Dispositivo {

	public Camara(String mac, EstadoDispositivo estado, LocalDate fecha) {
		super(mac, estado, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conectan usando WPA3.");

	}

	@Override
	public boolean pendienteActualización() {
		LocalDate fechaHoy = LocalDate.now();
		return getFecha().plusDays(14).isBefore(fechaHoy) || getFecha().plusDays(14).isEqual(fechaHoy);
	}
}