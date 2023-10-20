package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        int num = 1;
        while (num != 0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese un número.");
            num = teclado.nextInt();
            if (num % 2 == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("Es impar");
            }
            if (num > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo.");
            }
            System.out.println("El cuadrado de " + num + " es " + num * num);
        }
    }
}

