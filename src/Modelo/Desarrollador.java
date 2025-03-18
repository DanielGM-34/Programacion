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
		// TODO Auto-generated method stub

	}

	@Override
	public float calculaImporteNomina() {
		// TODO Auto-generated method stub
		return 0;
	}

}
