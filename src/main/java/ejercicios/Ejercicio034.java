package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
	    Scanner scanner = new Scanner(System.in);
	    
	    int[] numeros = {10, 25, 30, 42, 55, 78, 91};
	    boolean encontrado = false;
	    int posicion = -1;

	    System.out.print("Introduce el número que quieres buscar: ");
	    int objetivo = scanner.nextInt();

	    for (int i = 0; i < numeros.length; i++) {
	        if (numeros[i] == objetivo) {
	            encontrado = true;
	            posicion = i;
	            break;
	        }
	    }

	    if (encontrado) {
	        System.out.println("¡Encontrado! El número " + objetivo + " está en la posición: " + posicion);
	    } else {
	        System.out.println("El número " + objetivo + " no se encuentra en el array.");
	    }
	    
	    scanner.close();
	}
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
