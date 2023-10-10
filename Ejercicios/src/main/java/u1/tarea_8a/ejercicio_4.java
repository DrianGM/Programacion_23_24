package u1.tarea_8a;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int n = teclado.nextInt();
        while (n != 1) {
            n--;
            System.out.println(n);
        }
    }
}
