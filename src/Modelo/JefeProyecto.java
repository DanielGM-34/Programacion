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
		String[] funciones = { "planificar", "asegurar la calidad y entrega de plazos", "reporting",
				"elaboración de ofertas" };
		return funciones;
	}

	@Override
	public void imprimeHorario() {
		if (isTieneReduccionHoraria()) {
			System.out.println(" Jornada 1: Turno de 8:00 a 16:00");
		}

		else {
			System.out.println(" Jornada 1: Turno de 8:00 a 19:00");

		}
	}

	@Override
	public float calculaImporteNomina() {
		float nomina = 0;
		if (this.isHablaIngles()) {
			nomina = this.getSalario() + (this.calculaElementosDeUnaTabla(certificaciones) * 0.05F + 0.3F);
		} else {
			nomina = this.getSalario() + (this.calculaElementosDeUnaTabla(certificaciones) * 0.05F);
		}
		return nomina;
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