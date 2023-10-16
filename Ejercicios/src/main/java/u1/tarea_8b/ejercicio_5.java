package u1.tarea_8b;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int n = teclado.nextInt();
        System.out.println("Ingrese el carácter.");
        String c = teclado.next();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

