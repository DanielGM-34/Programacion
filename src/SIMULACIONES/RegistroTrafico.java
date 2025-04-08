package SIMULACIONES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class RegistroTrafico {
	Map<String, Vehiculo> vehiculos = new TreeMap<>();

	public void registrarVehiculo(Vehiculo vehiculo) {
		vehiculos.put(vehiculo.getVIN(), vehiculo);
	}

	public void rematricularVehiculo(String vin, String nuevaMatricula) {
		Vehiculo vehiculo = vehiculos.get(vin);
		if (vehiculo != null) {
			vehiculo.rematricular(nuevaMatricula);
		}
	}

	public Vehiculo buscarVehiculo(String vin) {
		return vehiculos.get(vin);
	}

	public List<Vehiculo> buscarPorPropietario(String propietario) {
		List<Vehiculo> resultado = new ArrayList<>();
		for (Vehiculo v : vehiculos.values()) {
			if (v.getPropietario().equals(propietario)) {
				resultado.add(v);
			}
		}
		return resultado;
	}
}