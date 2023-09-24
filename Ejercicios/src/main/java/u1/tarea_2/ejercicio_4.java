package u1.tarea_2;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el número de millas: ");
        Scanner teclado = new Scanner(System.in);
        int milla = teclado.nextInt();
        int metro = milla*1609;
        System.out.println("El cociente de la división es = ");
        System.out.print(metro);
    }
}
