package Simulacros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		
		String regex=".a";
		Pattern patron = Pattern.compile(regex);
		
		Matcher matcher= patron.matcher("Mira si cumple el patrón o no.");
		
		boolean encontrado = matcher.matches();
		
		if(encontrado) {
			{System.out.println("No sigue el patrón.");}
		}
	}

}