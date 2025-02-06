package Boletin1;


public class Ejercicio4 {

	public static void main(String[] args) {

		String usuario_correcto = "admin";
		String usuario = "";

		String contraseña = "";
		String contraseña_correcta = "secreta123";

		while (usuario_correcto.equals(usuario) == false && contraseña_correcta.equals(contraseña) == false) {
			
			//usuario = JOptionPanel.showInputDialog("Introduce un usuario: ");
			//contraseña = JOptionPanel.showInputDialog("Introduce una contraseña: ");
 
			if (usuario_correcto.equals(usuario) == false && contraseña_correcta.equals(contraseña) == false) {
				System.out.println("La información introducida es incorrecta, inténtalo de nuevo");

			} else {
				System.out.println("Acceso concedido.");
			}
		}

	}
}