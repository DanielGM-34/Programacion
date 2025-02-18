package SimulacionPOO;

public class Sensor{
	private double distancia;
	private double velocidad;

	protected double getDistancia() {
		return distancia;
	}

	protected void setDistancia(double distancia) {
		if (distancia > 0) {
			this.distancia = distancia;
		} else {
			this.distancia = 0;
		}

	}

	protected double getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(double velocidad) {

		if (velocidad > 0) {
			this.velocidad = velocidad;
		} else {
			this.velocidad = 0;
		}
	}

	@Override
	public String toString() {
		return "Sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
	}

	public Sensor(double distancia, double velocidad) {
		super();
		setDistancia(distancia);
		setVelocidad(velocidad);
	}

	public void avisarObstaculoCercano() {
		if (getDistancia() < 50) {
			System.out.println("¡¡Obstáculo cercano!!]");
		}

	}

	public void avisarVelocidad() {
		if (getVelocidad() > 120) {
			System.out.println("Velocidad mayor de 120km/h");
		}

		else {
			System.out.println("Velocidad adecuada.");
		}
	}

}