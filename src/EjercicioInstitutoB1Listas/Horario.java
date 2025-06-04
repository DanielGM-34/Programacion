package EjercicioInstitutoB1Listas;

public class Horario {
	private String[] dias;
	private String[][] horario;

	public String[] getDias() {
		return dias;
	}
 
	public void setDias(String[] dias) {
		this.dias = dias;
	} 

	public String[][] getHorario() {
		return horario;
	}

	public void setHorario(String[][] horario) {
		this.horario = horario;
	}

	public Horario() {
		super();
		this.dias = new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" };
		this.horario = new String[5][6];
	}

	public void asignarModulo(int diaSemana, int horaModulo, String nombreModulo) {
		if (diaSemana >= 0 && diaSemana < 5 && horaModulo >= 0 && horaModulo < 6) {
			horario[diaSemana][horaModulo] = nombreModulo;
		}

	}

	public void asignarModulo3(int dia, int hora, String modulo) {
		if (dia >= 0 && dia < 5 && hora >= 0 && hora < 6) {
			horario[dia][hora] = modulo;
		}
	} 

	public void mostrarHorario() {
		for (int i = 0; i < 5; i++) {
			System.out.println(dias[i] + ": ");
			for (int j = 0; j < 6; j++) {
				System.out.print((horario[i][j] == null ? "Vacío" : horario[i][j]));
			}
		}
	}
}