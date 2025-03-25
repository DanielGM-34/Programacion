package ExamenSorayaPOOOO;

public class MiembroEstandar extends MiembroBase{
	static int maximoAmigos=50;

	public MiembroEstandar(int id, String email, String nombre) {
		super(id, email, nombre);
	}

	@Override
	public String toString() {
		return "MiembroEstandar [toString()=" + super.toString() + "]";
	}
	
}