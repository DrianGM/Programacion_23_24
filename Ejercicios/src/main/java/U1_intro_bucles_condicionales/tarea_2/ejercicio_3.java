package U1_intro_bucles_condicionales.tarea_2;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingresa el primer número: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número: ");
        Scanner teclado2 = new Scanner(System.in);
        int numero2 = teclado2.nextInt();
        int resultado = numero1 / numero2;
        System.out.println("El cociente de la división es = ");
        System.out.print(resultado);
    }
}
