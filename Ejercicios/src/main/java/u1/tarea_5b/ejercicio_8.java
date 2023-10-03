package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax^2 + bx + c = 0");
        System.out.println("Por favor, introduzca el valor de a : ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.println("Por favor, introduzca el valor de b : ");
        double b = teclado.nextDouble();
        System.out.println("Por favor, introduzca el valor de b : ");
        double c = teclado.nextDouble();
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }
        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no tiene solución.");
        }
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }
        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }
        if ((a != 0) && (b != 0) && (c != 0)) {

            double discriminante = b * b - (4 * a * c);

            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 * a));
            }
        }
    }
}
