package ExamenSorayaPOOOO;

public class GestionaMiembros {

	public static void main(String[] args) {
		MiembroBase pepe = new MiembroPremium(0, "pepe@gmail.com", "pepe", TipoPremium.PREMIUM);
		MiembroBase manuel = new MiembroPremium(1, "manuel@gmail.com", "manuel", TipoPremium.PREMIUM_VIP);
		System.out.println(pepe);
		System.out.println(manuel);
		

		
		
		MiembroBase antonio= new MiembroEstandar(2, null, null);
		MiembroBase lola= new MiembroEstandar(3, "lola@gmail.com", "lola");
		System.out.println(antonio);
		System.out.println(lola);
		
		
		System.out.println(pepe.isAmigo(pepe));

		/*
		try {
			antonio.addAmigo(antonio);
		} catch (GuzmanitosException e) {
			if(antonio.isAmigo(antonio)) {
				throw new GuzmanitosException ("El miembro "+ antonio.getEmail()+ "ya se encuentra en la lista." );
			}
			
			// TODO: handle exception
		}
		*/
		
	
	}
	

}
