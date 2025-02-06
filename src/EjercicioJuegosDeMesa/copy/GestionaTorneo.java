package EjercicioJuegosDeMesa.copy;

public class GestionaTorneo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Participante p1 = new Participante("Star", "Paco", 15, 0);
		Participante p2 = new Participante("Platinum", "Alberto", 32, 45);
		Participante p3 = new Participante("Golden", "Pepe", 25, 22);
		Participante p4 = new Participante("Wind", "Juan", 15, 22);

		Participante participantes[] = { p1, p2, p3, p4 };

		Partida n1 = new Partida("Catán", participantes);

		n1.ImprimeGanador();

		n1.obtenerMayorPerdedor();
		

	}

}