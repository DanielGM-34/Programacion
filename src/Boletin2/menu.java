package Boletin2;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		int opcion;
			do {
				System.out.println("Elige una opción: ");
				System.out.println("1. Asignar surtidor");
				System.out.println("2. Consultar");
				System.out.println("3. Asignar precio");
				System.out.println("4. Recargar surtidor");
				System.out.println("5. Salir");
				System.out.println("Pon una opcion: ");
				opcion=entrada.nextInt();
				
				
switch (opcion) {
				
				case 1:
					System.out.println("Asignar surtidor...");
					break;
					
				case 2:
					System.out.println("Consultar...");
					break;
				
				case 3:
					System.out.println("Asignar precio...");
					break;
					
				case 4:
					System.out.println("Recargar...");
					break;
					
				
					
				default:
					System.out.println("Opción inválida...");
								
				}
		
		}
	while(opcion!=5);
			entrada.close();
			
				
				
			
		
			

}
}
