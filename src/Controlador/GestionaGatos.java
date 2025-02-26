package Controlador;

import java.util.Scanner;

import POO.Gato;

public class GestionaGatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		Gato gato9 = new Gato("naranja", "blanco","hembra", 2, 8.3F);
		*/
		
		Gato gato1= new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();

		gato1.color = "blanco";
		gato1.edad = 5;
		gato1.sexo = "hembra";
		gato1.peso=8.9F;
		
		System.out.println(gato1);
		

		gato1.maulla();
		System.out.println("Pon una comida para el gato 1:");
		String comidaGato1 = entrada.nextLine();
		gato1.come(comidaGato1);

		System.out.println("-----------------------");

		gato2.color = "blanco";
		gato2.edad = 5;
		gato2.sexo = "hembra";

		gato2.ronronea();
		System.out.println("Pon una comida para el gato 2:");
		String comidaGato2 = entrada.nextLine();
		gato2.come(comidaGato2);

		System.out.println("-----------------------");
		gato3.color = "blanco";
		gato3.edad = 5;
		gato3.sexo = "macho";
		
		gato2.pelear(gato1);
		gato1.pelear(gato3);

	}

}
