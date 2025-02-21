package PruebaEvaluable;

public class Directivo extends Empleado {
	private float bonificacion;

	public Directivo(String nombre, String dni, float salario, float bonificacion) {
		super(nombre, dni, salario);
		this.bonificacion = bonificacion;
	}

	protected float getBonificacion() {
		return bonificacion;
	}

	protected void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	public float calcularSalariBonificacion() {
		return (bonificacion * this.getSalario() / 100) + this.getSalario();
	}

	@Override
	public String toString() {
		return "DNI: " + getDni() + " - Nombre: " + getNombre() + " - Salario: " + this.calcularSalariBonificacion();
	}

}