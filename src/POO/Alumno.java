package POO;

public class Alumno {
	String nombre;
	String dni;
	float nota;

	String convierteCadena() {
		String cadena = "Nombre: " + nombre + " Dni: " + dni + " Nota: " + dni;
		return cadena;
	}

	Boolean aprobado() {
		Boolean aprobado = false;

		if (nota >= 5) {
			aprobado = true;
		}

		else {
			aprobado = false;
		}

		return aprobado;
	}
} 