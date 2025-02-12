package EjemploPersonasEjercicioClase;

import java.time.LocalDate;

public class GestionaProfesores {

	public static void main(String[] args) {
		ProfesorInterino interino1 = new ProfesorInterino("Pepe", "Inglés", LocalDate.now().plusMonths(6));
		Profesor interino2 = new ProfesorInterino("Pepa", "Historia", LocalDate.now().plusMonths(4));

		System.out.println(interino1.getFechaFinContrato());

		ProfesorInterino p3 = (ProfesorInterino) interino2; // Down casting del tipo padre al tipo hijo.

		p3.getFechaFinContrato();

		ProfesorTitular titular1 = new ProfesorTitular("Antonio", "Filosofia", LocalDate.now().minusYears(1));

		System.out.println(titular1.getFechaAdjudicacion());

		Profesor titular2 = new ProfesorTitular("Antonia", "Lengua", LocalDate.now().minusYears(10));
		ProfesorTitular p4 = (ProfesorTitular) titular2;
		System.out.println(p4.getFechaAdjudicacion());

		Profesor p5 = (Profesor) interino1; // UpCasting de hijo convierto a padre.
		p5.getSueldo();

		ProfesorTitular p6 = (ProfesorTitular) interino2; // ClassCastException en tiempo de ejecución.
	}
}