package EjercicioSinHerencia;

public class Camion extends Vehiculo {
    int numRuedas;
    int tonelajeKilos;
    int numPasajeros;
    int numEjes;

    public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
        super(dueno, numPuertas); // Llama al constructor de la clase base (Vehiculo)
        this.numRuedas = numRuedas;
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
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

    @Override
    public String toString() {
        return "Camion [dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", tonelajeKilos="
                + tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + "]";
    }
}
