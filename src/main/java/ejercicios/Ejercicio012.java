package ejercicios;

import java.util.Scanner;

public class Ejercicio012 {
	
	//COMPLETAR METODO
	public int sumarHastaCero() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int suma = 0;
		int numero;
		
		System.out.println("Introduce numeros para sumar (introduce 0 para terminar la suma):");
		
		do {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
			suma += numero;
			
		} while (numero != 0);
		
		return suma;
				}
	

    public static void main(String[] args) {
    	Ejercicio012 ejercicio012 = new Ejercicio012();
        double resultado = ejercicio012.sumarHastaCero();
        System.out.println("La suma total es: " + resultado);
    }
}
