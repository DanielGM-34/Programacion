package EjercicioVechiculos.copy;

public class Vechiculo {
	String marca;
	String modelo;
	float anyoFab;
	String tipoCombustible;

	float capacidadMax;
	float cantidadCombustibleActual;
	float consumoMedioLitroPor100kms;

	public Vechiculo(String marca, String modelo, float anyoFab, String tipoCombustible,
			float cantidadCombustibleActual, float capacidadMax, float consumoMedioLitroPor100kms) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyoFab = anyoFab;
		this.capacidadMax = capacidadMax;
		this.cantidadCombustibleActual = cantidadCombustibleActual;
		this.tipoCombustible = tipoCombustible;
		this.consumoMedioLitroPor100kms = consumoMedioLitroPor100kms;

	}

	@Override
	public String toString() {
		return "Vechiculos [marca=" + marca + ", modelo=" + modelo + ", anyoFab=" + anyoFab + ", capacidadMax="
				+ capacidadMax + ", cantidadCombustibleActual=" + cantidadCombustibleActual + ", tipoCombustible="
				+ tipoCombustible + "]";
	}

	float calcularConsumo(float kms) {
		float consumo = (kms * consumoMedioLitroPor100kms)/100;
		System.out.println("Te gastarías " + consumo + " litros.");
		return consumo;
	}

	boolean hayQueRepostar() {
		boolean repostar;

		if (cantidadCombustibleActual < (0.2 * capacidadMax)) {
			repostar = true;
		}

		else {
			repostar = false;
		}
		return repostar;
	}
}