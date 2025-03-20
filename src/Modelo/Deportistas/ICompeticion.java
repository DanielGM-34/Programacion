package Modelo.Deportistas;

import java.time.LocalDate;

public interface ICompeticion {
	public void competir();
	public double getTiempoPrueba(LocalDate fechaCal);
}