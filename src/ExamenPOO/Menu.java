package ExamenPOO;

import java.time.LocalDate;

public class Menu {
	private String nombre;
	private int consumoKcal;
	private double precioVenta;
	private double precioCoste;
	private TipoDieta dieta;
	private int dia;
	private int unidades;

	protected int getUnidades() {
		return unidades;
	}

	protected void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	protected int getDia() {
		return dia;
	}

	protected void setDia(int dia) {
		this.dia = dia;
	}

	private boolean contieneFrutosSecos;
	private LocalDate fechaMenu;
	private int id;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getConsumoKcal() {
		return consumoKcal;
	}

	protected void setConsumoKcal(int consumoKcal) {
		this.consumoKcal = consumoKcal;
	}

	protected double getPrecioVenta() {
		return precioVenta;
	}

	protected void setPrecioVenta(double precioVenta) {
		if (precioVenta == precioCoste) {
			System.out.println("Pecio de venta es igual a precio de coste.");
		}

		else if (precioVenta > (precioCoste * 30) / 100 + precioCoste) {
			System.out.println("Precio superior a precio de coste + 30 porciento");
		} else {
			this.precioVenta = ((precioCoste * 30) / 100) + precioCoste;
		}

	}

	protected double getPrecioCoste() {
		return precioCoste;
	}

	protected void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	protected TipoDieta getDieta() {
		return dieta;
	}

	protected void setDieta(TipoDieta dieta) {
		this.dieta = dieta;
	}

	protected boolean isContieneFrutosSecos() {
		return contieneFrutosSecos;
	}

	protected void setContieneFrutosSecos(boolean contieneFrutosSecos) {
		this.contieneFrutosSecos = contieneFrutosSecos;
	}

	protected LocalDate getFechaMenu() {
		return fechaMenu;
	}

	protected void setFechaMenu(LocalDate fechaMenu) {
		this.fechaMenu = fechaMenu;
	}

	public boolean dietaBajaEnCal() {
		boolean baja = true;
		if (consumoKcal < 1000) {
			baja = true;
		} else {
			baja = false;
		}
		return baja;
	}

	public boolean contieneCarne() {
		boolean carne = true;

		if (dieta == dieta.VEGANO || dieta == dieta.VEGETARIANO) {
			carne = false;
		}

		else {
			carne = true;
		}
		return carne;
	}

	@Override
	public String toString() {
		return "Menu: " + nombre + " tipo: " + dieta + " fecha: " + fechaMenu;
	}

	public Menu(String nombre, int consumoKcal, double precioVenta, double precioCoste, TipoDieta dieta, int dia,
			int unidades, boolean contieneFrutosSecos, LocalDate fechaMenu, int id) {
		super();
		this.nombre = nombre;
		this.consumoKcal = consumoKcal;
		setPrecioVenta(precioVenta);
		this.precioCoste = precioCoste;
		this.dieta = dieta;
		this.dia = dia;
		this.unidades = unidades;
		this.contieneFrutosSecos = contieneFrutosSecos;
		this.fechaMenu = fechaMenu;
		this.id = id;
	}

}
