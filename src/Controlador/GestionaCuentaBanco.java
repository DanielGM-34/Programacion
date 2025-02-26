package Controlador;

import java.time.LocalDate;

import Modelo.Cliente;
import Modelo.CuentaBanco;

public class GestionaCuentaBanco {

	public static void main(String[] args) {

		Cliente pepe = new Cliente("Pepe", "López", "12345678A", 26);
		Cliente luis = new Cliente("Juan", "García", "41005979T", 54);
		Cliente juan = new Cliente("Pedro", "Sánchez", "39091189G", 32);

		CuentaBanco c1 = new CuentaBanco(1200, LocalDate.of(2025, 02, 25), "ES4589 4587 5454 5456", juan, null);
		System.out.println(c1);

		CuentaBanco c2 = new CuentaBanco(8000, LocalDate.of(2025, 02, 25), "ES91 2100 0418 4502 0005 1332", pepe, juan);
		System.out.println(c2);

		CuentaBanco c3 = new CuentaBanco(500, LocalDate.of(2025, 02, 25), "ES91 5698 4512 0145 6844 1245", juan, luis);
		System.out.println(c3);
		
		
		System.out.println(CuentaBanco.getContador());

	}
}