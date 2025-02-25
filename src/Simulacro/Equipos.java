package Simulacro;

import java.util.Objects;

public class Equipos {
	private String nombreEquipo;
	private String direccion;
	private String sistemaOperativo;
	private int numIncidentes;

	public Equipos(String nombreEquipo, String direccion, String sistemaOperativo, int numIncidentes) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccion = direccion;
		this.sistemaOperativo = sistemaOperativo;
		this.numIncidentes = numIncidentes;
	}

	protected String getNombreEquipo() {
		return nombreEquipo;
	}

	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	protected int getNumIncidentes() {
		return numIncidentes;
	}

	protected void setNumIncidentes(int numIncidentes) {
		this.numIncidentes = numIncidentes;
	}

	@Override
	public String toString() {
		return   nombreEquipo + " - " + direccion + ", numIncidentes pendi=" + numIncidentes
				+ "]";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipos other = (Equipos) obj;
		return Objects.equals(direccion, other.direccion);
	}

}