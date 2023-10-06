package u1.tarea_6;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        int par = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número entero :");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            par = 1;
            System.out.println("La variable vale " + par + ", es par.");
        } else {
            System.out.println("La variable vale " + par + ", es impar.");
        }
    }
}


