package Modelo;

public class AnimalP extends SerVivo {

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}

	public void comer() {
		System.out.println("come");
		
	}

	public void respirar() {
		System.out.println("respira");
	}

}