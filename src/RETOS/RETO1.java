package RETOS;

import java.util.Scanner;

public class RETO1 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);

	
		int [] tablaLuces= new int [10];
		
		
		for (int i = 0; i < tablaLuces.length; i++)

			System.out.println("¿Se enciende?");
			String Luces = entrada.next().toUpperCase();
	
			if (Luces.equals("S")) {
				int encendida=0;
				encendida = encendida+1;
				 
				if (encendida>5) {
					System.out.println("Nos devuelven el dinero");
						} 
			
				else {
					System.out.println("Recuerda comprar más luces");
				}
				System.out.println("Luces encendidas" + encendida);
			}
			
		
		
	}

}
