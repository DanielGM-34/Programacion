package EjercicioParticipantes.copy;

public class GestionaTorneo {

	public static void main(String[] args) {
		Participante p1= new Participante("Pepetri2", "Pepe", 45, 0.96);
		Participante p2= new Participante("Toni56", "Antonio", 21, 15.52);
		Participante p3= new Participante("Shampoo7_EN_1", "Gabriel", 18, 32.55);
		Participante p4= new Participante("Fede69", "Alberto", 12, 25);
		
		Participante[] p= {p1,p2,p3,p4};
		
		Partida partida1 = new Partida("Catán", p,null);
		
	}

}