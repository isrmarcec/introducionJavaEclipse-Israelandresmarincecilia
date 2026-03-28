package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
	public void cajeroAutomatico() {
	    Scanner scanner = new Scanner(System.in);
	    int opcion;

	    do {
	        System.out.println("\n--- CAJERO AUTOMÁTICO ---");
	        System.out.println("1. Consultar Saldo");
	        System.out.println("2. Ingresar Dinero");
	        System.out.println("3. Retirar Dinero");
	        System.out.println("4. Salir");
	        System.out.print("Seleccione una opción: ");
	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1 -> consultarSaldo();
	            case 2 -> ingresarDinero(scanner);
	            case 3 -> retirarDinero(scanner);
	            case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
	            default -> System.out.println("Opción no válida.");
	        }
	    } while (opcion != 4);
	}
    
    //COMPLETAR METODO
	private void consultarSaldo() {
	    System.out.println("Su saldo actual es: " + saldo + "€");
	}
    
    //COMPLETAR METODO
	private void ingresarDinero(Scanner scanner) {
	    System.out.print("Cantidad a ingresar: ");
	    double cantidad = scanner.nextDouble();
	    if (cantidad > 0) {
	        saldo += cantidad;
	        System.out.println("Ingreso realizado correctamente.");
	    } else {
	        System.out.println("Error: La cantidad debe ser positiva.");
	    }
	}
    //COMPLETAR METODO
	private void retirarDinero(Scanner scanner) {
	    System.out.print("Cantidad a retirar: ");
	    double cantidad = scanner.nextDouble();
	    if (cantidad > saldo) {
	        System.out.println("Error: Saldo insuficiente. Tiene " + saldo + "€");
	    } else if (cantidad <= 0) {
	        System.out.println("Error: Cantidad no válida.");
	    } else {
	        saldo -= cantidad;
	        System.out.println("Retirada completada.");
	    }
	}

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
