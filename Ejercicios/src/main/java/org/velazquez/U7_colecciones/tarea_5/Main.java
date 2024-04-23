package org.velazquez.U7_colecciones.tarea_5;

import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion introduciendo su numero :");
        System.out.println("1. Introducir datos de aspirantes");
        System.out.println("2. Calificar prueba");
        System.out.println("3. Aprobados");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();
        while (continuar){
            switch (opcion){
                case 1:
                    IntroducirAspirantes introducir = new IntroducirAspirantes();
                    introducir.InsertaAspirante();
                    introducir.guardarFicheros();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    continuar=false;
                    break;
                default:
                    break;
            }
            if (continuar){
                System.out.println("Elige una opcion introduciendo su numero :");
                System.out.println("1. Introducir datos de aspirantes");
                System.out.println("2. Calificar prueba");
                System.out.println("3. Aprobados");
                System.out.println("4. Salir");
                opcion = sc.nextInt();
            }
        }
    }
}
