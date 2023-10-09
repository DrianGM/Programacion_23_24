package u1.tarea_7;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad :");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el nivel de estudios :");
        int nivel = teclado.nextInt();
        System.out.println("Ingrese la cantidad de ingresos :");
        int ingresos = teclado.nextInt();
        Boolean jasp = false;
        if (edad <= 28 && nivel > 3 && ingresos > 28000) {
            jasp = true;
        }
    }
}
