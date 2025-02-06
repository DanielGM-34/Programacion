package BoletinTablas;

public class Ejercicio1 {

	public static void main(String[] args) {

		String[] tablaDias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
 
//		//FOR POR POSICIÓN
//		for (int i=0; i < tablaDias.length; i++ ) {
//			if (i<5) {
//				
//				System.out.println(tablaDias[i] + "Dias laborables");
//			}
//			
//			else {
//				System.out.println(tablaDias[i] + "Dias no laborables");
//			}
//		}
//			
		//FOR POR VALOR
//		for(String dias:tablaDias) {
//			System.out.println(dias);
//		}

		
		int o = 0;
		while (o < tablaDias.length) {
			
			if (o < 5) {
				System.out.println(tablaDias[o] + " Dias laborables");
			}
 	 			
			else{
				System.out.println(tablaDias[o] + " Dias no laborables");
			}
			o++;

		} 
		
		
		//Cuando llega al miércoles para
		o=0;
		while (o<tablaDias.length && !tablaDias[o].equals("pipipi")) {
			System.out.println(tablaDias[o]);
			o++;
			 
		}
		
		
		
		
	}
	
	
		
	
	
	
		
		
	}
