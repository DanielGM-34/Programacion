package EjercicioInstitutoB1Listas;

import java.util.Scanner;

public class GestionInstituto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Instituto instituto = new Instituto();
		boolean continuar = true;

		while (continuar) {
			System.out.println("Opciones:");
			System.out.println("1. Agregar grupo");
			System.out.println("2. Agregar estudiante a un grupo");
			System.out.println("3. Mostrar lista de estudiantes por grupo");
			System.out.println("4. Calcular promedio de notas por grupo");
			System.out.println("5. Calcular promedio de notas de un estudiante");
			System.out.println("6. Salir");

			System.out.print("Elige una opción: ");
			int opcion;
			try {
				opcion = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: opción inválida. Inténtalo de nuevo.");
				continue;
			}

			try {
				switch (opcion) {
				case 1:
					System.out.print("Ingrese ID, descripción, tutor, aula y horario: ");
					instituto.agregarGrupo(new Grupo(Integer.parseInt(scanner.nextLine()), scanner.nextLine(),
							scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
					System.out.println("Grupo agregado correctamente.");
					break;
				case 2:
					System.out.print("Ingrese descripción del grupo: ");
					Grupo grupo = instituto.obtenerGrupoPorDescripcion(scanner.nextLine());

					System.out.print("Ingrese nombre e ID del estudiante: ");
					Estudiante estudiante = new Estudiante(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));

					System.out.print("Ingrese cantidad de notas a agregar: ");
					int cantidadNotas = Integer.parseInt(scanner.nextLine());

					for (int i = 0; i < cantidadNotas; i++) {
						System.out.print("Ingrese nota " + (i + 1) + ": ");
						estudiante.agregarNota(Double.parseDouble(scanner.nextLine()));
					}

					grupo.agregarEstudiante(estudiante);
					System.out.println("Estudiante agregado correctamente con sus notas.");
					break;

				case 3:
					System.out.print("Ingrese descripción del grupo: ");
					grupo = instituto.obtenerGrupoPorDescripcion(scanner.nextLine());
					grupo.verListaEstudiante();
					break;
				case 4:
					System.out.print("Ingrese descripción del grupo: ");
					grupo = instituto.obtenerGrupoPorDescripcion(scanner.nextLine());
					System.out.println("Promedio de notas del grupo: " + grupo.calcularPromedioGrupo());
					break;
				case 5:
					System.out.print("Ingrese ID del estudiante: ");
					Estudiante estudiante1 = instituto.obtenerEstudiantePorId(Integer.parseInt(scanner.nextLine()));
					System.out.println("Promedio de notas del estudiante: " + estudiante1.calcularPromedio());
					break;
				case 6:
					System.out.println("Saliendo del programa...");
					continuar = false;
					break;
				default:
					System.out.println("Opción inválida. Inténtalo de nuevo.");
				}
			} catch (EstudianteException | GrupoException e) {
				System.out.println("Se produjo un fallo: " + e.getMessage());
			}
		}

		scanner.close();
	}
}
