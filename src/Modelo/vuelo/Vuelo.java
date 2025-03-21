package Modelo.vuelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	private String identificador;
	private String aerolinea;
	private String destino;
	private LocalDate fechaVuelo;
	private int duracion;
	Estadovuelo estado;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getAerolinea() { 
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Estadovuelo getEstado() {
		return estado;
	}

	public void setEstado(Estadovuelo estado) {
		this.estado = estado;
	}
	
	public int getSumaTotalHorasVuelo() {
		return 0;
	}

	public Vuelo(String identificador, String aerolinea, String destino, LocalDate fechaVuelo, int duracion,
			Estadovuelo estado) {
		super();
		this.identificador = identificador;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.duracion = duracion;
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(identificador, other.identificador);
	}

	
	
	
}