package EjercicioSinHerencia;

public class Automovil extends Vehiculo {
    String califiacionEcologica;

    public Automovil(String dueno, int numPuertas, String califiacionEcologica) {
        super(dueno, numPuertas); // Llama al constructor de la clase base (Vehiculo)
        this.califiacionEcologica = califiacionEcologica;
    }

    public String getCalifiacionEcologica() {
        return califiacionEcologica;
    }

    public void setCalifiacionEcologica(String califiacionEcologica) {
        this.califiacionEcologica = califiacionEcologica;
    }

    @Override
    public String toString() {
        return "Automovil [dueno=" + dueno + ", numPuertas=" + numPuertas + ", califiacionEcologica=" + califiacionEcologica + "]";
    }
}
