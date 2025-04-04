package Modelo.Agenda;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GestionaAgenda {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		GestionaAgenda f = new GestionaAgenda();
		Set<Contacto> listaLibrosBiblioteca = new TreeSet<Contacto>();
		Agenda p = new Agenda(listaLibrosBiblioteca);
		Contacto b = new Contacto("Pepe", "López", "pepe@gmail.com", "Calle false 2", "+34 652 325 145");
		Contacto b2 = new Contacto("Manuel", "Garcia", "pepe@gmail.com", "Calle false 2", "+34 652 325 145");
		p.agregarContacto(b2);
		
		p.agregarContacto(b);
		boolean salir = false;
		while (!salir) {
			int opcion = f.menu(input);

			switch (opcion) {
			case 1: {
				f.agregarContacto(p);
				break;
			}

			case 2: {
				f.EliminarContacto(p);
				break;
			}

			case 3: {
				f.mostrarTelefonoYEmailContacto(p);
				break;
			}

			case 4: {
				f.mostrar(p);
				break;
			}

			case 5: {
				f.mostrarTelefonoYEmailContacto(p);
				break;
			}

			case 6: {
				salir = f.salirPrograma();
				break;
			}

			default:
				System.out.println("Valor inexperado: " + opcion + ". Por favor, ingrese opción nuevamente.");
				System.out.println();
			}
		}

		input.close();
	}

	int menu(Scanner input) {
		int opcion;
		System.out.println("--- Menu ---");
		System.out.println("1. Agregar un nuevo contacto a la agenda.");
		System.out.println("2. Eliminar un contacto de la agenda.");
		System.out.println("3.Buscar un contacto por su nombre y apellido y mostrar su número de teléfono e email.");
		System.out.println("4. Mostrar la lista de todos los contactos. ");
		System.out.println("5. Mostrar los contactos que lleven un teléfono. ");
		System.out.println("6. Salir del programa");
		System.out.println();
		System.out.println("Introduce la opción del menú: ");
		opcion = input.nextInt();
		return opcion;

	}

	void agregarContacto(Agenda b) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce nombre del contacto. ");
		String nombre = input.nextLine();
		System.out.println("Introduce los apellidos del contacto. ");
		String apellidos = input.nextLine();
		System.out.println("Introduce el email del contacto. ");
		String email = input.nextLine();
		System.out.println("Introduce la dirección del contacto. ");
		String direccion = input.nextLine();
		System.out.println("Introduce el teléfono del contacto. ");
		String telef = input.nextLine();
		Contacto l = new Contacto(nombre, apellidos, email, direccion, telef);
		b.agregarContacto(l);
		System.out.println("Contacto añadido de forma exitosa.");
		System.out.println();
	}

	void mostrar(Agenda b) {
		System.out.println("Mostrando lista de contactos de la agenda: ");
		System.out.println(b);
	}

	boolean salirPrograma() {
		System.out.println();
		System.out.println("Saliendo del programa...");
		return true;
	}

	void EliminarContacto(Agenda agenda) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Introduce un apellido: ");
		String apellidos = entrada.nextLine();
		agenda.eliminarContactoExistente(nombre, apellidos);
	}

	void mostrarTelefonoYEmailContacto(Agenda agenda) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un teléfono: ");
		String teléfono = entrada.nextLine();
		agenda.buscarContactoPorTelf(teléfono);
	}
}
