package Modelo;

public class JefeProyecto extends AEmpleado implements INomina {

	private boolean hablaIngles;
	private String[] certificaciones;

	public boolean isHablaIngles() {
		return hablaIngles;
	}

	public void setHablaIngles(boolean hablaIngles) {
		this.hablaIngles = hablaIngles;
	}

	public String[] getCertificaciones() {
		return certificaciones;
	}

	public void setCertificaciones(String[] certificaciones) {
		this.certificaciones = certificaciones;
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

	public JefeProyecto() {
		super();
	}

	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHoraria, categoria);
	}

	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria, boolean hablaIngles, String[] certificaciones) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHoraria, categoria);
		this.hablaIngles = hablaIngles;
		this.certificaciones = certificaciones;
	}

}