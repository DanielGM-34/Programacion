package EjercicioEmpleados.copy;

public class Empleado {
	String nombre;

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salarioMensual=" + salarioMensual
				+ ", departamento=" + departamento + "]";
	}

	String apellido;
	int salarioMensual;
	String departamento;

	public Empleado(String nombre, String apellido, int salarioMensual, String departamento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
		this.departamento = departamento;
	}

	int calcularSalarioAnual() {
		int salarioAnual = salarioMensual * 12;
		return salarioAnual;
	}
	
	
	
	
	
}
