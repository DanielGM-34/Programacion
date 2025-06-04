package Recuperacion;

import java.util.List;

public class Instituto {
	private List<Grupo> Listagrupos;

	public Instituto(List<Grupo> listagrupos) {
		super();
		Listagrupos = listagrupos;
	}

	public List<Grupo> getListagrupos() {
		return Listagrupos;
	}

	public void setListagrupos(List<Grupo> listagrupos) {
		Listagrupos = listagrupos;
	}

	@Override
	public String toString() {
		return "Instituto [Listagrupos=" + Listagrupos + "]";
	}
	
	public void agregarGrupo(Grupo a) {
		this.getListagrupos().add(a);
	}

}
