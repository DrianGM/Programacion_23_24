package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una hora del día (De 0 a 23) : ");
        int hora = teclado.nextInt();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }
        if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        }
        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
            System.out.println("Buenas noches");
        }
        if ((hora >= 24) || (hora < 0)) {
            System.out.println("La hora introducida no es correcta.");
        }
    }
}


