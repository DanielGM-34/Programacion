package SIMULACIONES;

public class Nota {
	private float nota;

	public Nota(float nota) {
		super();
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nota [nota=" + nota + "]";
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
}
