package BoletinListasOrdenadas;

import java.util.HashSet;

import java.util.Set;

public class ReservaAnimal {
	private String nombre;
	private String lugar;
	private double presupuestoAnual;
	private Set<Animal> listaAnimales;

	public Set<Animal> getListaAnimales() {
		return listaAnimales;
	}

	public void setListaAnimales(Set<Animal> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public double getPresupuestoAnual() {
		return presupuestoAnual;
	}

	public void setPresupuestoAnual(double presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}
	
	   public boolean agregarAnimal(Animal animal) {
	        return listaAnimales.add(animal); 
	    }

	@Override
	public String toString() {
		return "ReservaAnimal [nombre=" + nombre + ", lugar=" + lugar + ", presupuestoAnual=" + presupuestoAnual
				+ ", listaAnimales=" + listaAnimales + "]";
	}

	public ReservaAnimal(String nombre, String lugar, double presupuestoAnual) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnual = presupuestoAnual;
		listaAnimales = new HashSet<Animal>();
	}

}