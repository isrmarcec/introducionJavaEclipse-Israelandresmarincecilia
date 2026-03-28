package ejercicios;

import java.util.Scanner;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
	    Scanner scanner = new Scanner(System.in);
	    
	    int[] numeros = {1, 5, 8, 5, 2, 5, 9, 10, 5, 3};
	    int contador = 0;

	    System.out.println("Array actual: [1, 5, 8, 5, 2, 5, 9, 10, 5, 3]");
	    System.out.print("¿Qué número quieres contar?: ");
	    int objetivo = scanner.nextInt();


	    for (int num : numeros) {
	        if (num == objetivo) {
	            contador++;
	        }
	    }

	    if (contador > 0) {
	        System.out.println("El número " + objetivo + " aparece " + contador + " veces.");
	    } else {
	        System.out.println("El número " + objetivo + " no está en el array.");
	    }
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
