package traza;

public class Ejemplo {
	public int variableNoEstatica;
	public static int variableEstatica;


	public Ejemplo(int valor) {
		this.variableNoEstatica = valor;
		Ejemplo.variableEstatica = Ejemplo.variableEstatica++;
	}


	public int getVariableNoEstatica() {
		return variableNoEstatica;
	}


	public void setVariableNoEstatica(int variableNoEstatica)   {
		this.variableNoEstatica = variableNoEstatica;
	}


	public static int getVariableEstatica() {
		return variableEstatica;
	}


	public static void setVariableEstatica(int variableEstatica) {
		Ejemplo.variableEstatica = variableEstatica;
	}


	public static void main(String[] args) {
		Ejemplo objeto1 = new Ejemplo(5);
		Ejemplo objeto2 = new Ejemplo(10);
		System.out.println(objeto1.getVariableNoEstatica());
		System.out.println(getVariableEstatica());
		System.out.println(objeto2.getVariableNoEstatica());
		System.out.println(getVariableEstatica());
	}
}

