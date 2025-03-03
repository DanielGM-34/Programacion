package traza;

public class Cuenta {
	static int contador1; // Contador 1
	static int contador2; // Contador 2

	public Cuenta() {
		contador1 = 0;
		contador2 = 0;
	}

	public void incrementa1() {
		contador1++;
	}

	public void incrementa2() {
		contador2++;
	}

	public static void incrementa() {
		contador1++;
		contador2++;
	}

	public static void main(String[] args) {
		Cuenta.contador1 = 1;
	}
}
