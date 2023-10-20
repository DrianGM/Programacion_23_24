package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número : ");
        Scanner teclado = new Scanner(System.in);
        double num = teclado.nextDouble();
        if (num % 2 == 0) {
            if (num % 5 == 0) {
                System.out.println(num + " es par y divisible entre 5");
            } else {
                System.out.println(num + " es par pero no divisible entre 5");
            }
        } else {
            if (num % 5 == 0) {
                System.out.println(num + " es impar y divisible entre 5");
            } else {
                System.out.println(num + " es impar y no divisible entre 5");
            }
        }
    }
}