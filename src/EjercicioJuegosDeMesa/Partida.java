package EjercicioJuegosDeMesa;

import java.util.Arrays;

public class Partida {
	@Override
	public String toString() {
		return "Partida [nombre=" + nombre + ", parcipantes=" + Arrays.toString(participantes) + ", ganador=" + ganador
				+ "]";
	}

	public Partida(String nombre, Participante[] parcipantes) {
		super();
		this.nombre = nombre;
		this.participantes = parcipantes;
		this.ganador = obtenerGanador();
	}

	String nombre;
	Participante[] participantes;
	Participante ganador;

	private Participante obtenerGanador() {
		ganador = participantes[0];
		for (Participante p : participantes) {
			if (p.puntuacion > ganador.puntuacion) {
				ganador = p;
			}
		}
		return ganador;
	}
	
	
	void obtenerMayorPerdedor() {
		ganador = participantes[0];
		for (Participante p : participantes) {
			if (p.puntuacion < ganador.puntuacion) {
				ganador = p;
			}
		}
		System.out.println("El mayor perdedor es" + ganador);

	}

	void ImprimeGanador() {
		System.out.println("Estos son los datos del ganador: " + ganador);
	}
}
