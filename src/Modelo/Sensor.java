package Modelo;

import java.time.LocalDate;

public class Sensor extends Dispositivo {
	private double temperatura;

	public Sensor(String mac, EstadoDispositivo estado, LocalDate fecha, double temperatura) {
		super(mac, estado, fecha);
		this.temperatura = temperatura;
	}

	protected double getTemperatura() {
		return temperatura;
	}

	protected void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conectan usando WPA.");
	}

	@Override
	public boolean pendienteActualización() {
		LocalDate fechaHoy = LocalDate.now();

		return getFecha().plusMonths(3).isBefore(fechaHoy) || getFecha().plusMonths(3).isEqual(fechaHoy);
	}

}