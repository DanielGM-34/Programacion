package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Dispositivo {
	private static int contador;
	private int id;
	private String mac;
	private EstadoDispositivo estado;
	private LocalDate fecha;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		this.mac = mac;
	}

	protected EstadoDispositivo getEstado() {
		return estado;
	}

	protected void setEstado(EstadoDispositivo estado) {
		this.estado = estado;
	}

	protected LocalDate getFecha() {
		return fecha;
	}

	protected void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Dispositivo(String mac, EstadoDispositivo estado, LocalDate fecha) {
		super();
		this.id = contador;
		this.mac = mac;
		this.estado = estado;
		this.fecha = fecha;
		contador += 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mac);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(mac, other.mac);
	}
	
	public abstract void conectarInternet();

	public abstract boolean pendienteActualización();

	public void apagar() {
		this.setEstado(EstadoDispositivo.OFF);
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", mac=" + mac + ", estado=" + estado + ", fecha=" + fecha + "]";
	};

}
