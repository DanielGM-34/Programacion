package Controlador;
import Modelo.*;
public class GestionaCadenaAlimenticia {

	public static void main(String[] args) {
		Animal2 a1 = new Serpiente("Cobra", Familia.serpiente, "selva", null,null);
		Animal2 a2 = new Rapaz("Águila", Familia.rapaz, "selva", null,null);

		Animal2 a3 = new Roedor("Mickey", Familia.roedor, "casa", null, null);
		Animal2 a4 = new Leon("León", Familia.leon, "amazonas", null, null);
		
		
		System.out.println("serpiente");
		System.out.println(a1.atacar(a3));
		System.out.println(a1.huir(a4));
		
		System.out.println();
		
		System.out.println("rapaz");
		System.out.println(a2.atacar(a4));
		System.out.println(a2.huir(a4));
		
		System.out.println();

		System.out.println("roedor");
		System.out.println(a3.atacar(a4));
		System.out.println(a3.huir(a4));
		
		System.out.println();
		
		System.out.println("Leon");
		System.out.println(a4.atacar(a4));
		System.out.println(a4.huir(a1));
			
		
		
		


	}

}
