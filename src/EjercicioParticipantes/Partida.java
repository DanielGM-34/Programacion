package EjercicioParticipantes;

import java.util.Arrays;

public class Partida {
	String nombreJuego;
	Participante[] participantes;
	Participante ganador;

	public Partida(String nombreJuego, Participante[] participantes, Participante ganador) {
		super();
		this.nombreJuego = nombreJuego;
		this.participantes = participantes;
		this.ganador = ganador;
	}
 
	@Override
	public String toString() {
		return "Partida [nombreJuego=" + nombreJuego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";
	}
	
	
	 Participante jugadorConMayorPuntuacion() {
		for(int i=0; i<participantes.length; i++) { 
		}
		return null;
	}

}
