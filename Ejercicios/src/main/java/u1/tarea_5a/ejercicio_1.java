package u1.tarea_5a;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Ingresa un número entero : ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num > 0) {
            System.out.println(num + " es un número positivo.");
        } else {
            System.out.println(num + " es un número negativo o 0.");
        }
    }
}
