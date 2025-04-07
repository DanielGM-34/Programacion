package Modelo.Mapas;

import java.util.Iterator;
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

	public boolean añadirEntrada(Entrada entrada, Influencer a) {
		boolean agregado;
		if (registro.containsKey(entrada)) {
			System.out.println("El influencer ya tiene una entrada asignada.");
			agregado = false;
		} else {
			System.out.println("Entrada agregada.");
			registro.put(entrada, a);
			agregado = true;
		}
		return agregado;
	}

	public void listarInfluencers() {
		Iterator<Entrada> iterator = registro.keySet().iterator();
		while (iterator.hasNext()) {
			Entrada entrada = iterator.next();
			if (entrada.getEstado() == EstadoEntrada.CONFIRMADA) {
				System.out.println(registro.get(entrada));
			} else if (entrada.getEstado() == EstadoEntrada.CANCELADA) {
				System.out.println(registro.get(entrada));
			} else if (entrada.getEstado() == EstadoEntrada.ENVIADA) {
				System.out.println(registro.get(entrada));
			}

		}
	}

}
