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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean pendienteActualización() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

}
