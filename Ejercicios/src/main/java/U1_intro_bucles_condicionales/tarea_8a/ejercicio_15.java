package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int num = teclado.nextInt();
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            int divisores=0;
            for (int j = 1; j <= i; j++) {
                int resultado = i % j;
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
        System.out.println("Entre 1 y " + num + " hay " + contador + " números primos.");
    }
}
