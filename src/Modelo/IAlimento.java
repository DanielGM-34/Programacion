package Modelo;

import java.sql.Date;

public interface IAlimento {
	public void setCaducidad(Date fecha);

	public Date getCaducidad();

	public double getCalorias();

}