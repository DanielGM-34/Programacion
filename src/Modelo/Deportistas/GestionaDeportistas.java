package Modelo.Deportistas;

import java.time.LocalDate;

public class GestionaDeportistas {
    public static void main(String[] args) throws CompeticionException {
        Prueba pruebas[] = new Prueba[50];
        Prueba pito = new Prueba(27, LocalDate.now(), EstadoPrueba.EN_CURSO);
        pruebas[0] = pito;

        Prueba pito2 = new Prueba(5, LocalDate.of(2000, 5, 5), EstadoPrueba.EN_CURSO);
        pruebas[1] = pito2; 

        System.out.println(pruebas[0]);
        Deportista a = new Corredor("Pepe", "Alemania", 55, 88.5, 1.98, pruebas);
        a.competir();
        System.out.println(a.getTiempoPrueba(LocalDate.of(2025, 1, 4)));

        Prueba nuevaPrueba = new Prueba(27, LocalDate.now(), EstadoPrueba.EN_CURSO);

        try {
            for (int i = 0; i < pruebas.length; i++) {
                if (pruebas[i] != null && pruebas[i].equals(pruebas[i])) {
                    throw new CompeticionException("Son iguales");
                }
            }
        } catch (CompeticionException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
