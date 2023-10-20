package U1_intro_bucles_condicionales.tarea_4;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        double numerodecimal = scanner.nextDouble();
        int numeroentero = (int) Math.round(numerodecimal);
        System.out.println("El número redondeado es: " + numeroentero);
    }
}


