package Simulacro;

public class WEN {

	public static void main(String[] args) {
		DiasSemana diaReserva;

		for (DiasSemana dia : DiasSemana.values()) {
			if (dia == DiasSemana.MARTES) {
				System.out.println("Hoy es " + dia);
			}
		}
		
		
	}
}