package Excepciones;

public class Ejercicio2BoletinExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2BoletinExcp p = new Ejercicio2BoletinExcp();
		p.m1();

	}

	public boolean m1() throws NullPointerException {
		throw new NullPointerException("Genero NullPointer");
	}
}