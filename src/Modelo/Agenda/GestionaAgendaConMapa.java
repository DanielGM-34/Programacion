package Modelo.Agenda;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionaAgendaConMapa {

	public static void main(String[] args) {
		Contacto b1 = new Contacto("Pepe", "López", "pepe@gmail.com", "Calle false 2", "+34 968 355 175");
		Contacto b2 = new Contacto("Maria", "Perez", "maria@gmail.com", "Calle false 2", "+34 889 385 145");
		Contacto b3 = new Contacto("Antonio", "Garfia", "antonio@gmail.com", "Calle false 2", "+34 458 375 145");
		Contacto b4 = new Contacto("Lidia", "Ortega", "lidia@gmail.com", "Calle false 2", "+34 672 325 195");
		AgendaMapa a = new AgendaMapa();
		a.getAgenda().put("1245678", b1);
		a.getAgenda().put("8857745", b2);
		a.getAgenda().put("4545878", b3);
		a.getAgenda().put("1245678", b4);
		System.out.println(a.getAgenda().size());

		
		/*
		Set<Map.Entry<String, Contacto>> entradas = a.entrySet();
		Entry<String, Contacto> elemento;

		Iterator it = entradas.iterator();
		while (it.hasNext()) {
			elemento = (Entry<String, Contacto>) it.next();
			elemento.getKey();
			elemento.getValue();
			System.out.println(elemento);
		}
		*/

		/* Devuelve las claves. */
		System.out.println(a.getAgenda().keySet());

		/* Devuelve los valores del mapa. */
		System.out.println(a.getAgenda().values());
		System.out.println(a.getAgenda().toString());

		/* Devuelve el valor. */
		System.out.println(a.getAgenda().get("454554"));

	}

}
