package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número : ");
        int num1 = teclado.nextInt();
        int num2 = num1 % 10;
        System.out.println("La última cifra de " + num1 + " es " + num2);
    }
}
