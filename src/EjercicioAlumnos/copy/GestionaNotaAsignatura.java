package EjercicioAlumnos.copy;

public class GestionaNotaAsignatura {

	public static void main(String[] args) {
		AlumnoAsignatura lucia = new AlumnoAsignatura("Lucia", "Mendez Ortega", "andresito88");
		AlumnoAsignatura andres = new AlumnoAsignatura("Andres", "Suárez Ramírez", "andresito88@gmail.com");
		AlumnoAsignatura vicente = new AlumnoAsignatura("Vicente", "López Domínguez", "lucia@gmail.com");

		NotaAsignatura notaProgLuc = new NotaAsignatura("programacion", 5, 7, 7);
		NotaAsignatura notaBDLuc = new NotaAsignatura("bases de datos", 6, 6, 7);

		NotaAsignatura notaProgAndres = new NotaAsignatura("programacion", 4, 4, 3);
		NotaAsignatura notaBDAndres = new NotaAsignatura("bases de datos", 9, 8, 8);

		NotaAsignatura notaProgVicente = new NotaAsignatura("programacion", 2, 2, 3);
		NotaAsignatura notaBDVicente = new NotaAsignatura("bases de datos", 6, 6, 7);

		lucia.notaProg = notaProgLuc;
		lucia.notaBD = notaBDLuc;

		andres.notaProg = notaProgAndres;
		andres.notaBD = notaBDAndres;

		vicente.notaProg = notaProgVicente;
		vicente.notaBD = notaBDVicente;

		lucia.ImprimeSiHaAprobado("bases");
		lucia.ImprimeSiHaAprobado("programacion");
		System.out.println();
		andres.ImprimeSiHaAprobado("bases");
		andres.ImprimeSiHaAprobado("programacion");

		int tBDAnd = notaBDAndres.verTrimestresAprobados(notaBDAndres);
		int tProg = notaProgAndres.verTrimestresAprobados(notaProgAndres);

		int tBDVIC = notaBDVicente.verTrimestresAprobados(notaBDVicente);
		int tProgVic = notaProgVicente.verTrimestresAprobados(notaProgVicente);

	}

}
