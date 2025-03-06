package Modelo;

public class RobotSoldador extends Robot {
	private double temperatura;
	private String especificacion;

	public RobotSoldador(String nombre, int bateria, Estado estado, String combustible, String descripcion,
			double temperatura, String especificacion) {
		super(nombre, bateria, estado, combustible, descripcion);
		this.temperatura = temperatura;
		this.especificacion = especificacion;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "realizar soldaduras precisas en la carrocería del automóvil";
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean recarga = false;
		if (this.getEstado() == getEstado().APAGADO) {
			System.out.println("Recargando por " + this.getCombustible());
			recarga = true;
		} else {
			System.out.println("Estoy encendido y no puedo recargar.");
			recarga = false;
		}
		return recarga;
	}

	/*
	 * @Override public String toString() { return
	 * "RobotSoldador [getEspecificacion()=" + getEspecificacion() +
	 * ", getTemperatura()=" + getTemperatura() + "]"; }
	 */
}