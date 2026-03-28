package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("¿Cuántos números vas a introducir?: ");
	    int n = scanner.nextInt();
	    
	    int[] original = new int[n];
	    int[] invertido = new int[n];

	    for (int i = 0; i < n; i++) {
	        System.out.print("Introduce número " + (i + 1) + ": ");
	        original[i] = scanner.nextInt();
	    }

	    for (int i = 0; i < n; i++) {
	        invertido[i] = original[n - 1 - i];
	    }

	    System.out.println("\nArray invertido:");
	    for (int num : invertido) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
