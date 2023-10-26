package U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int contador = 0;
        while (contador != 5) {
            System.out.println(numero + " | " + numero * numero + " | " + numero * numero * numero);
            numero++;
            contador++;
        }
    }
}
