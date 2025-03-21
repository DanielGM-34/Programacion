package Modelo.Deportistas;

import java.time.LocalDate;

public class GestionaDeportistas {
    public static void main(String[] args) throws CompeticionException {
    	Prueba pruebas []= new Prueba[50];
    	
        Prueba pito = new Prueba(27, LocalDate.now(), EstadoPrueba.EN_CURSO);
        
        Deportista c = new Corredor("Juanki", "Rumania", 85, 89, 198, null);
        Prueba prueba2 = new Prueba(5, LocalDate.now().plusDays(10), EstadoPrueba.PLANIFICADA);
        
        pruebas[1]= prueba2;
        c.setPruebas(pruebas);
        
        System.out.println(c.getPruebaMasCercana());

        Prueba nuevaPrueba = new Prueba(27, LocalDate.now(), EstadoPrueba.EN_CURSO);
        
        
        
        
        
        
    }
}