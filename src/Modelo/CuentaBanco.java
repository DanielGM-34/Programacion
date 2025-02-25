package Modelo;

import java.time.LocalDate;

public class CuentaBanco {
	private double saldo;
	private LocalDate fechaApertura;
	private String iban;
	private Cliente clienteTitular;
	private Cliente clienteAutorizado;
	private static int contador;
}