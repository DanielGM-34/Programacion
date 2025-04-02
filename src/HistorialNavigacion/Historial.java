package HistorialNavigacion;

import java.util.Set;
import java.util.TreeSet;

public class Historial {
	Set<Historial> chivato;

	public Historial() {
		super();
		this.chivato = new TreeSet<Historial>();
	}
}
