package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor mínimo del rango.");
        int min = teclado.nextInt();
        System.out.println("Ingrese el valor máximo del rango.");
        int max = teclado.nextInt();
        System.out.println("Ingrese un valor dentro del rango.");
        int num = teclado.nextInt();
        while (max < num || min > num) {
            System.out.println("Ha ingresado un valor fuera del rango, por favor, introduzca un valor dentro del rango.");
            num = teclado.nextInt();
        }
        System.out.println("Ha ingresado un valor dentro del rango.");
    }
}
