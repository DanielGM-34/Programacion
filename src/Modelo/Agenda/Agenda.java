package Modelo.Agenda;

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

	void eliminarContactoExistente(String nombre, String apellidos) {
		boolean encontrado = false;

		for (Contacto contacto : agendaContactos) {
			if (contacto.getNombre().equals(nombre) && contacto.getApellidos().equals(apellidos)) {
				agendaContactos.remove(contacto);
				encontrado = true;
			}
		}

		if (encontrado) {
			System.out.println("Contacto eliminado exitosamente.");
		} else {
			System.out.println("No se encontró ningún contacto con el nombre y apellidos proporcionados.");
		}
	}

	void buscarContacto(String nombre, String apellidos) {
		for (Contacto contacto : agendaContactos) {
			if (contacto.getNombre().equals(nombre) && contacto.getApellidos().equals(apellidos)) {
				System.out.println("Email del contacto: " + contacto.getEmail());
				System.out.println("Teléfono del contacto" + contacto.getNumTelef());
			}
		}

	}

	void buscarContactoPorTelf(String telef) {
		for (Contacto contacto : agendaContactos) {
			if (contacto.getNumTelef().equals(telef)) {
				System.out.println(agendaContactos);
			}
			else {
				System.out.println("No se ha podido buscar el contacto.");
			}
		}

	}

}
