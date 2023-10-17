package u1.tarea_8a;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int contador = 0;
        int divisores = 0;
        int max = teclado.nextInt();
        for (int num = 1; num <= max; num++) {
            for (int i = 1; i <= num; i++) {
                int resultado = num % i;
                if (resultado == 0) {
                    divisores++;
                }
                if (divisores > 2) {
                    break;
                }
            }
            if (divisores == 2) {
                contador++;
            }
        }
        System.out.println("Entre 1 y " + max + " hay " + contador + " números primos.");
    }
}


//ESTA SIN TERINAAAAAAAAAAAAAAAAAAAAAAAAAR