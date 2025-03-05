package Controlador;

import Modelo.*;

public class GestionaFactoria {

	public static void main(String[] args) {
		int contador = 0;

		Robot p = new RobotSoldador(null, 0, null, null, null, 0, null);
		Robot[] inventarioRobots = new Robot[20];
		inventarioRobots[contador] = p;
		contador += 1;
	}

}
