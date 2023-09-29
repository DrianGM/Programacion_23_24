package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número de horas trabajadas : ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        if (num1 <= 40) {
            System.out.println("El sueldo semanal que le corresponde es de : " + num1 * 12);
        } else {
            int num2 = (num1 - 40) * 16;
            num1 = 40 * 12;
            System.out.println("El sueldo semanal que le corresponde es de : " + (num1 + num2));
        }
    }
}
