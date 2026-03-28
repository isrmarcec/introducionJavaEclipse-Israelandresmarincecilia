package ejercicios;

import java.util.Scanner;

public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
	public int generarNumeroSecreto() {
	    return (int) (Math.random() * 50) + 1;
	}
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
	public String comprobarIntento(int intento, int numeroSecreto) {
	    if (intento < numeroSecreto) {
	        return "Demasiado bajo.";
	    } else if (intento > numeroSecreto) {
	        return "Demasiado alto.";
	    } else {
	        return "¡CORRECTO!";
	    }
	}

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
	public void adivinarNumero() {
	    Scanner scanner = new Scanner(System.in);
	    int secreto = generarNumeroSecreto();
	    int intento;
	    String resultado;

	    System.out.println("--- JUEGO: ADIVINA EL NÚMERO (1-50) ---");

	    do {
	        System.out.print("Introduce tu intento: ");
	        intento = scanner.nextInt();
	        
	        resultado = comprobarIntento(intento, secreto);
	        System.out.println(resultado);

	    } while (!resultado.equals("¡CORRECTO!"));

	    System.out.println("Gracias por jugar.");
	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}
