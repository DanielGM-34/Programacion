package Modelo.Deportistas;

public class GestionaExcepcion {
	public static void main(String[] args) {
		GestionaExcepcion g = new GestionaExcepcion();

		try {
			g.addPrueba(null);
		} catch (CompeticionException e) {
			System.out.println(e.getMessage());
		}
		

	}

	void addPrueba(Prueba s) throws CompeticionException {
		if (s == null) {
			throw new CompeticionException("Lanzando mis excepciones");
		} else {
		
		}

	}
}
