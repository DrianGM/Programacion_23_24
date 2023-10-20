package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas = 0;
        int suspensos = 0;
        while (notas != 5) {
            System.out.println("Ingrese una calificación.");
            int calificacion = teclado.nextInt();
            if (calificacion < 5) {
                suspensos++;
            }
            notas++;
        }
        System.out.println("De las 5 calificaciones, hay " + suspensos + " suspensos.");
    }
}
