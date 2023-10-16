package u1.tarea_8b;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("--------------------------");

        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%6d | %8d | %4d%n", i, cuadrado, cubo);
        }
    }
}

