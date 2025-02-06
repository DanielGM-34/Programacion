//package Simulacros;
//
//import java.util.Scanner;
//
//public class SIMULACRO1EVALEJ2 {
//
//	public static void main(String[] args) {
//		System.out.println("Dame un numerín:");
//		Scanner sc = new Scanner(System.in);
//
//	}
//
//int redondeaNum(String numARedondear) {
//	int nDecimales= calculaNumDecimales(numARedondear);
//	String resultado="";
//	
//	if(nDecimales >=3) {
//		resultado= redondeaNum(numARedondear);
//		
//	}
//	
//	else if (nDecimales <2){
//		resultado=redondeoCon20MenosDecimales(numARedondear)}
//		
//		return nDecimales;}
//
//	int calculaNumDecimales(String numeroARedondear) {
//		String[] partes = numeroARedondear.split("/.");
//		return partes[1].length();
//	}
//
//	String redondeoCon20MenosDecimales(String numeroARedondear) {
//		String resultado = numeroARedondear;
//		int decimales = calculaNumDecimales(resultado);
//
//		while (decimales != 2) {
//			resultado += "0";
//		}
//
//		return resultado;
//
//	}
//
//}
