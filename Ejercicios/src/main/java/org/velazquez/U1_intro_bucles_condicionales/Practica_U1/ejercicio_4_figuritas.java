package org.velazquez.U1_intro_bucles_condicionales.Practica_U1;

import java.util.Scanner;

public class ejercicio_4_figuritas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Carbonita Volando");
        System.out.println("Introduzca el peso de su figura en gramos: ");
        int peso = sc.nextInt();
        System.out.println("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int material = sc.nextInt();
        System.out.println("¿Quiere posprocesado? (1=si, 2=no): ");
        int posprocesado = sc.nextInt();
        System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int premium = sc.nextInt();
        double precio = 0;
        switch (material) {
            case 1:
                precio = peso * 0.2;
                break;
            case 2:
                precio = peso * 0.3;
                break;
            case 3:
                precio = peso * 0.5;
                break;
            case 4:
                precio = peso * 0.7;
                break;
            default:
                System.out.println("Ha ingresado un tipo de material inválido.");
                break;
        }
        if (posprocesado == 1) {
            precio = precio + 3;
        }
        if (premium == 2) {
            precio = precio + 2;
        }
        System.out.println("El coste total de la pieza es: " + precio + " €");
    }
}
