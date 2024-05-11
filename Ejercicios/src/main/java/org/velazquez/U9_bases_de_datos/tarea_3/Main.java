package org.velazquez.U9_bases_de_datos.tarea_3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ADClassicModels ad = new ADClassicModels();
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
                    System.out.println("Se va a insertar un cliente en la base de datos.");
                    System.out.println("Ingrese el customerNumber ");
                    int customerNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el customerName ");
                    String customerName = sc.nextLine();
                    System.out.println("Ingrese el contactLastName ");
                    String contactLastName = sc.nextLine();
                    System.out.println("Ingrese el contactFirstName ");
                    String contactFirstName = sc.nextLine();
                    System.out.println("Ingrese el phone ");
                    String phone = sc.nextLine();
                    System.out.println("Ingrese el addressLine1 ");
                    String addressLine1 = sc.nextLine();
                    System.out.println("Ingrese el addressLine2 ");
                    String addressLine2 = sc.nextLine();
                    System.out.println("Ingrese el city ");
                    String city = sc.nextLine();
                    System.out.println("Ingrese el state ");
                    String state = sc.nextLine();
                    System.out.println("Ingrese el postalCode ");
                    String postalCode = sc.nextLine();
                    System.out.println("Ingrese el country");
                    String country = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese el salesRepEmployeeNumber ");
                    int salesRepEmployeeNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el creditLimit ");
                    double creditLimit = sc.nextDouble();
                    Customer cus = new Customer(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit);
                    ad.insertarCliente(cus);
                    sc.nextLine();
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
