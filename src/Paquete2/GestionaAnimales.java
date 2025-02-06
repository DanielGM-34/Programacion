package Paquete2;

public class GestionaAnimales {

	public static void main(String[] args) {
		Animal perro = new Animal();
		Animal gato = new Animal();

//	no visible porque es private	perro.edad;
		perro.nombre = "Tobi";
		perro.tipo = "perro";

// no visible porque tiene visibilidad por defecto y está en otro paquete 
//perro.tipo;

		boolean anda = perro.caminar();
		System.out.println(anda);
		perro.DarleDeComer();

		gato.nombre = "Poo";
		gato.tipo = "gato";

		gato.DarleDeComer();

		boolean mismoTipo = perro.sonDelMismoTipo(perro, gato);
		System.out.println(mismoTipo);
	}
}