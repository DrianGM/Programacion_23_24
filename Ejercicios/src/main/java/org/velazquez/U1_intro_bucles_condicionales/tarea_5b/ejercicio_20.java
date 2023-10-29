package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base imponible : ");
        double base = teclado.nextInt();
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
        String iva = teclado.next();
        int ivaNum = 0;
        switch (iva) {
            case "general":
                ivaNum = 21;
                break;
            case "reducido":
                ivaNum = 10;
                break;
            case "superreducido":
                ivaNum = 4;
                break;
            default:
                System.out.println("No ha ingresado un tipo de IVA válido.");
                break;
        }
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
        double precioIVA = base * ivaNum / 100;
        double sinDescuento = base + precioIVA;
        double descuento = 0;
        String codigo = teclado.next();
        switch (codigo) {
            case "nopro":
                break;
            case "mitad":
                descuento = sinDescuento / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = sinDescuento * 0.05;
                break;
            default:
                System.out.println("No ha ingresado un un código válido.");
                break;
        }
        System.out.println("El precio final es de : " + (sinDescuento - descuento) + " euros.");
    }
}