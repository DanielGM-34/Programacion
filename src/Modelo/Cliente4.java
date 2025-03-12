package Modelo;

public class Cliente4 extends PersonaRefactoriza implements IAccion {

	public void comprar() {
		System.out.println(this.getNombre() + " está comprando.");
	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}

	@Override
	public String ejecutaAcciones() {
		// TODO Auto-generated method stub
		return "Estoy comprando";
	}
}