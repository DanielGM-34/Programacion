package ListasNuevasMarzo;

import java.util.ArrayList;
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
		
		
	}

}