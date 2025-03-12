package Modelo;

import java.util.Arrays;

public class PersonaRefactoriza {
	IAccion[] acciones;
	private String nombre;
	
	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new IAccion[10];

	}

	public PersonaRefactoriza() {
		super();
		this.acciones = new IAccion[10];
	}
 
	public String getNombre() {
		return nombre;
	}  

	@Override
	public String toString() {
		return "PersonaRefactoriza [acciones=" + Arrays.toString(acciones) + ", nombre=" + nombre + "]";
	}

	public IAccion[] getAcciones() {
		return acciones;
	}

	public void setAcciones(IAccion[] acciones) {
		this.acciones = acciones;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + this.getNombre());
	}

}