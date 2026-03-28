package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce un número decimal: ");
	    int decimal = scanner.nextInt();
	    
	    if (decimal == 0) {
	        System.out.println("El binario es: 0");
	        return;
	    }

	    String binario = "";
	    int temporal = decimal;
	    while (temporal > 0) {
	        int resto = temporal % 2;
	        binario = resto + binario;
	        temporal = temporal / 2;
	    }

	    System.out.println("El número " + decimal + " en binario es: " + binario);
	    scanner.close();
	}
    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}
