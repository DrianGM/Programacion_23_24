package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10 : ");
        int n = teclado.nextInt();
        while (n > 10 || n < 1) {
            System.out.println("Ese número no entra dentro del rango, por favor, ingrese un número del 1 al 10 : ");
            n = teclado.nextInt();
        }
        int cuenta = 1;
        while (cuenta != 11) {
            System.out.println(n + " * " + cuenta + " = " + cuenta * n);
            cuenta++;
        }
    }
}