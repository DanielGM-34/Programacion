package ExamenSorayaPOOOO;

import java.util.Objects;

public abstract class MiembroBase {
	private int id;
	private String email;
	private String nombre;
	static int contador;
	private int contadorAmigos;
	protected MiembroBase[] amigos;

	public MiembroBase(int id, String email, String nombre) {
		super();
		this.id = contador+1;
		this.email = email;
		this.nombre = nombre;
		contador = 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContadorAmigos() {
		return contadorAmigos;
	}

	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		MiembroBase.contador = contador;
	}

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + ", contadorAmigos="
				+ contadorAmigos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	public boolean isAmigo(MiembroBase a) {
		int tamanyoMax = 0;
		boolean estaEnLaLista = false;
		if (a instanceof MiembroPremium) {
			tamanyoMax = 3;
		} else if (a instanceof MiembroEstandar) {
			tamanyoMax = 2;
		}

		for (int i = 0; i < tamanyoMax; i++) {
			if (amigos[i].equals(a)) {
				estaEnLaLista = true;
			} else {
				estaEnLaLista = false;
			}
		}

		return estaEnLaLista;
	}

	public boolean addAmigo(MiembroBase a) {
		int tamanyoMax = 0;
		boolean agregaAmigo = false;
		if (a instanceof MiembroPremium) {
			tamanyoMax = 3;
		} else if (a instanceof MiembroEstandar) {
			tamanyoMax = 2;
		}

		if (this.isAmigo(a) == true) {
			agregaAmigo = false;
		} else {
			for (int i = 0; i < tamanyoMax; i++) {
				amigos[i] = a;
			}
			agregaAmigo = true;
		}
		return agregaAmigo;
	};

}
