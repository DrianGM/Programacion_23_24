package u1.tarea_5a;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número : ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
