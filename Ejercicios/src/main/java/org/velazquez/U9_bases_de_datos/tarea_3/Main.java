package org.velazquez.U9_bases_de_datos.tarea_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion :");
        System.out.println("1) Insertar cliente");
        System.out.println("2) Asignar empleado a cliente");
        System.out.println("3) Agregar producto a pedido");
        System.out.println("4) Mostrar con detalle un pedido");
        System.out.println("5) Salir de la aplicacion");
        String respuesta = sc.nextLine();
        boolean seguir = true;
        while (seguir){
            switch (respuesta){
                case "1":
                    System.out.println("Caso 1");
                    break;
                case "2":
                    System.out.println("Caso 2");
                    break;
                case "3":
                    System.out.println("Caso 3");
                    break;
                case "4":
                    System.out.println("Caso 4");
                    break;
                case "5":
                    System.out.println("Caso 5");
                    seguir = false;
                    break;
                default:
                    System.out.println("Esa no es una respuesta valida, ingrese una respuesta valida :");
                    break;
            }
            if (seguir) {
                respuesta = sc.nextLine();
            }
        }
    }
}
