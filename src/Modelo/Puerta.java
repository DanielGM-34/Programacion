package Modelo;

import java.time.LocalDate;

public class Puerta extends Dispositivo {

	public Puerta(String mac, EstadoDispositivo estado, LocalDate fecha) {
		super(mac, estado, fecha);
		// TODO Auto-generated constructor stub
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
