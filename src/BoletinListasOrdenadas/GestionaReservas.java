package BoletinListasOrdenadas;

import java.time.LocalDate;

public class GestionaReservas {

	public static void main(String[] args) {

		ReservaAnimal reserva = new ReservaAnimal("Reserva de animaliños", "Ourense", 730000);
		Animal p1 = new Animal("S1AS1245", "Max", "perro", 10, ClasificacionComida.OMNÍVOROS, LocalDate.of(2014, 5, 19),
				8.5, Medio.TIERRA, clasificacicionGestacion.OVOVIVÍPAROS);
		Animal p2 = new Animal("B5663FDF", "Carlota", "gallina", 1, ClasificacionComida.HERVÍBOROS,
				LocalDate.of(2023, 9, 27), 8.5, Medio.TIERRA, clasificacicionGestacion.OVÍPAROS);
		Animal p3 = new Animal("B5663FDF", "Naya", "elefante", 3, ClasificacionComida.OMNÍVOROS,
				LocalDate.of(2022, 2, 2), 8.5, Medio.TIERRA, clasificacicionGestacion.VIVÍPAROS);
		Animal p4 = new Animal("B5663FDF", "Tomás", "tiburón", 9, ClasificacionComida.HERVÍBOROS,
				LocalDate.of(2015, 9, 6), 8.5, Medio.TIERRA, clasificacicionGestacion.VIVÍPAROS);

		reserva.agregarAnimal(p1);
		reserva.agregarAnimal(p2);
		reserva.agregarAnimal(p3);
		reserva.agregarAnimal(p4);
		
		System.out.println(reserva.toString());
		for (Animal animal : reserva) {
		    System.out.println(animal); // Utiliza el método toString de Animal para mostrar información básica
		}

	}

}
