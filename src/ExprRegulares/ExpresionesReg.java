package ExprRegulares;

import java.util.regex.Pattern;

public class ExpresionesReg {

	public static void main(String[] args) {
		String car = "pepe";
		String n = "12345678p";
		
		System.out.println(n.matches("[0-9]"));
		
		
		
		System.out.println(n.matches("\\d+"));
		
		
		
		System.out.println(n.matches("\\d{8}\\z"));
		
		System.out.println(car.matches("[A-Za-z]*"));
		
		System.out.println(car.matches("[A-Za-z]{1}"));
		
		System.out.println(n.matches("\\d{8}[A-Za-z]{1}"));
		
		
		
		
	}

}
