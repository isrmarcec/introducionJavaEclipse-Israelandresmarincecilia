package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {
	
	//COMPLETAR METODO
	public void calculadoraNotas() {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        
        double suma = 0;
        int maxima = notas[0]; 
        int minima = notas[0]; 

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
            
            if (notas[i] < minima) {
                minima = notas[i];
            }
        }

        double media = suma / notas.length;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + maxima);
        System.out.println("Nota más baja: " + minima);
        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}
