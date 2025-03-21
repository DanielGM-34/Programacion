package Modelo.Deportistas;

import java.time.LocalDate;

public abstract class Deportista implements ICompeticion {
	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba pruebas[];

	public Deportista(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = new Prueba[50];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Prueba[] getPruebas() {
		return pruebas;
	}

	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}

	public abstract void competir();

	public abstract int getTiempoCalentamiento();

	public abstract double getCaloriasNecesarias();

	public int getHorasEntrenamiento(LocalDate fechaCal) {
		int diasEntrenamiento = LocalDate.now().getDayOfYear() - fechaCal.getDayOfYear();
		return diasEntrenamiento;
	}

	public Prueba getPruebaMasCercana() {
		Prueba p = pruebas[0];
		for (int i = 0; i < pruebas.length; i++) {
			if (p != null && pruebas[i] != null && pruebas[i].equals(EstadoPrueba.PLANIFICADA)) {
				int diasMinimo = p.getFecha().compareTo(LocalDate.now());
				Prueba itero = pruebas[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMinimo > diasItero) {
					p = itero;
				}
			}
		}
		return p;
	}

	public void añadirPrueba(Prueba p) throws CompeticionException{
			for (int i=0; i<pruebas.length;i++) {
				if(p!=null && p.equals(pruebas[i]) || (p!=null && p.getEstado().equals(EstadoPrueba.PLANIFICADA) && p.getFecha().isBefore(LocalDate.now()))) {
					throw new CompeticionException("No puedes añadir una prueba repetida ni con una fecha pasada siendo planificada");
				}
				else if(pruebas[i]==null){
					pruebas[i]=p;
				}
			}
			
		
	}
}
