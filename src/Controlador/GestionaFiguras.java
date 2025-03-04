package Controlador;

import Modelo.*;

public class GestionaFiguras {

	public static void main(String[] args) {
		Figura p = new Triangulo("rosa", 5, 6);
		System.out.println(p.calculaArea());

		Figura p2 = new Circulito("rojo", 6);
		System.out.println(p2.calculaArea());

		Figura p3 = new Triangulo("amarillo", 6, 9);
		System.out.println(p3.calculaArea());

	}
}