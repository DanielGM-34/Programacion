package EJERCICIOSLISTAS;

import java.util.Collections;
import java.util.List;

public class GestionaEquiposAlumno {

	public static void main(String[] args) {

		Alumno pepe = new Alumno("Pepe", "14548787P");
		Alumno antonio = new Alumno("antonio", "12345678B");
		Alumno fernando = new Alumno("fernando", "12345678P");
		Alumno manuel = new Alumno("manuel", "25485959P");

		Equipo p = new Equipo("Equipo1");
		Equipo p2 = new Equipo("Equipo2");
       /* Collections.sort(p);*/

		try {
			p.agregaAlumno(pepe);
			p.agregaAlumno(manuel);
			p2.agregaAlumno(pepe);
			p2.agregaAlumno(manuel);
			p.agregaAlumno(pepe);
			p.agregaAlumno(manuel);

		} catch (DeportivosException e) {
			System.out.println(e.getMessage());

		}

		try {
			System.out.println(p.deleteAlumno(fernando));
		} catch (DeportivosException e) {
			System.out.println(e.getMessage());

		}
		System.out.println(p.toString());
		System.out.println(p2.toString());

	}

}