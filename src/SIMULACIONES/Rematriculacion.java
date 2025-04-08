package SIMULACIONES;

import java.time.LocalDate;

public class Rematriculacion {
	private String matriculaInicial;
	private String matriculaFinal;
	LocalDate fecha;

	public Rematriculacion(String matriculaInicial, String matriculaFinal, LocalDate fecha) {
		this.matriculaInicial = matriculaInicial;
		this.matriculaFinal = matriculaFinal;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Matrícula Inicial: " + matriculaInicial + ", Matrícula Final: " + matriculaFinal + ", Fecha: " + fecha;
	}
}
