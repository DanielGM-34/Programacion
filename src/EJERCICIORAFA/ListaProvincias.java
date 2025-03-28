package EJERCICIORAFA;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListaProvincias {
	private List<Provincias> ListaProvincias;

	public ListaProvincias() {
		super();
		ListaProvincias = new LinkedList<Provincias>();
	}

	public List<Provincias> getListaProvincias() {
		return ListaProvincias;
	}

	public void setListaProvincias(List<Provincias> listaProvincias) {
		ListaProvincias = listaProvincias;
	}

	public boolean addSinRepetidos(Provincias p) throws ProvinciaRepetidaException {
		boolean agregado = false;

		if (ListaProvincias.contains(p)) {
			throw new ProvinciaRepetidaException("Provincia repetida");
		} else {
			agregado = ListaProvincias.add(p);
		}

		return agregado;
	}

	public Provincias setSinRepetidos(int index, Provincias nuevaPro) throws ProvinciaRepetidaException {
		Provincias actual = ListaProvincias.get(index);

		if (ListaProvincias.contains(nuevaPro)) {
			throw new ProvinciaRepetidaException("Provincia repetida.");
		} else {
			actual = ListaProvincias.set(index, nuevaPro);
		}

		return actual;

	}

	public static void main(String[] args) {
		ListaProvincias listaProvincias = new ListaProvincias();
		Set<Provincias> set1 = new HashSet<>();

		set1.add(new Provincias("Sevilla", 110000));
		set1.add(new Provincias("Cádiz", 114411));
		set1.add(new Provincias("Almería", 100001));
		set1.add(new Provincias("Huelva", 11));
		set1.add(new Provincias("Sevilla", 11));
		set1.add(new Provincias("Málaga", 11));

		System.out.println(set1.toString());
		System.out.println();

		for (Provincias provincias : set1) {
			System.out.println(provincias.toString());
		}
	}
}
