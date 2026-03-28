package ejercicios;

public class Ejercicio013 {
	
	//COMPLETAR METODO
	public void mostrarPrimeros20Pares() {
        System.out.println("Los primeros 20 números pares son:");
        
        int contador = 0;
        int numero = 1;
        
        while (contador < 20) {
        	if (numero % 2 == 0){
        		System.out.print(numero + " ");
        		contador++;
        	}
        	numero++;
        }
        System.out.println();
	}

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}
