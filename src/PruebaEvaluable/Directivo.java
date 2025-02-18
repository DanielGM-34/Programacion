package PruebaEvaluable;

public class Directivo extends Empleado{
	private float bonificacion;

	public Directivo(String nombre, String dni, float salario, float bonificacion) {
		super(nombre, dni, salario);
		this.bonificacion = bonificacion;
	}

	@Override 
	public String toString() {
		return "Directivo [bonificacion=" + bonificacion + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", getSalario()=" + getSalario() + "]";
	}
	
}