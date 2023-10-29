package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el cargo del empleado (1 - 3) :");
        int cargo = teclado.nextInt();
        double sueldo = 0;
        switch (cargo) {
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
            default:
                System.out.println("No ha ingresado un cargo válido.");
                break;
        }
        System.out.println("Ingrese cuantos días ha estado de viaje visitante clientes durante el mes : ");
        int dias = teclado.nextInt();
        double extra = dias * 30;
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado) : ");
        String estado = teclado.next();
        double IRPF = 0;
        switch (cargo) {
            case 1:
                IRPF = 25;
                break;
            case 2:
                IRPF = 20;
                break;
            default:
                System.out.println("No ha introducido un estado civil válido.");
                break;
        }
        double bruto = sueldo + extra;
        double retencion = bruto * IRPF / 100;
        double neto = bruto - retencion;
        System.out.println("El sueldo neto es de " + neto + " euros.");
    }
}
