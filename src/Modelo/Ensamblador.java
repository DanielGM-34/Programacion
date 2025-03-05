package Modelo;

public class Ensamblador extends Robot {

	public Ensamblador(String nombre, int bateria, Estado estado, String combustible, String descripcion) {
		super(nombre, bateria, estado, combustible, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "ensamblar piezas";
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean recarga = false;
		if (this.getEstado() == estado.APAGADO ) {
			System.out.println("Recargando por " + this.getCombustible());
			recarga = true;
		} else {
			System.out.println("No puedo recargar.");
			recarga = false;
		}
		return recarga;
	}

}
