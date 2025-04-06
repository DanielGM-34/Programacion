package Modelo.Agenda;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AgendaMapa implements Comparable<Contacto> {
	private Map<String, Contacto> agenda;
	
	public AgendaMapa() {
		super();
		this.agenda = new TreeMap<String, Contacto>();
	}

	public Map<String, Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<String, Contacto> agenda) {
		this.agenda = agenda;
	}

	@Override
	public int compareTo(Contacto o) {
		
		return 0;
	}

	public Set<Entry<String, Contacto>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
