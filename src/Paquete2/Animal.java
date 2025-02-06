package Paquete2;

public class Animal {
	String tipo;
	public String nombre;
	private int edad;

	public boolean caminar() {
		return true;
	}

	public void comer() {
		System.out.println("Estoy comiendo.");
	}

	void DarleDeComer() {
		if (tipo.equals("perro")) {
			comer();}
		}

		
		boolean sonDelMismoTipo(Animal a1, Animal a2) {
			boolean son=false;
			 son=tipo.equals(a1.tipo) && tipo.equals(a2.tipo);
			return son;
	}
}