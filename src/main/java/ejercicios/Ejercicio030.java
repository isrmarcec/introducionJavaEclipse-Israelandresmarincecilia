package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
	    Scanner scanner = new Scanner(System.in);
	    int numero;
	    int suma = 0;
	    int contador = 0;
	    int maximo = Integer.MIN_VALUE;
	    int minimo = Integer.MAX_VALUE;

	    System.out.println("Introduce números (introduce 0 para finalizar):");

	    while (true) {
	        System.out.print("Número: ");
	        numero = scanner.nextInt();

	        if (numero == 0) {
	            break;
	        }


	        suma += numero;
	        contador++;

	        if (numero > maximo) maximo = numero;
	        if (numero < minimo) minimo = numero;
	    }

	    if (contador > 0) {
	        double promedio = (double) suma / contador;
	        System.out.println("\n--- ESTADÍSTICAS ---");
	        System.out.println("Cantidad de números: " + contador);
	        System.out.println("Suma total: " + suma);
	        System.out.println("Promedio: " + promedio);
	        System.out.println("Número más grande: " + maximo);
	        System.out.println("Número más pequeño: " + minimo);
	    } else {
	        System.out.println("No se introdujeron números válidos.");
	    }
	    
	    scanner.close();
	}
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
