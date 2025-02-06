package BoletinTablas;

//Clase principal
public class BuscarElemento {
	
	//Metodo principal
    public static void main(String[] args) {
        BuscarElemento funcion = new BuscarElemento();
        int[] tabla = {1, 2, 3, 4, 5};
        int numero = 0;   
        
        boolean encontrado = funcion.buscaElemento(tabla, numero);
        System.out.println("Elemento encontrado: " + encontrado);
    } 

    //Metodos
    public boolean buscaElemento(int[] tabla, int numero) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < tabla.length) {
            if (tabla[i] == numero) {
                encontrado = true;
            }
            i = i + 1;
        }
        return encontrado;
    }
}