package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {
	
	//COMPLETAR METODO
	public void contarVocales() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Introduce una frase para contar sus vocales: ");
	    String frase = scanner.nextLine();
	    
	    int total = contarVocalesEnFrase(frase);
	    
	    System.out.println("La frase tiene " + total + " vocales.");
	    scanner.close();
	}
	//COMPLETAR METODO
	private int contarVocalesEnFrase(String frase) {
	    int contador = 0;
	    String minusculas = frase.toLowerCase();

	    for (int i = 0; i < minusculas.length(); i++) {
	        char letra = minusculas.charAt(i);
	        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
	            contador++;
	        }
	    }
	    return contador;
	}

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}
