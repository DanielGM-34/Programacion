package POO;

public class Gato {
	String color;
	String raza;
	String sexo;
	int edad;
	float peso;
	String comida;
	

	/*
	public Gato(String color, String sexo, int edad, float peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	
	
	
	*/
	
	
	
	
	
	
	
	void maulla() {
		System.out.println("miuauuuuu");
	}



	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ "]";
	}



	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	void ronronea() {

		System.out.println("rrrr");
	}

	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		} else {
			System.out.println("buahhh, mejor no");
		}
	}

	
	void pelear(Gato g) {
		if (sexo.equals(g.sexo)) {
			System.out.println("ven aquí que te vas a enterar");
		} 
	
		else {
			System.out.println("la violencia nunca es la solución");
		}

	}
}