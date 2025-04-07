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

	public RegistroEntradas() {
		super();
		this.registro = new TreeMap<Entrada, Influencer>();
	}

	public boolean añadirEntrada(Influencer a, Entrada entrada) {
		boolean Noagregado;
		if (registro.containsKey(a)) {
			System.out.println("El influencer ya tiene una entrada asignada.");
			Noagregado = false;
		} else {
			System.out.println("Entrada agregada.");
			registro.put(entrada, a);
			Noagregado = true;
		}
		return Noagregado;
	}

	public Influencer buscarEntradaAPartirDeNick(Influencer a) {
	    return registro.get(a.getNick() + ":" + a.getPlataforma());
	}
	


}
