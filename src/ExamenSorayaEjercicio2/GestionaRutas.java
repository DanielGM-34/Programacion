package ExamenSorayaEjercicio2;

public class GestionaRutas {
	public static void main(String[] args) {
		Ciudad c1 = new Ciudad("El viar", 500);
		Ciudad c2 = new Ciudad("Guillena", 500);
		Ciudad c3 = new Ciudad("Sevilla", 500);
		Ciudad c4 = new Ciudad("San Ignacio", 500);
		Ciudad c5 = new Ciudad("Villaverde", 500);
		Ciudad c6 = new Ciudad("Camas", 500);

		System.out.println(c1.equals(c3));

		RutaBase p1 = new RutaAerea(1245, c1, c2, 20, TipoVuelo.LOW_COST);
		RutaBase p2 = new RutaAerea(4511, c3, c4, 40, TipoVuelo.NORMAL);
		RutaBase p3 = new RutaAerea(9866, c5, c6, 60, TipoVuelo.EXPRESS);
		RutaBase p4 = new RutaTerrestre(50, c2, c4, 80, false);
		System.out.println(p1.getTipoRuta());
		System.out.println(p1.getCoste());
		System.out.println(p2.getTipoRuta());
		System.out.println(p2.getCoste());
		System.out.println(p3.getTipoRuta());
		System.out.println(p3.getCoste());
		System.out.println(p4.getTipoRuta());
		System.out.println(p4.getCoste());

		RutaBase rutaEmpresa[] = new RutaBase[50];
		rutaEmpresa[0] = p1;
		rutaEmpresa[1] = p2;
		rutaEmpresa[2] = p3;
		rutaEmpresa[3] = p4;

		GestionaRutas aa = new GestionaRutas();
		aa.VerRutas(rutaEmpresa);
		
	}

	public void VerRutas(RutaBase rutaEmpresa[]) {
		for (int i = 0; i < 50; i++) {
			if (rutaEmpresa[i] != null) {
				System.out.println(rutaEmpresa[i]);
			}
		}
	}
	
	public boolean verRutasConectadas(RutaBase rutaEmpresa[], String nombreCiudadDestino, String nombreCiudadOrigen) {
		boolean si = false;
		for (int i = 0; i < 50; i++) {
			if (rutaEmpresa[i].equals(nombreCiudadOrigen) || rutaEmpresa[i].equals(nombreCiudadDestino)) {
				si = true;
			} else {
				si = false;
			}
			
		}
		return si;

	}

}
