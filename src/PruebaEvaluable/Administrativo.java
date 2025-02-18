package PruebaEvaluable;

public class Administrativo extends Empleado{
	private float extraProductividad;

	public Administrativo(String nombre, String dni, float salario, float extraProductividad) {
		super(nombre, dni, salario);
		this.salario= getSalario() + getExtraProductividad();
		this.extraProductividad =extraProductividad;
		}
	
	@Override
	public String toString() {
		return "Administrativo [extraProductividad=" + extraProductividad + ", getNombre()=" + getNombre()
				+ ", getDni()=" + getDni() + ", getSalario()=" + getSalario() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	protected float getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(float extraProductividad) {
		this.extraProductividad = extraProductividad;
	}
	
}