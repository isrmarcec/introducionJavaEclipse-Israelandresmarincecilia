package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("¿Cuántas notas o valores vas a introducir?: ");
	    int n = scanner.nextInt();
	    
	    double[] valores = new double[n];
	    double suma = 0;

	    for (int i = 0; i < n; i++) {
	        System.out.print("Introduce el valor " + (i + 1) + ": ");
	        valores[i] = scanner.nextDouble();
	        suma += valores[i]; 
	    }

	    if (n > 0) {
	        double media = suma / n;
	        
	        System.out.println("\n--- RESULTADOS ---");
	        System.out.println("Suma total: " + suma);
	        System.out.println("Media aritmética: " + media);
	    } else {
	        System.out.println("No se puede calcular la media de 0 elementos.");
	    }
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
}
