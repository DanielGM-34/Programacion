package Modelo.vuelo;

import java.time.LocalDate;

public class GestionaVuelos {

	public static void main(String[] args) {
		Piloto p = new Comercial("pepe", "Español", 50, 1234);
		Vuelo v1 = new Vuelo("V001", "vuelin", "Portugal", LocalDate.now(), 10, Estadovuelo.PROGRAMADO);
		Vuelo v3 = new Vuelo("V002", "vuelin", "Portugal", LocalDate.now(), 10, Estadovuelo.PROGRAMADO);

		Vuelo vuelos[] = new Vuelo[30];

		vuelos[0] = v1;
		p.setVuelos(vuelos);
	
		try {
			p.getAgregarVuelo(v1);
		} catch (VueloExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}