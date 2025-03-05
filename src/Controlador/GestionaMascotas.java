package Controlador;

import java.time.LocalDate;
import java.util.Arrays;

import Modelo.*;

public class GestionaMascotas {
	public static void main(String[] args) {
		Mascota p = new Perro1("Pepe", 3, "operado", LocalDate.now(), "dálmata", false);
		Mascota p2 = new Perro1("Pepe", 3, "operado", LocalDate.now(), "pastor", false);
		Mascota p8 = new Gato1("Pepe", 3, "operado", LocalDate.now(), "pastor", false);
		
		
		int contador=0;

		Mascota [] animales = new Mascota[10];
		animales[contador] = p;
		contador +=1;
		System.out.println(Arrays.toString(animales));

		System.out.println(p8);
		System.out.println(p.equals(p2));
		
		

		GestionaMascotas ver = new GestionaMascotas();

		ver.mostrarListaAnimales("Dani", 56.5, "perro");
		
		System.out.println(ver.obtenerInformacionAnimal(p2));
		System.out.println(p.equals(p2));
		
	}

	public void mostrarListaAnimales(Mascota[] listaMascotas) {
		System.out.println("Lista de mascotas:");
		for (Mascota mascota : listaMascotas) {
			System.out.println(mascota);
		}
	}
	
    // Método para obtener información de un animal concreto
    public String obtenerInformacionAnimal(Mascota mascota) {
        return "Información del animal:\n" + mascota.toString();
    }
	

	public void mostrarListaAnimales(String nombre, double peso, String especie) {
		System.out.println("Mascota creada:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Especie: " + especie);
	}

}