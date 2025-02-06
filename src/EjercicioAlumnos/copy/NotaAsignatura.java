package EjercicioAlumnos.copy;

public class NotaAsignatura {
	public NotaAsignatura(String notaMedia, int notaPrimerTrimestre, int notaSegundoTrimestre,
			int notaTercerTrimestre) {
		super();
		this.notaPrimerTrimestre = notaPrimerTrimestre;
		this.notaSegundoTrimestre = notaSegundoTrimestre;
		this.notaTercerTrimestre = notaTercerTrimestre;
	}

	int notaPrimerTrimestre;
	int notaSegundoTrimestre;
	int notaTercerTrimestre;
	public String nombreAsignatura;

	@Override
	public String toString() {
		return "NotaAsignatura [notaPrimerTrimestre=" + notaPrimerTrimestre + ", notaSegundoTrimestre="
				+ notaSegundoTrimestre + ", notaTercerTrimestre=" + notaTercerTrimestre + "]";
	}

	public int calcularNotaMedia() {
		int media = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
		return media;
	}

	public int verTrimestresAprobados(NotaAsignatura notaTrim) {
		int nAprobados = 0;

		if (notaTrim.notaPrimerTrimestre >= 5) {
			nAprobados = nAprobados + 1;
		}
		if (notaTrim.notaSegundoTrimestre >= 5) {
			nAprobados = nAprobados + 1;
		}

		if (notaTrim.notaTercerTrimestre >= 5) {
			nAprobados = nAprobados + 1;
		}
		return nAprobados;
	}
	
	

	}