package Modelo.Mapas;

import java.time.LocalDate;

public class Entrada {
	private String codEntrada;
	private LocalDate fecha;
	private TipoEntrada tipo;
	private EstadoEntrada estado;

	public String getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(String codEntrada) {
		this.codEntrada = codEntrada;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoEntrada getTipo() {
		return tipo;
	}

	public void setTipo(TipoEntrada tipo) {
		this.tipo = tipo;
	}

	public EstadoEntrada getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntrada estado) {
		this.estado = estado;
	}

	public void asignarEstadoEntrada(EstadoEntrada nuevoEstado) {
		this.estado = nuevoEstado;
	}

	public void confirmar() {
		this.setEstado(EstadoEntrada.CONFIRMADA);
	}

	public void cancelar() {
		this.setEstado(EstadoEntrada.CANCELADA);
	}

	public Entrada(String codEntrada, LocalDate fecha, TipoEntrada tipo, EstadoEntrada estado) {
		super();
		this.codEntrada = codEntrada;
		this.fecha = fecha;
		this.tipo = tipo;
		this.estado = EstadoEntrada.ENVIADA;
	}

}
