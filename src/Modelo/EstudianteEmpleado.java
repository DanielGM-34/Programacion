package Modelo;

public class EstudianteEmpleado extends Estudiante implements IAccion {
	@Override
	public String toString() {
		return  ejecutaAcciones() ;
	}

	@Override
	public String ejecutaAcciones() {
		// TODO Auto-generated method stub
		return "Estoy estudiando y trabajando";
	}
}
