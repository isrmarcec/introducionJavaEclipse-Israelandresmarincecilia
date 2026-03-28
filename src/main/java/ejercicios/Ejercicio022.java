package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {
	
	//COMPLETAR METODO
	public void mostrarMenu() {
	    Scanner scanner = new Scanner(System.in);
	    int opcion;

	    do {
	        System.out.println("\n--- CALCULADORA ---");
	        System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");
	        System.out.println("5. Salir");
	        System.out.print("Elige una opción: ");
	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1 -> procesarSuma(scanner);
	            case 2 -> procesarResta(scanner);
	            case 3 -> procesarMultiplicacion(scanner);
	            case 4 -> procesarDivision(scanner);
	            case 5 -> System.out.println("¡Adiós!");
	            default -> System.out.println("Opción no válida.");
	        }
	    } while (opcion != 5);
	}       
	//COMPLETAR METODO
	private void procesarSuma(Scanner scanner) {
	    System.out.print("Primer número: ");
	    double a = scanner.nextDouble();
	    System.out.print("Segundo número: ");
	    double b = scanner.nextDouble();
	    System.out.println("Resultado: " + (a + b));
	}
    
    //COMPLETAR METODO
	private void procesarResta(Scanner scanner) {
	    System.out.print("Primer número: ");
	    double a = scanner.nextDouble();
	    System.out.print("Segundo número: ");
	    double b = scanner.nextDouble();
	    System.out.println("Resultado: " + (a - b));
	}
    
    //COMPLETAR METODO
	private void procesarMultiplicacion(Scanner scanner) {
	    System.out.print("Primer número: ");
	    double a = scanner.nextDouble();
	    System.out.print("Segundo número: ");
	    double b = scanner.nextDouble();
	    System.out.println("Resultado: " + (a * b));
	}
    //COMPLETAR METODO
	private void procesarDivision(Scanner scanner) {
	    System.out.print("Dividendo: ");
	    double a = scanner.nextDouble();
	    System.out.print("Divisor: ");
	    double b = scanner.nextDouble();
	    
	    if (b != 0) {
	        System.out.println("Resultado: " + (a / b));
	    } else {
	        System.out.println("Error: No se puede dividir por cero.");
	    }
	}
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}
