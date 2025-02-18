package SimulacionPOO;

public class GestionaCOCHES {

	public static void main(String[] args) {
		Conductor pepe= new Conductor("Pepe", 5);
		pepe.nombreConductor();
		
		Coche popo = new Coche("Mercedes", "1515ASDF", "io32","Juan");
		Coche popo1 = new Coche("pp", "1515ASDF", "p","p");
		
		System.out.println(popo1.equals(popo));
		
		popo.arrancar("Juan");
		popo.verificarSiDebeParar(true);
		System.out.println(popo);
	}

}
