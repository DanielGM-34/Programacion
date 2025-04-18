package Modelo.vuelo;

import java.time.LocalDate;

public class Piloto implements IVuelo {
	private String nombre;
	private String nacionalidad;
	private int edad;
	private int numLicencia;
	private int totalHoras;
	Vuelo vuelos[];

	public int contarVuelo() {
		int contador = 0;
		for (int i = 0; i < 30; i++) {
			if (vuelos[i] != null) {
				contador = contador + 1;
			}
		}
		return contador;

	}

	public boolean saberSiEstaEnListaVuelos(Vuelo v) {
		boolean estaEnLista = false;
		int i = 0;
		while (!estaEnLista && i < vuelos.length) {
			if (vuelos[i].equals(v)) {
				estaEnLista = true;
			} else {
				estaEnLista = false;
				i = i + 1;
			}
		}
		return estaEnLista;
	}

	/*
	 * public int saberNumVueloPiloto(Vuelo v) {
	 * 
	 * }
	 */
	public Piloto(String nombre, String nacionalidad, int edad, int numLicencia) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numLicencia = numLicencia;
		this.vuelos = new Vuelo[30];
		this.totalHoras = 0;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	public void getAgregarVuelo(Vuelo v) throws VueloExcepcion {
		
		for(int i=0; i<30;i++) {
		if (this.saberSiEstaEnListaVuelos(v)) {
			throw new VueloExcepcion("El vuelo que intentas agregar ya está en la lista de vuelos del piloto.");
		} else if (v.getDuracion() > 8 && this instanceof Comercial) {
			throw new VueloExcepcion("El vuelo que intentas agregar es de tipo comercial.");
		} 
		else if(v.estado==Estadovuelo.EN_CURSO || v.estado==Estadovuelo.FINALIZADO && v.getFechaVuelo().isAfter(LocalDate.now())){
			v.setEstado(Estadovuelo.PROGRAMADO);
			throw new VueloExcepcion("Cambiando el estado a programado.");
		}
		}
	}
	 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}


		// TODO Auto-generated method stub

	
	@Override
	public void operarVuelo(Piloto p) {
		if(p instanceof Comercial) {
			System.out.println("piloto comercial y no puede durar más de 8 horas.");
		}
		else if (p instanceof Internacional) {
			System.out.println("Internacional.");
		}
	}
	
	@Override
	public double getDuracionVuelo(Piloto p) {
		if(p instanceof Comercial) {
			
		}
		else if (p instanceof Internacional) {
			System.out.println("Internacional.");
		}
		return 0;
	}
}
