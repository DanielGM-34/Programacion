package ExamenSorayaPOOOO;

public class MiembroPremium extends MiembroBase {
	private static int maximoAmigos = 100;
	TipoPremium tipo;

	public static int getMaximoAmigos() {
		return maximoAmigos;
	}

	public static void setMaximoAmigos(int maximoAmigos) {
		MiembroPremium.maximoAmigos = maximoAmigos;
	}

	public MiembroPremium(int id, String email, String nombre, TipoPremium tipo) {
		super(id, email, nombre);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "MiembroPremium [toString()=" + super.toString() + "]";
	}

	public String getTipoUsuario() {
		String tipoU;
		if (this.tipo == tipo.PREMIUM_VIP) {
			tipoU = "PREMIUM_VIP";
		}

		else {
			tipoU = "PREMIUM";
		}
		return tipoU;
	}

}