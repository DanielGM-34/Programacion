package Controlador;

import Modelo.*;

public class GestionaBiblioteca {

	public static void main(String[] args) {
		Recurso libro1 = new Libro("sevilla", "Edgar Alan Poe", "Anaya", "Poesía");

		System.out.println("libro");
		System.out.println(libro1.estaDisponible());
		System.out.println(libro1.getDevuelveDiasPrestamo());

		System.out.println();

		ElementosMultimedia peli1 = new Pelicula("Parla", "Los padrinos mágicos", "fantasía", 60);
		System.out.println("peliculas");
		System.out.println(peli1.estaDisponible());
		System.out.println(peli1.getDevuelveDiasPrestamo());
		System.out.println(peli1.duracion());

		System.out.println();
		System.out.println("juegos");
		ElementosMultimedia juego1 = new Juego("Italia", "Mario Bros", "aventura", 0);
		System.out.println(juego1.estaDisponible());
		System.out.println(juego1.getDevuelveDiasPrestamo());
		System.out.println(juego1.duracion());

		System.out.println();
		System.out.println("audios");
		ElementosMultimedia audio1 = new Juego("Italia", "Mario Bros", "aventura", 0);
		System.out.println(audio1.estaDisponible());
		System.out.println(audio1.getDevuelveDiasPrestamo());
		System.out.println(audio1.duracion());

	}

}