package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura de la bandera en cm : ");
        double largo = teclado.nextDouble();
        System.out.println("Ingrese la anchura de la bandera en cm : ");
        double ancho = teclado.nextDouble();
        double area = largo * ancho;
        double precio = area * 0.01;
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("¿Quiere escudo bordado? (si/no)");
        String escudo = teclado2.nextLine();
        switch (escudo) {
            case "si":
                precio = precio + 2.50;
                break;
            case "no":
                break;
            default:
                System.out.println("Esa no es una respuesta válida");
                break;
        }
        precio = precio + 3.25;
        System.out.println("El precio final es de " + precio + " euros.");
    }
}
