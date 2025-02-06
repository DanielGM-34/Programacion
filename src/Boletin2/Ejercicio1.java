package Boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int edad;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		edad=entrada.nextInt();
		
		
		System.out.println("Pon el precio de un producto: ");
		double precioProducto;
		precioProducto=entrada.nextDouble();

		
		double descuento = 0;
		
		if (edad>60) {
			descuento= 0.3;
			
		
		}
	
		else if(edad<60) {
			descuento= 0.1 ;
			
				
		}
		  
	
		double precioFinal= (precioProducto)- (precioProducto * descuento);
		System.out.println("Tienes más de 60 años, tu producto tendrá un descuento de un 30% precio con rebaja: " + precioFinal );
		
	}

	
	
		
}
