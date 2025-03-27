package ListasNuevasMarzo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		lista.add("antonio");
		lista.add("pepe");
		lista.add("pepe");
		lista.add("pepe");
		lista.add("pepe");
		lista.add("pepe");
		lista.add("juan");

		System.out.println(lista.toString());
		System.out.println(lista.reversed());
		System.out.println(lista.size());
		System.out.println(lista.remove(0));
		System.out.println(lista.remove("pepe"));
		System.out.println(lista.toString());
		for (String d : lista) {
			System.out.println(d);
		}

		// LinkedList= modificar muchas veces.

		// ArrayLists= si no dice nada el enunciado.
		List<String> nombre = new LinkedList<String>();
		nombre.add("pepe");
		nombre.add("Manuel");
		nombre.add("pepe");
		nombre.add("Manuel");
		nombre.add("pepe");
		nombre.add("Manuel");
		nombre.add("pepe");
		nombre.add("Manuel");
		Iterator<String> itr = nombre.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}