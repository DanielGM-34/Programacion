package Modelo.Agenda;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
	private Set<Contacto> agendaContactos;

	public Set<Contacto> getAgendaContactos() {
		return agendaContactos;
	}

	public void setAgendaContactos(Set<Contacto> agendaContactos) {
		this.agendaContactos = agendaContactos;
	}

	public Agenda(Set<Contacto> agendaContactos) {
		super();
		this.agendaContactos = new TreeSet<Contacto>();
	}

	@Override
	public String toString() {
		return "Agenda [agendaContactos=" + agendaContactos + "]";
	}

	public void agregarContacto(Contacto a) {
		this.agendaContactos.add(a);
	}

	public boolean eliminarContactoExistente(String nombre, String apellidos) {
		boolean encontrado = false;
		Iterator<Contacto> it = agendaContactos.iterator();
		while (it.hasNext()) {
			Contacto contacto = it.next();
			if (contacto.getNombre().equals(nombre) && contacto.getApellidos().equals(apellidos)) {
				it.remove();
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Contacto eliminado exitosamente.");
		} else {
			System.out.println("No se encontró ningún contacto con el nombre y apellidos proporcionados.");
		}
		return encontrado;
	}

	public void buscarContacto(String nombre, String apellidos) {
		Iterator<Contacto> it = agendaContactos.iterator();
		while (it.hasNext()) {
			Contacto contacto = it.next();
			if (contacto.getNombre().equals(nombre) && contacto.getApellidos().equals(apellidos)) {
				System.out.println("Email del contacto: " + contacto.getEmail());
				System.out.println("Teléfono del contacto" + contacto.getNumTelef());

			}
			System.out.println(contacto);
		}

	}

	public void buscarContactoPorTelf(String telef) {
		Iterator<Contacto> it = agendaContactos.iterator();
		while (it.hasNext()) {
			Contacto contacto = it.next();
			if (contacto.getNumTelef().equals(telef)) {
				System.out.println(agendaContactos);
			} else {
				System.out.println("No se ha podido buscar el contacto.");
			}
			System.out.println(contacto);
		}

	}

}
