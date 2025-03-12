package Modelo;

public class Estudiante extends PersonaRefactoriza implements IAccion {

	@Override
	public String toString() {
		return  ejecutaAcciones() ;
	}

	@Override
	public String ejecutaAcciones() {
		// TODO Auto-generated method stub
		return "Estoy estudiando";
	}

}