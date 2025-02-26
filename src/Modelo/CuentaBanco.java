package Modelo;

import java.time.LocalDate;

public class CuentaBanco {
	private int idCuenta;
	private double saldo;
	private LocalDate fechaApertura;
	private String iban;
	private Cliente clienteTitular;
	private Cliente clienteAutorizado;
	private static int contador;

	public CuentaBanco(double saldo, LocalDate fechaApertura, String iban, Cliente clienteTitular,
			Cliente clienteAutorizado) {
		super();
		this.idCuenta = contador + 1;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.iban = iban;
		this.clienteTitular = clienteTitular;
	    this.clienteAutorizado = clienteAutorizado;
	    contador = contador + 1;
	}

	protected int getIdCuenta() {
		return idCuenta;
	}

	protected void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

	@Override
	public String toString() {
		return "CuentaBanco [idCuenta=" + idCuenta + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura + ", iban="
				+ iban + ", clienteTitular=" + clienteTitular + ", clienteAutorizado=" + clienteAutorizado + "]";
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Cliente getClienteTitular() {
		return clienteTitular;
	}

	public void setClienteTitular(Cliente clienteTitular) {
		this.clienteTitular = clienteTitular;
	}

	public Cliente getClienteAutorizado() {
		return clienteAutorizado;
	}

	public void setClienteAutorizado(Cliente clienteAutorizado) {
		this.clienteAutorizado = clienteAutorizado;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		CuentaBanco.contador = contador;
	}
}