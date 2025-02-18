package SimulacionPOO;

import java.util.Objects;

enum EstadoCoche {
	ARRANCADO, PARADO, AVERIADO;
}

public class Coche {
	private String marca;
	private String matricula;
	private String modelo;
	private String dueño;
	private EstadoCoche estado;

	
	
	
	protected EstadoCoche getEstado() {
		return estado;
	}

	protected void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}



	public Coche(String marca, String matricula, String modelo, String dueño) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.dueño = dueño;
		this.estado = EstadoCoche.PARADO;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getDueño() {
		return dueño;
	}

	protected void setDueño(String dueño) {
		this.dueño = dueño;
	}



	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", dueño=" + dueño
				+ ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}

	public void arrancar(String conductor) {
		if (conductor.equals(getDueño())) {
			setEstado(EstadoCoche.ARRANCADO);
		} else {
			setEstado(EstadoCoche.PARADO);
		}
	}
	
	public void verificarSiDebeParar(boolean sensorObstaculo) {
        if (getEstado() == EstadoCoche.ARRANCADO && sensorObstaculo) {
            setEstado(EstadoCoche.PARADO);
        }
    }
	
}