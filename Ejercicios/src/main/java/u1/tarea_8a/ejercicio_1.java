package u1.tarea_8a;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número :");
        float num = teclado.nextFloat();
        if (num == 0) {
            System.out.println("El número 0 no es válido.");
        } else {
            if (num % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
            if (num > 0) {
                System.out.println("El número es positivo.");
            } else {
                System.out.println("El número es negativo");
            }
            System.out.println("Su cuadrado es " + num * num);
        }
    }
}
