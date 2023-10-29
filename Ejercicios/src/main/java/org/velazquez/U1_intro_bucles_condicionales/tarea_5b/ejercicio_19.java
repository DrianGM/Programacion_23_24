package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        int minutosParaFinde = (4 * 24 * 60) + (15 * 60);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (Mayúscula Inicial) : ");
        String dia = teclado.next();
        int fecha = 0;
        switch (dia) {
            case "Lunes":
                fecha = 0;
                break;
            case "Martes":
                fecha = 1;
                break;
            case "Miercoles":
                fecha = 2;
                break;
            case "Jueves":
                fecha = 3;
                break;
            case "Viernes":
                fecha = 4;
                break;
            default:
                System.out.println("No ha ingresado un día de la semana laboral con mayúscula inicial");
                break;
        }
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
        int minutosAhora = (fecha * 24 * 60) + (hora * 60) + minutos;
        System.out.print("Quedan " + (minutosParaFinde - minutosAhora) + " minutos para llegar al fin de semana (Viernes a las 15:00).");
    }
}
