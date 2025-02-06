package RETOS;

import java.util.Scanner;

public class RETO2 {

	public static void main(String[] args) {
		 Scanner entrada=  new Scanner(System.in);		 	 
		
		System.out.println("Dame la longitud: ");
		int longitud= entrada.nextInt();

		
		int tablaCarrera[]= new int [longitud];
		
		for (int i=0; i<tablaCarrera.length;i++) {
			
			System.out.println("Dame el número de renos: ");
			int numRenos= entrada.nextInt(); 
			tablaCarrera[i]=numRenos;
		}
		String arroba="@";
		String signoN="~";
		String almohadilla="#";
		
		for (int pos=0; pos < tablaCarrera.length; pos++) {
			if (pos==4) {
				System.out.println(arroba);
			}
			
		}
		//		public static void pintaCarrera(int pos,int longitud, int numRenos) {
//			String cadena = "@" + "#" + "R";
//			
//			
//			
//		}
//		
		
		
	}

}
