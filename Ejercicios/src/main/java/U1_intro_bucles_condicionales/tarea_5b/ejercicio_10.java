package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la hora : ");
        int hora = teclado.nextInt();
        if (hora > 23) {
            System.out.println("Esa no es una hora válida.");
        }
        System.out.println("Ingresa los minutos : ");
        int minutos = teclado.nextInt();
        if (minutos > 59) {
            System.out.println("Esa no son una cantidad de minutos válida.");
        }
        int segundos = (23 - hora) * 3600;
        minutos = (60 - minutos) * 60;
        segundos = segundos + minutos;
        System.out.println("Quedan " + segundos + " segundos para medianoche.");
    }
}
