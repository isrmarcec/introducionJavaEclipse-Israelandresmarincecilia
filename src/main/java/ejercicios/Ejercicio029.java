package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	//COMPLETAR METODO
	public void secuenciaFibonacci() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("¿Cuántos números de la secuencia quieres ver?: ");
	    int n = scanner.nextInt();

	    int a = 0, b = 1;

	    System.out.println("Secuencia de Fibonacci (" + n + " términos):");

	    for (int i = 1; i <= n; i++) {
	        System.out.print(a + " ");

	        int siguiente = a + b;

	        a = b;
	        b = siguiente;
	    }
	    
	    System.out.println();
	    scanner.close();
	}

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}
