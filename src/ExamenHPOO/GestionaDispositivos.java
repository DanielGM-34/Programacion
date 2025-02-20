package ExamenHPOO;

public class GestionaDispositivos {
	public static void main(String[] args) {
		Dispositivo movil = new Smartphone("Sansung ", "Galaxy S21 ", 900, false, 3);
		movil.calcularPrecioDescuento();
		System.out.println(movil);

		Dispositivo lap = new Laptop("Sony", "3gv", 666, 32, 52.2);
		System.out.println(lap);

		Dispositivo pc = new PcSobremesa("Pc", "Asus12", 1500, 64, true);
		System.out.println(pc);

		PcSobremesa pc2 = new PcSobremesa("Pc", "Asus122", 1500, 64, true);
		Laptop lap2 = new Laptop("Sony", "3gv", 666, 32, 52.2);
		Smartphone movil2 = new Smartphone("Sansung ", "Galaxy S21 ", 900, false, 3);

		System.out.println(pc2);
		System.out.println(lap2);
		System.out.println(movil2);

		System.out.println(movil.equals(movil2));

		System.out.println(pc.equals(pc2));

		System.out.println(pc2 instanceof Dispositivo);
	}
}