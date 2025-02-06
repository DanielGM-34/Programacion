package EjercicioCubo;

 class Cubo {
	int lado;
	float volumenMax;
	int litrosActuales;
	
	public Cubo(int lado) {
		super();
		this.lado = lado;
		this.volumenMax = calcularVolumen();
		this.litrosActuales = 0;
	} 
  
	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", volumenMax=" + volumenMax + ", litrosActuales=" + litrosActuales + "]";
	}

	float calcularArea() {
		float area = 6 * (lado * lado);
		return area;
	}

	float calcularVolumen() {
		float volumenMax = lado * lado * lado;
		return volumenMax;
	}

	void imprimeAreaYVolumen() {
		System.out.println("El área del cubo es de " + calcularArea() + " dm² y el volumen es de " + calcularVolumen()
				+ " litros.");
	}

	boolean llenarCubo(int nLitros) {
		boolean llenarCubo = false;
		if (nLitros > 0 && litrosActuales + nLitros <= volumenMax) {
			litrosActuales = litrosActuales + nLitros;
			llenarCubo = true;

			System.out.println(llenarCubo + " Cubo llenado con " + nLitros + " litros, volumen actual: " + litrosActuales);
		} else {
			llenarCubo = false;
			System.out.println(llenarCubo);
		}
		return llenarCubo;
	}

	boolean vaciarCubo(int nLitros) {
		boolean vaciarCubo = false;
		if (nLitros > 0 && litrosActuales >= nLitros) {
			vaciarCubo = true;

			litrosActuales = litrosActuales - nLitros;
			System.out.println(vaciarCubo + " Cubo vaciado con " + nLitros + " litros, volumen actual: " + litrosActuales);

		} else {
			vaciarCubo = false;
			System.out.println(vaciarCubo);
		}
		return vaciarCubo;
	}
}