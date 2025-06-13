package SimulacionEldenRing.SimulacionEldenRing.src.Controlador;

import java.time.LocalDate;
import java.util.List;

import SimulacionEldenRing.SimulacionEldenRing.src.Modelo.Encuentro;
import SimulacionEldenRing.SimulacionEldenRing.src.Modelo.Sinluz;
import SimulacionEldenRing.SimulacionEldenRing.src.Repositorio.RegistroEncuentros;

public class GestionaEncuentrosSinLuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinluz ardyn = new Sinluz("Ardyn");
		Sinluz selene = new Sinluz("Selene");
		Sinluz kael = new Sinluz("Kael");

		Encuentro e1 = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 3, 10), 8,
				List.of("Caballero Carmesí", "Tirano de Ceniza"));
		Encuentro e2 = new Encuentro("Emboscada en el Bosque Umbrío", LocalDate.of(2025, 3, 14), 5,
				List.of("Lobo Siniestro", "Bandido espectral"));
		Encuentro e3 = new Encuentro("Duelo en la Cripta Helada", LocalDate.of(2025, 3, 18), 7,
				List.of("Espectro del Hielo", "Mago congelado"));
		Encuentro e4 = new Encuentro("Resistencia en la Torre Abandonada", LocalDate.of(2025, 3, 20), 6,
				List.of("Arquero maldito", "Guardián de piedra"));
		Encuentro e5 = new Encuentro("Invasión en la Villa Marchita", LocalDate.of(2025, 3, 23), 9,
				List.of("Gigante marchito", "Portador del Plomo"));
		Encuentro e6 = new Encuentro("Caza en el Lago Sombrío", LocalDate.of(2025, 3, 25), 4,
				List.of("Serpiente negra", "Sombra anfibia"));
		Encuentro e7 = new Encuentro("Asalto final al Nexo del Caos", LocalDate.of(2025, 3, 30), 10,
				List.of("Señor del Caos", "Centinela oscuro", "Eco ardiente"));

		RegistroEncuentros a = new RegistroEncuentros();
		a.agregarSinLuz(selene);
		a.agregarSinLuz(kael);

		a.agregarSinLuz(ardyn);

		try {

			a.agregarEncuentro(e3, 3);
			a.agregarEncuentro(e4, 3);

			a.agregarEncuentro(e7, 2);
			a.agregarEncuentro(e1, 1);

			System.out.println("----------------------------");
			System.out.println(ardyn);
			System.out.println("----------------------------");
			System.out.println(selene);
			System.out.println("----------------------------");
			System.out.println(kael);
			System.out.println("----------------------------");
			a.agregarEncuentro(e1, 10);

		} catch (EldenException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("----------------------------");

			System.out.println(a.getSinLuz(1));
			System.out.println("----------------------------");

			System.out.println(a.getSinLuz(2));
			System.out.println("----------------------------");

			System.out.println(a.getSinLuz(3));
			System.out.println("----------------------------");

			
		} catch (EldenException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			a.agregarEncuentro(e3, 3);
			System.out.println(kael);

		} catch (EldenException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println(a.devuelveEncuentrosMayoraA6());

	}

}
