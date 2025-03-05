package Modelo;

public class RobotPintor extends Robot {

	public RobotPintor(String nombre, int bateria, Estado estado, String combustible, String descripcion) {
		super(nombre, bateria, estado, combustible, descripcion);
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "Aplicar pintura a vehículos de manera uniforme";
		return tarea;
	}

	@Override
	public boolean recargar() {
		System.out.println("Recargando por " + this.getCombustible());
		return true;
	}
}