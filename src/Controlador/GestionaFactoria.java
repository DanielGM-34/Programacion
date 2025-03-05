package Controlador;

import java.util.Arrays;

import Modelo.*;

public class GestionaFactoria {

	public static void main(String[] args) {

		Robot p = new RobotEnsamblador("Pepe", 50, Estado.APAGADO, "gasolina", "pipi");
		System.out.println(p.recargar());

		Robot p1 = new RobotPintor("Maria", 20, Estado.ALERTA, "electricidad", "alerta por xrp");
		System.out.println(p1.recargar());

		Robot p2 = new RobotSoldador("Antonio", 0, Estado.AVERIADO, "electricidad", "pipipi", 20, "poppo");
		System.out.println(p2.recargar());

		Robot[] inventarioRobots = new Robot[20];
		
		
		int contador = 0;
		inventarioRobots[contador++] = p;
		inventarioRobots[contador++] = p1;
		inventarioRobots[contador++] = p2;
		System.out.println(Arrays.toString(inventarioRobots));

	}

}
