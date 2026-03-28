package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("¿Cuántos números vas a introducir?: ");
	    int tamano = scanner.nextInt();
	    
	    int[] numeros = new int[tamano];
	    int contadorPares = 0;

	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print("Introduce el número " + (i + 1) + ": ");
	        numeros[i] = scanner.nextInt();
	    }

	    System.out.print("\nNúmeros pares encontrados: ");
	    for (int num : numeros) {
	        if (num % 2 == 0) {
	            System.out.print(num + " ");
	            contadorPares++;
	        }
	    }

	    System.out.println("\nTotal de números pares: " + contadorPares);
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
