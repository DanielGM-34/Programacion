package Simulacro;

public class GestionaIncidenciasEquipo {

	public static void main(String[] args) {
		Equipos q1 = new Equipos("Pepe", "3T:D0:2P:99:34:BB", "Windows", 0);
		Equipos q2 = new Equipos("Alberto", "3T:D0:2P:99:34:BB", "Linux", 1);
		Equipos q3 = new Equipos("Alberto", "3T:D0:2P:99:34:5B", "Linux", 5);
		Equipos q4 = new Equipos("Alberto", "3T:D0:2P:99:54:59", "Windows", 1);

		Incidente in1 = new Incidente(0, null, null, null, null, q1, null, null);
		Incidente in2 = new Incidente(0, null, null, null, null, q1, null, null);
		Incidente in3 = new Incidente(0, null, null, null, null, q1, null, null);
		Incidente in4 = new Incidente(0, null, null, null, null, q1, null, null);
		Incidente in5 = new Incidente(0, null, null, null, null, q1, null, null);
		Incidente in6 = new Incidente(0, null, null, null, null, q1, null, Criticidad.CRITICA);

		Incidente[] incidenciaDep = { in1, in2, in3, in4, in5, in6 };
	}
}