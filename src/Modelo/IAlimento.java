package Modelo;

import java.sql.Date;
import java.time.LocalDate;

public interface IAlimento {
	public void setCaducidad(LocalDate fecha);

	public LocalDate getCaducidad();

	public double getCalorias();

}