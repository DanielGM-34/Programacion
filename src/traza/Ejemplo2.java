package traza;

public class Ejemplo2 {
	static {
		System.out.println("Hola estático");
	}


  public void pintaHola() {
        System.out.println("Hola no estático");
  }
  public static void main(String[] args) {
        new Ejemplo2().pintaHola();
   new Ejemplo2().pintaHola();
  }
}