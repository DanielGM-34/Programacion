package POO;

import java.util.Arrays;

public class Equipo {
	String nombreEquipo;
	int[] puntuaciones;
	public Persona[] personas;

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", personas=" + Arrays.toString(personas) + "]";
	}

	public Equipo(String nombreEquipo, int[] puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}

	public float calculaMedia() {
		float mediaEdad = 0f;
		float edades = 0;
		Persona[] tablaPersona = this.personas;

		for (Persona p : tablaPersona) {

			System.out.println(p.edad);
			edades = (edades + p.edad);
			System.out.println();

		}

		mediaEdad = edades / tablaPersona.length;
		return mediaEdad;

	}
}