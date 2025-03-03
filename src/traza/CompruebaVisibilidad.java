package traza;

public class CompruebaVisibilidad {
	private int privado = 1;
	int paquete = 2;
	protected int protegido = 3;
	public int publico = 4;

	public CompruebaVisibilidad(int privado, int paquete, int protegido, int publico) {
		super();
		this.privado = privado;
		this.paquete = paquete;
		this.protegido = protegido;
		this.publico = publico;
	}

	public int getPrivado() {
		return privado;
	}

	public void setPrivado(int privado) {
		this.privado = privado;
	}

	public int getPaquete() {
		return paquete;
	}

	public void setPaquete(int paquete) {
		this.paquete = paquete;
	}

	public int getProtegido() {
		return protegido;
	}

	public void setProtegido(int protegido) {
		this.protegido = protegido;
	}

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	@Override
	public String toString() {
		return "CompruebaVisibilidad [privado=" + privado + ", paquete=" + paquete + ", protegido=" + protegido
				+ ", publico=" + publico + "]";
	}

}