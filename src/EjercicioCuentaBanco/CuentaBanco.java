package EjercicioCuentaBanco;

public class CuentaBanco {
	public CuentaBanco(double saldo, String numCuenta, Personas titular) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.autorizado = autorizado;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Personas getTitular() {
		return titular;
	}

	public void setTitular(Personas titular) {
		this.titular = titular;
	}

	public Personas getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Personas autorizado) {
		this.autorizado = autorizado;
	}

	private double saldo;
	private String numCuenta;
	private Personas titular;
	private Personas autorizado;

	private boolean validaImportePositivo(double importe) {
		return importe > 0;
	}

	private boolean validarAutorizado(String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}

	public void ingresarDinero(Personas personaGestion, double ingreso) {
		if (validarAutorizado(personaGestion.getDni()) && validaImportePositivo(ingreso)) {
			setSaldo(getSaldo() + ingreso);
		}

		else {
			System.out.println("error");
		}
	}

	public void retirarDinero(Personas personaGestion, double retirarDinero) {
		if (validarAutorizado(personaGestion.getDni()) && validaImportePositivo(retirarDinero)

				&& getSaldo() >= retirarDinero) {
			setSaldo(getSaldo() - retirarDinero);
		}
	}

	public void eliminarAutorizado(String dni) {
		if (validarAutorizado(dni)) {
			autorizado = null;
		} else {
			System.out.println("la persona no está autorizada.");
		}

	}

}
