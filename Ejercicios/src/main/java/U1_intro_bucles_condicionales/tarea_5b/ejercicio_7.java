package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_7 {
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
        double media = (a + b + c) / 3;
        System.out.println("El resultado de la media es : " + media);
        if (media < 5) {
            System.out.println("Tu nota es Insuficiente");
        }
        if ((media >= 5) && (media < 6)) {
            System.out.println("Tu nota es Suficiente");
        }
        if ((media >= 6) && (media < 7)) {
            System.out.println("Tu nota es Bien");
        }
        if ((media >= 7) && (media <= 8)) {
            System.out.println("Tu nota es Notable");
        }
        if (media >= 9) {
            System.out.println("Tu nota es Sobresaliente");
        }
    }
}

