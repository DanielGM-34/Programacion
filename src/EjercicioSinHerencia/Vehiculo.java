// Clase base común
package EjercicioSinHerencia;

public class Vehiculo {
    String dueno;
    int numPuertas;

    public Vehiculo(String dueno, int numPuertas) {
        this.dueno = dueno;
        this.numPuertas = numPuertas;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Vehiculo [dueno=" + dueno + ", numPuertas=" + numPuertas + "]";
    }
}