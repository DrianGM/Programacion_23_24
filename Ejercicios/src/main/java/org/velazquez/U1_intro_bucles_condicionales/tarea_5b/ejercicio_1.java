package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;


import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (Mayúscula Inicial) : ");
        String dia = teclado.next();
        switch (dia) {
            case "Lunes":
                System.out.println("El lunes a primera hora toca Programación");
                break;
            case "Martes":
                System.out.println("El martes a primera hora toca Programación");
                break;
            case "Miercoles":
                System.out.println("El miercoles a primera hora toca Formación y Orientación Laboral");
                break;
            case "Jueves":
                System.out.println("El jueves a primera hora toca Entorno de Desarrollo");
                break;
            case "Viernes":
                System.out.println("El viernes a primera hora toca Programación");
                break;
            default:
                System.out.println("No ha ingresado un día de la semana laboral con mayúscula inicial");
                break;
        }
    }
}