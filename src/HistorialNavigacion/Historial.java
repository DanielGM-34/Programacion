package HistorialNavigacion;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Historial {
	Set<PaginaWeb> chivato;

	public Historial() {
		super();
		this.chivato = new TreeSet<PaginaWeb>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(chivato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historial other = (Historial) obj;
		return Objects.equals(chivato, other.chivato);
	}

	public Set<PaginaWeb> hisCompleto() {
		return this.chivato;
	}

	public void agregarPag(PaginaWeb a) throws HistorialException {

	}

	public Set<PaginaWeb> hisUrl(String u) {
		Set<PaginaWeb> registroUrl = new TreeSet<PaginaWeb>();
		for (PaginaWeb paginaWeb : registroUrl) {
			if (paginaWeb.getUrl().equals(u) == true) {
				registroUrl.add(paginaWeb);
			}
		}

		return this.chivato;
	}

}
