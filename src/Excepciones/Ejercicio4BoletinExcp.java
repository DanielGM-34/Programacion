package Excepciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4BoletinExcp {

	public static void main(String[] args) {
		Float[] listaNum = new Float[20];
		Random numAleatorio = new Random();

		for (int i = 0; i < 20; i++) {

			try {
				int numAl1 = numAleatorio.nextInt(9) + 1;
				int numAl2 = numAleatorio.nextInt(9) + 1;

				if (numAl2 == 0) {
					throw new ArithmeticException("No puedes dividir por 0.");
				}

				if (i >= 20) {
					throw new ArrayIndexOutOfBoundsException("Guardando en más de 20.");
				}

				listaNum[i] = (float) (numAl1 / numAl2);

			} catch (ArithmeticException e) {
				System.out.println("Ha salido un 0 de denominador.");
			}

			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
				throw e2;

			}

			catch (NullPointerException e3) {
				System.out.println(e3.getMessage());
			}

			finally {
				try {
					for (int j = 0; j < listaNum.length; j++) {
						if (listaNum[j] == null) {
							throw new NullPointerException("Aquí no hay nada.");

						}
						System.out.println(listaNum[j]);
					}

				} catch (NullPointerException nulo) {
					System.out.println(nulo.getMessage());
					System.out.println(Arrays.toString(listaNum));
					throw nulo;
				}
			}
		}
	}
}
