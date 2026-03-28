package ejercicios;

import java.util.Scanner;

public class Ejercicio025 {
	
	//COMPLETAR METODO
	public void numerosPrimosHastaN() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("¿Hasta qué número quieres buscar primos?: ");
	    int limite = scanner.nextInt();

	    System.out.println("Números primos hasta " + limite + ":");
	    
	    for (int i = 2; i <= limite; i++) {
	        if (esPrimo(i)) {
	            System.out.print(i + " ");
	        }
	    }
	    System.out.println();
	    scanner.close();
	}
	
	//COMPLETAR METODO
	private boolean esPrimo(int n) {
	    if (n <= 1) return false;
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}

    public static void main(String[] args) {
        Ejercicio025 ejercicio = new Ejercicio025();
        ejercicio.numerosPrimosHastaN();
    }
}
