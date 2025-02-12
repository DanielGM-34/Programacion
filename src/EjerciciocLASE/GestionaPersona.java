package EjerciciocLASE;

public class GestionaPersona {

	public static void main(String[] args) {
		Persona p = new Persona("Pepe", "pepe", "", 8, 0);
		System.out.println(p.toString());
		Persona p2 = new Entrenador("Pepe", "pepe", "", 8, 0);
		System.out.println(p.equals(p2));

		Entrenador e = new Entrenador("Pepe", "", "pepe", 8, 0);

		System.out.println(p.getClass().getName());
		System.out.println(p instanceof Persona);
		System.out.println(p.toString());
		e.concentrarse();
		p2.concentrarse();
		p.concentrarse();

		System.out.println();
		e.viajar();
		p2.viajar();
		p.viajar();

		e.dirigirPartido();
		Entrenador p2ToEntrenador = (Entrenador) p2;
		p2ToEntrenador.dirigirPartido();
		e.concentrarse("pipipi");
		p.concentrarse(2);
		p.concentrarse();
	}
}