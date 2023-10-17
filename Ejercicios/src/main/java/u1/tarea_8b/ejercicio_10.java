package u1.tarea_8b;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número :");
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();
        for (int i = 1; i < altura; i++) {
            System.out.println("*   *");
        }
        System.out.println(" *** ");
    }
}
