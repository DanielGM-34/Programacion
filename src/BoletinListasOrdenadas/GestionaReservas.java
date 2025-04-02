package BoletinListasOrdenadas;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class GestionaReservas {

	public static void main(String[] args) {

		ReservaAnimal reserva = new ReservaAnimal("Reserva de animaliños", "Ourense", 730000);
		Animal p1 = new Animal("1234", "Max", "perro", 10, ClasificacionComida.OMNÍVOROS, LocalDate.of(2014, 5, 19),
				8.5, Medio.TIERRA, clasificacicionGestacion.OVOVIVÍPAROS);
		Animal p2 = new Animal("123ss4", "Carlota", "gallina", 1, ClasificacionComida.HERVÍBOROS,
				LocalDate.of(2023, 9, 27), 8.5, Medio.TIERRA, clasificacicionGestacion.OVÍPAROS);
		Animal p3 = new Animal("B5663hhFDF", "Aitor", "elefante", 3, ClasificacionComida.OMNÍVOROS,
				LocalDate.of(2022, 2, 2), 8.5, Medio.TIERRA, clasificacicionGestacion.VIVÍPAROS);
		Animal p4 = new Animal("sdsd", "Tomás", "tiburón", 9, ClasificacionComida.HERVÍBOROS, LocalDate.of(2015, 9, 6),
				8.5, Medio.TIERRA, clasificacicionGestacion.VIVÍPAROS);
		Animal p5 = new Animal("B566hhf3FDF", "Tomás", "tiburón", 9, ClasificacionComida.HERVÍBOROS,
				LocalDate.of(2015, 9, 6), 8.5, Medio.TIERRA, clasificacicionGestacion.VIVÍPAROS);

		reserva.agregarAnimal(p1);
		reserva.agregarAnimal(p2);
		reserva.agregarAnimal(p3);
		reserva.agregarAnimal(p4);
		System.out.println(reserva.toString());

		List<Animal> listaAnimal = reserva.fromSetToList();
		System.out.println(listaAnimal);
		listaAnimal.add(p5);
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);
		
		
		
		
		

	}

}
