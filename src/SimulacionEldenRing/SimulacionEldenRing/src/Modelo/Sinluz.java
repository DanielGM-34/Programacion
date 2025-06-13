package SimulacionEldenRing.SimulacionEldenRing.src.Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Sinluz implements Comparable<Sinluz> {
	static int contador;
	private int id;
	private String nombre;
	private List<Encuentro> encuentros;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Sinluz.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Encuentro> getEncuentros() {
		return encuentros;
	}

	public void setEncuentros(List<Encuentro> encuentros) {
		this.encuentros = encuentros;
	}

	public Sinluz(String nombre) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
		this.encuentros = new ArrayList<Encuentro>();
	}
	
	public boolean mayorA6() {
		boolean mayor6=false;
		Iterator<Encuentro> it = this.getEncuentros().iterator();
		while (it.hasNext() && !mayor6) {
			Encuentro e= it.next();
	
		if (e.getDificultad()>5) {
			mayor6 = true;
		}
			
		}
		return mayor6;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinluz other = (Sinluz) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Sinluz [id=" + id + ", nombre=" + nombre + ", encuentros=" + encuentros + "]";
	}

	@Override
	public int compareTo(Sinluz o) {
		return this.getNombre().compareTo(o.getNombre());
	}

}
