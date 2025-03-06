package Modelo;

public class RobotEnsamblador extends Robot {

	public RobotEnsamblador(String nombre, int bateria, Estado estado, String combustible, String descripcion) {
		super(nombre, bateria, estado, combustible, descripcion);
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "ensamblar piezas.";

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
}
