package Boletin2;
	import java.util.Scanner;

	public class Calculadora {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el primer número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int num2 = scanner.nextInt();

	        System.out.println("Elige una operación:");
	        System.out.println("1. Suma (+)");
	        System.out.println("2. Resta (-)");
	        System.out.println("3. Multiplicación (*)");
	        System.out.println("4. División (/)");

	        String cadena="";
//	        Minúscula cadena.toLowerCase();
//	        Mayúscula cadena.toUpperCase();
	        
	     	        
	        System.out.print("Selecciona una opción (1/2/3/4): ");
	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                System.out.println("Resultado: " + (num1 + num2)); 
	                break;
	            case 2:
	                System.out.println("Resultado: " + (num1 - num2)); 
	                break;
	            case 3:
	                System.out.println("Resultado: " + (num1 * num2)); 
	                break;
	            case 4:
	                if (num2 != 0) {
	                    System.out.println("Resultado: " + (num1 / num2)); 
	                } else {
	                    System.out.println("Error: No se puede dividir entre cero.");
	                }
	                break;
	            default:
	                System.out.println("Opción inválida.");
	                break;
	        }

	    }
	}
