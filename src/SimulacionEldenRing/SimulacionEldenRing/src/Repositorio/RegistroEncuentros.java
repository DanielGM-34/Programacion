package SimulacionEldenRing.SimulacionEldenRing.src.Repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import SimulacionEldenRing.SimulacionEldenRing.src.Controlador.EldenException;
import SimulacionEldenRing.SimulacionEldenRing.src.Modelo.Encuentro;
import SimulacionEldenRing.SimulacionEldenRing.src.Modelo.Sinluz;

public class RegistroEncuentros {

	/*
	 * APARTADO 1: ELEGÍ LA COLECCIÓN DE TREESET PORQUE ESTA YA GUARDA LOS NOMBRES
	 * DE LOS SINLUZ DE POR ORDEN ALFABÉTICO.
	 */
	private Set<Sinluz> listaSinluz;

	public Set<Sinluz> getListaSinluz() {
		return listaSinluz;
	}

	public void setListaSinluz(Set<Sinluz> listaSinluz) {
		this.listaSinluz = listaSinluz;
	}

	public RegistroEncuentros() {
		super();
		this.listaSinluz = new TreeSet<Sinluz>();
	}

	public void agregarSinLuz(Sinluz a) {
		this.getListaSinluz().add(a);
	}

	public Sinluz getSinLuz(int id) throws EldenException {
		boolean encontrado = false;
		Iterator<Sinluz> listaSinLuz = this.getListaSinluz().iterator();
		Sinluz sinluzAdevolver = null;
		while (listaSinLuz.hasNext() && !encontrado) {
			Sinluz sinluzDeLaLista = listaSinLuz.next();
			if (sinluzDeLaLista.getId() == id) {
				sinluzAdevolver = sinluzDeLaLista;
				encontrado = true;
			}
		}
		if (sinluzAdevolver == null) {
			throw new EldenException("No existe el sin lus con id " + id);
		}

		return sinluzAdevolver;

	}

	public void agregarEncuentro(Encuentro a, int idSinLuz) throws EldenException {
		boolean encontrado = false;
		Iterator<Sinluz> listaSinLuz = this.getListaSinluz().iterator();
		while (listaSinLuz.hasNext() && !encontrado) {
			Sinluz sinluzDeLaLista = listaSinLuz.next();
			if (sinluzDeLaLista.getId() == idSinLuz) {
				sinluzDeLaLista.getEncuentros().add(a);
				encontrado = true;

			}
		}
		if (!encontrado) {
			throw new EldenException("No existe ese sinluz.");
		}

	}

	@Override
	public String toString() {
		return "RegistroEncuentros [listaSinluz=" + listaSinluz + "]";
	}

	public List<Sinluz> devuelveEncuentrosMayoraA6() {
		List<Sinluz> listaMayorA6 = new ArrayList<Sinluz>();
		Iterator<Sinluz> listaSinLuz = this.getListaSinluz().iterator();

		while (listaSinLuz.hasNext()) {
			Sinluz sinluz = listaSinLuz.next();
			if (sinluz.mayorA6()) {
				listaMayorA6.add(sinluz);
			}

		}

		return listaMayorA6;
	}

}
