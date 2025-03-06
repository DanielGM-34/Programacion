package Controlador;

import java.time.LocalDate;
import java.util.Arrays;

import Modelo.*;

public class GestionaFactoria {

	public static void main(String[] args) {

		Robot p = new RobotEnsamblador("Pepe", 50, Estado.APAGADO, "gasolina", "pipi");
		System.out.println(p.recargar());

		Robot p1 = new RobotPintor("Maria", 20, Estado.ALERTA, "electricidad", "alerta por xrp");
		System.out.println(p1.recargar());

		Robot p2 = new RobotSoldador("Antonio", 0, Estado.APAGADO, "electricidad", "pipipi", 20, "poppo");
		System.out.println(p2.recargar());

		Robot[] inventarioRobots = new Robot[20];

		Dispositivo[] inventarioDispositivos = new Dispositivo[20];

		Dispositivo sensor1 = new Sensor("00:1A:2B:3C:4D:5E", EstadoDispositivo.ON_CONECTADO, LocalDate.of(2025, 1, 1),
				25.0);
		Dispositivo camara1 = new Camara("00:1A:2B:3C:4D:5E", EstadoDispositivo.AVERIADO, LocalDate.of(2025, 2, 15));
		Dispositivo puerta1 = new Puerta("00:1A:2B:3C:4D:5E", EstadoDispositivo.ON_SINWIFI, LocalDate.of(2025, 3, 5));

		camara1.apagar();
		System.out.println(camara1);

		int contador = 0;
		inventarioRobots[contador++] = p;
		inventarioRobots[contador++] = p1;
		inventarioRobots[contador++] = p2;
		System.out.println(Arrays.toString(inventarioRobots));
		System.out.println();

		contador = 0;
		inventarioDispositivos[contador++] = sensor1;
		inventarioDispositivos[contador++] = camara1;
		inventarioDispositivos[contador++] = puerta1;

		System.out.println(Arrays.toString(inventarioDispositivos));
		System.out.println(camara1.equals(puerta1));
	}
}