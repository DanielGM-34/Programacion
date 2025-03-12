package Modelo;

public class Empleadopi extends PersonaRefactoriza implements IAccion {

	@Override
	public String ejecutaAcciones() {
		return "Trabajador que trabaja.";
	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}