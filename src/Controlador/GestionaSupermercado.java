package Controlador;
import java.time.LocalDate;

import Modelo.*;

public class GestionaSupermercado {

	public static void main(String[] args) {
		Pescado [] pescados = new Pescado[2];
		Pescado p1 = new Pescado(1, "salmón", "sdsds", 0, 0, 0, null, 0, 0, null, null);
		
		pescados[0]= p1;
		System.out.println(p1.getCalorias()); 
		
	}

}
