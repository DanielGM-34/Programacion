package EjercicioEquiposB1Listas;

import java.util.Collections;
import java.util.List;

public class GestionaEquiposAlumno {

	public static void main(String[] args) {

		Alumno pepe = new Alumno("Pepe", "14548787P");
		Alumno antonio = new Alumno("Antonio", "12345678B");
		Alumno fernando = new Alumno("Fernando", "12345678P");
		Alumno manuel = new Alumno("Manuel", "25485959P");
		Alumno aitor = new Alumno("Aitor", "14587845O");
		Alumno alvaro = new Alumno("Alvaro", "14587845P");
		Alumno po = new Alumno("pepe", "14587845P");


		Equipo p = new Equipo("Equipo1");
		Equipo p2 = new Equipo("Equipo2");
		Equipo p3 = new Equipo("Equipo3");

		/* Collections.sort(p); */

		try {
			p.agregaAlumno(pepe);
			p.agregaAlumno(fernando);
			p.agregaAlumno(manuel);
			p.agregaAlumno(alvaro);
			p2.agregaAlumno(fernando);
			p2.agregaAlumno(antonio);
			p2.agregaAlumno(aitor);
			p2.agregaAlumno(alvaro);
			p2.agregaAlumno(alvaro);


			//p2.agregaAlumno(pepe);

			
			// p2.agregaAlumno(pepe);
			// p2.agregaAlumno(manuel);
			// p.agregaAlumno(pepe);
			// p.agregaAlumno(manuel);

		} catch (DeportivosException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p2.siExiste(antonio));
		Equipo equipoUnido = p.unirEquipos(p2);
		System.out.println("Equipo combinado: " + equipoUnido);
		
		System.out.println();
		
		Equipo equipoInterseccion = p.interseccionEquipos(p2);
		
		System.out.println("Equipo en común: " + equipoInterseccion);

		
	 
		try {
			System.out.println(p.deleteAlumno(manuel));
			System.out.println(p2.deleteAlumno(fernando));
			System.out.println(p2.deleteAlumno(fernando));

		} catch (DeportivosException e) {
			System.out.println(e.getMessage());

		}
		System.out.println(p.toString());
		System.out.println(p2.toString());

	}

}