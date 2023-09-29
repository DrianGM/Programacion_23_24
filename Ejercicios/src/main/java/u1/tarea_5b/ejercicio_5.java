package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a : ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.println("Por favor, introduzca el valor de b : ");
        double b = teclado.nextDouble();
        double x = -b / a;
        System.out.println("x = " + x);
    }
}
