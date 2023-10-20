package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num2 = 0;
        System.out.print("Ingrese un número (5 cifras como máximo) : ");
        int num1 = teclado.nextInt();
        if (num1 < 10) {
            num2 = num1;
        }
        if ((num1 >= 10) && (num1 < 100)) {
            num2 = num1 / 10;
        }
        if ((num1 >= 100) && (num1 < 1000)) {
            num2 = num1 / 100;
        }
        if ((num1 >= 1000) && (num1 < 10000)) {
            num2 = num1 / 1000;
        }
        if (num1 >= 10000) {
            num2 = num1 / 10000;
        }
        System.out.println("La primera cifra de " + num1 + " es " + num2 + ".");
    }
}



