package SimulacionPOO;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anyosXP;

	public Conductor(String nombre, int anyosXP) {
		super();
		this.nombre = nombre;
		setAnyosXP(anyosXP);
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getAnyosXP() {
		return anyosXP;
	}

	protected void setAnyosXP(int anyosXP) {
		if (anyosXP > 0) {
			this.anyosXP = anyosXP;
		}

		else {
			this.anyosXP = 0;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(anyosXP, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anyosXP == other.anyosXP && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anyosXP=" + anyosXP + "]";
	}

	public void nombreConductor() {
		System.out.println(getNombre() + " Conduciendo");
	}

}
