package Simulacro;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
	private int id;
	private String nombre;
	private String descripcion;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;
	private Equipos equipo;
	private Estado estado;
	private Criticidad criticidad;
 
	public Incidente(int id, String nombre, String descripcion, LocalDate fechaApertura, LocalDate fechaCierre,
			Equipos equipo, Estado estado, Criticidad criticidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaApertura = fechaApertura;
		setFechaCierre(fechaCierre);
		this.equipo = equipo;
		setEstado(estado);
		this.criticidad = criticidad;

	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFechaApertura() {
		return fechaApertura;
	}

	protected void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	protected LocalDate getFechaCierre() {
		return fechaCierre;
	}

	protected void setFechaCierre(LocalDate fechaCierre) {
		if (estado != estado.CERRADA) {
			this.fechaCierre = null;
		} else {
			this.fechaCierre = fechaCierre;
		}
	}

	protected Equipos getEquipo() {
		return equipo;
	}

	protected void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		if (estado == estado.CERRADA) {
			this.fechaCierre = LocalDate.now();
		} else {
			this.estado = estado;
		}
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}




	@Override
	public String toString() {
		return nombre + estado +" : " + criticidad  +" "+ fechaApertura + " - "+ equipo.getNombreEquipo();
	}

	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaApertura, fechaCierre, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaApertura, other.fechaApertura) && Objects.equals(fechaCierre, other.fechaCierre)
				&& id == other.id && Objects.equals(nombre, other.nombre);
	}

	public boolean esUrgente() {
		boolean urgente = false;
		LocalDate hoy = LocalDate.now();

		if (criticidad == criticidad.GRAVE) {
			System.out.println("Es urgente.");
			urgente = true;
		}

		else if (criticidad == criticidad.GRAVE && this.fechaApertura.plusDays(7).isAfter(hoy)) {
			urgente = true;
		}

		else if (criticidad == criticidad.MEDIA && this.fechaApertura.plusMonths(1).isAfter(hoy)) {
			urgente = true;
		} else {
			urgente = false;
		}
		return urgente;
	}
	
	
	
	
	
}