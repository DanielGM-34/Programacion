package PruebaEvaluable;

public class Administrativo extends Empleado {

	public Administrativo(String nombre, String dni, float salario, float extraProductividad) {
		super(nombre, dni, salario);
		this.extraProductividad = extraProductividad;
	}

	private float extraProductividad;

	public float calcularSalarioTotal() {
		return this.getSalario() + extraProductividad;
	}

	protected float getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(float extraProductividad) {
		this.extraProductividad = extraProductividad;
	}

	@Override
	public String toString() {
		return "DNI: " + getDni() + " Nombre: " + getNombre() + " - Salario: " + this.calcularSalarioTotal();
	}
}