package Modelo.Mapas;

import java.time.LocalDate;

public class GestionaEntrada {

	public static void main(String[] args) {

		Entrada p1 = new Entrada("S1", LocalDate.of(2024, 6, 4), TipoEntrada.PLATINIUM, EstadoEntrada.ENVIADA);
		Entrada p2 = new Entrada("S2", LocalDate.of(2024, 9, 4), TipoEntrada.PLATINIUM, EstadoEntrada.ENVIADA);
		Entrada p3 = new Entrada("S3", LocalDate.of(2024, 10, 4), TipoEntrada.PLATINIUM, EstadoEntrada.ENVIADA);

		Entrada p4 = new Entrada("S4", LocalDate.of(2024, 7, 4), TipoEntrada.GOLD, EstadoEntrada.ENVIADA);
		Entrada p5 = new Entrada("S5", LocalDate.of(2024, 3, 4), TipoEntrada.GOLD, EstadoEntrada.ENVIADA);
		Entrada p6 = new Entrada("S6", LocalDate.of(2024, 1, 4), TipoEntrada.GOLD, EstadoEntrada.ENVIADA);

		Entrada p7 = new Entrada("S7", LocalDate.of(2024, 1, 4), TipoEntrada.SILVER, EstadoEntrada.ENVIADA);
		Entrada p8 = new Entrada("S8", LocalDate.of(2024, 1, 4), TipoEntrada.SILVER, EstadoEntrada.ENVIADA);
		Entrada p9 = new Entrada("S9", LocalDate.of(2024, 1, 4), TipoEntrada.SILVER, EstadoEntrada.ENVIADA);

		RegistroEntradas reg1 = new RegistroEntradas();

	}

}
