package ExamenHPOO;

public class PcSobremesa extends Computadora {
	private boolean tieneGpuDedicada;

	public PcSobremesa(String marca, String modelo, double precio, int capacidadRam, boolean tieneGpuDedicada) {
		super(marca, modelo, precio, capacidadRam);
		this.tieneGpuDedicada = tieneGpuDedicada;
	}

	protected boolean isTieneGpuDedicada() {
		return tieneGpuDedicada;
	}

	protected void setTieneGpuDedicada(boolean tieneGpuDedicada) {
		this.tieneGpuDedicada = tieneGpuDedicada;
	}

}
