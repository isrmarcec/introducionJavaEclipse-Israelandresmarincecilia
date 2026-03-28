package ejercicios;

import java.util.Scanner;

public class Ejercicio015 {
	
	//COMPLETAR METODO
	public void mostrarMultiplosTres(int n) {
		System.out.println("Multiplos de 3 entre 1 y " +n+ ".");
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

    public static void main(String[] args) {
    	Ejercicio015 ejercicio015 = new Ejercicio015();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Introduce un número positivo.");
        } else {
        	ejercicio015.mostrarMultiplosTres(n);
        }
        
        scanner.close();
    }
}
