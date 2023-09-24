package u1.tarea_2;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingresa el primer número: ");
        Scanner teclado = new Scanner(System.in);
        int numerox = teclado.nextInt();
        System.out.println("Ingresa el segundo número: ");
        Scanner teclado2 = new Scanner(System.in);
        int numeroy = teclado2.nextInt();
        int resultado = numerox/numeroy;
        System.out.println("El cociente de la división es = ");
        System.out.print(resultado);
    }
}
