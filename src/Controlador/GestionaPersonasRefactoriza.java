package Controlador;

import Modelo.*;

public class GestionaPersonasRefactoriza {

	public static void main(String[] args) {
		PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos R.");
		IAccion[] acciones = carlos.getAcciones();
		acciones[0] = new Estudiante();
		System.out.println(carlos);

		PersonaRefactoriza cristina = new PersonaRefactoriza("Cristina S.");
		acciones[1] = new EstudianteEmpleado();
		System.out.println(cristina);
		
		PersonaRefactoriza fernando = new PersonaRefactoriza("Fernando B.");
		acciones[0] = new Estudiante();
		acciones[1] = new Empleadopi();
		acciones[0] = new Cliente4();
		System.out.println(fernando);
	}
}