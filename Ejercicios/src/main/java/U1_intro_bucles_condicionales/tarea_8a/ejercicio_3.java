package U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        int prediccion = 0;
        int numeroMax = 100;
        int numeroMin = 1;
        int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su predicción");
        prediccion = teclado.nextInt();
        while (prediccion != num && prediccion!=-1) {
            if (prediccion > num) {
                System.out.println("Es mayor que el número a adivinar.");
            } else {
                System.out.println("Es menor que el número a adivinar.");
            }
            System.out.println("Ingrese su nueva predicción");
            prediccion = teclado.nextInt();
        }
        if (prediccion == -1) {
            System.out.println("Te has rendido, el número era " + num);
            num = prediccion;
        }
        System.out.println("¡El juego ha acabado!");
    }
}
