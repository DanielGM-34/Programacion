package ExamenPOO;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private TipoDieta dietaAsignada;
	private LocalDate fechaIncripcionCliente;
	private boolean clienteVip;

	public Cliente(String dni, String nombre, String apellidos, int edad, TipoDieta dietaAsignada,
			LocalDate fechaIncripcionCliente, boolean clienteVip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		setEdad(edad);
		this.dietaAsignada = dietaAsignada;
		this.fechaIncripcionCliente = fechaIncripcionCliente;
		this.clienteVip = clienteVip;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		if (edad < 0) {
			this.edad = 0;
		}

		else {
			this.edad = edad;
		}

	}

	protected TipoDieta getDietaAsignada() {
		return dietaAsignada;
	}

	protected void setDietaAsignada(TipoDieta dietaAsignada) {
		this.dietaAsignada = dietaAsignada;
	}

	protected LocalDate getFechaIncripcionCliente() {
		return fechaIncripcionCliente;
	}

	protected void setFechaIncripcionCliente(LocalDate fechaIncripcionCliente) {
		this.fechaIncripcionCliente = fechaIncripcionCliente;
	}

	protected boolean isClienteVip() {
		return clienteVip;
	}

	protected void setClienteVip(boolean clienteVip) {
		this.clienteVip = clienteVip;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	public boolean hayQueHacerPromocion() {
		boolean promo = true;
		if (clienteVip = true || edad > 65) {
			promo = true;
		}
		return clienteVip;
	}

	@Override
	public String toString() {
		return "Cliente [hayQueHacerPromocion()=" + hayQueHacerPromocion() + "]";
	}

	/*
	 * public void calculaPrecioMenu() { if()
	 * 
	 * }
	 */

}
