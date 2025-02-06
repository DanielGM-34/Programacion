package EjercicioParticipantes;

public class Participante {
	public Participante(String nick, String nombre, int edad, double puntuacion) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}

	String nick;
	String nombre;
	int edad;
	double puntuacion;

	@Override
	public String toString() {
		return "Participante [nick=" + nick + ", nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion
				+ "]";
	}
}
