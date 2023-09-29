package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca el primer número : ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.println("Por favor, introduzca el segundo número : ");
        Scanner teclado2 = new Scanner(System.in);
        double b = teclado2.nextDouble();
        System.out.println("Por favor, introduzca el tercer número : ");
        Scanner teclado3 = new Scanner(System.in);
        double c = teclado3.nextDouble();
        double x = (a + b + c) / 3;
        System.out.println("El resultado de la media es : " + x);
    }
}
