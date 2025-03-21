package Modelo.vuelo;

import java.time.LocalDate;

public class GestionaVuelos {

	public static void main(String[] args) {
		Piloto p = new Comercial("pepe", "Español", 50, 1234);
		Vuelo v = new Vuelo("V001", "vuelin", "Portugal", LocalDate.now(), 10, Estadovuelo.PROGRAMADO);
		Vuelo v2 = new Vuelo("V002", "vuelin", "Portugal", LocalDate.now(), 10, Estadovuelo.PROGRAMADO);

		Vuelo vuelos[] = new Vuelo[30];

		vuelos[0] = v;
		p.setVuelos(vuelos);

		try {
			p.getAgregarVuelo(v);
			p.getAgregarVuelo(v2);
		} catch (VueloExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}