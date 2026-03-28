package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Introduce una palabra: ");
	    String palabra = scanner.nextLine().toLowerCase();
	    boolean esPalindromo = true;
	    int longitud = palabra.length();

	    for (int i = 0; i < longitud / 2; i++) {
	        if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
	            esPalindromo = false;
	            break;
	        }
	    }

	    if (esPalindromo) {
	        System.out.println("La palabra '" + palabra + "' ES un palíndromo.");
	    } else {
	        System.out.println("La palabra '" + palabra + "' NO es un palíndromo.");
	    }
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
