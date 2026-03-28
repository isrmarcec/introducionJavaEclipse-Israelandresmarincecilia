package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
	    Scanner scanner = new Scanner(System.in);
	    List<String> usuarios = new ArrayList<>();
	    String nombre;

	    System.out.println("--- GESTOR DE USUARIOS ---");
	    System.out.println("Introduce nombres de usuarios (escribe 'salir' para terminar):");

	    while (true) {
	        System.out.print("Nombre: ");
	        nombre = scanner.nextLine();

	        if (nombre.equalsIgnoreCase("salir")) {
	            break; //
	        }

	        usuarios.add(nombre);
	    }

	    System.out.println("\nLista final de usuarios (" + usuarios.size() + "):");
	    for (String u : usuarios) {
	        System.out.println("- " + u);
	    }

	    scanner.close();
	}

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
