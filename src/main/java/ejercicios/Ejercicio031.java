package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("¿Cuántos elementos tendrá el array?: ");
	    int tamano = scanner.nextInt();
	    
	    int[] numeros = new int[tamano];
	    int suma = 0;

	    System.out.println("Introduce los " + tamano + " números:");
	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print("Elemento [" + i + "]: ");
	        numeros[i] = scanner.nextInt();
	    }

	    for (int num : numeros) {
	        suma += num;
	    }

	    System.out.println("\nLa suma total de los elementos es: " + suma);
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
