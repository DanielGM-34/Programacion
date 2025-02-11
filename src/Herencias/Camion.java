package Herencias;

public class Camion extends Vehiculo {
	private int tonelajeKilos;
	private int numPasajeros;
	private int numEjes;

	public int getTonelajeKilos() {
		return tonelajeKilos;
	}

	public Camion(String dueno, int numPuertas,int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
		super(dueno, numPuertas, numRuedas);
		this.tonelajeKilos = tonelajeKilos;
		this.numPasajeros = numPasajeros;
		this.numEjes = numEjes;
	}

	
	@Override
	public String toString() {
		return "Camion [tonelajeKilos=" + tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes
				+ ", dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}

	public void setTonelajeKilos(int tonelajeKilos) {
		this.tonelajeKilos = tonelajeKilos;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	void imprimeResumen() {
		this.toString();
	}

	
	public void tipoLicencia() {
		if(getTonelajeKilos() > 3500 && getNumPasajeros() <=9 ) {
			System.out.println("Tipo de carnet C");
		}
		
		else if (getTonelajeKilos() >=3500 && getTonelajeKilos() <=7500  && getNumPasajeros() <=9)  {
			System.out.println("Tipo de carnet C1");
		}
		
		else if (getTonelajeKilos()==750)  {
			System.out.println("Tipo de carnet C1+E");
		}
		
		else {
			System.out.println("Tipo de carnet C+E");
		}
	}
	
	String[] getLicencias() {
		return null;
	}
	
	
	
	
	

}