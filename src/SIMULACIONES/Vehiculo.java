package SIMULACIONES;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String VIN;
	private String matricula;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String propietario;
	private List<String> historialMatriculas;

	public Vehiculo(String VIN, String matricula, String marca, String modelo, int anioFabricacion,
			String propietario) {
		super();
		this.VIN = VIN;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.propietario = propietario;
		this.historialMatriculas = new ArrayList<>();
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public List<String> getHistorialMatriculas() {
		return historialMatriculas;
	}

	public void setHistorialMatriculas(List<String> historialMatriculas) {
		this.historialMatriculas = historialMatriculas;
	}

	public void rematricular(String nuevaMatricula) {
		historialMatriculas.add(nuevaMatricula);
		this.matricula = nuevaMatricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [VIN=" + VIN + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", anioFabricacion=" + anioFabricacion + ", propietario=" + propietario + "]";
	}

}
