package Modelo.Mapas;

import java.util.Map;
import java.util.TreeMap;

public class RegistroEntradas {
	private Map<Entrada, Influencer> registro;

	public Map<Entrada, Influencer> getRegistro() {
		return registro;
	}

	public void setRegistro(Map<Entrada, Influencer> registro) {
		this.registro = registro;
	}

	public RegistroEntradas(Map<String, Influencer> registro) {
		super();
		this.registro = new TreeMap<Entrada, Influencer>();
	}

}
