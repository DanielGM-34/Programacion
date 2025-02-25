package Modelo;

public class Animal {
	private String tipo;
	public String nombre;
	private int edad;

	public boolean caminar() {
		return true;
	}

	public void comer() {
		System.out.println("Estoy comiendo.");
	}

	public void DarleDeComer() {
		if (getTipo().equals("perro")) {
			comer();}
		}

		
		public boolean sonDelMismoTipo(Animal a1, Animal a2) {
			boolean son=false;
			 son=getTipo().equals(a1.getTipo()) && getTipo().equals(a2.getTipo());
			return son;
	}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}