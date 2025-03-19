package Modelo;

public class Desarrollador extends AEmpleado {
	private String[] lenguajes;
	private String[] frameworks;

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}

	public String[] getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(String[] frameworks) {
		this.frameworks = frameworks;
	}

	@Override
	public String[] devuelveFunciones() {
		String[] funciones = { "codificar", "diseñar planes de pruebas", "ejecutarlos" };
		return funciones;
	}

	@Override
	public void imprimeHorario() {
		if (isTieneReduccionHoraria()) {
			System.out.println(" Jornada 1: Turno de 8:00 a 14:00");
			System.out.println(" Jornada 2: Turno de 16:00 a 22:00");
		}

		else {
			System.out.println(" Jornada 1: Turno de 8:00 a 16:00");
			System.out.println(" Jornada 2: Turno de 16:00 a 00:00");

		}
	}

	public Desarrollador(String[] lenguajes, String[] frameworks) {
		super();
		this.lenguajes = lenguajes;
		this.frameworks = frameworks;
	}

	@Override
	public float calculaImporteNomina() {
		return this.getSalario() + ((this.calculaElementosDeUnaTabla(lenguajes) * 0.01F)
				+ this.calculaElementosDeUnaTabla(frameworks) * 0.03F);
	}

}
