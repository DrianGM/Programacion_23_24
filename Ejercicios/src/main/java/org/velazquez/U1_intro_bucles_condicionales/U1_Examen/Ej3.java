package org.velazquez.U1_intro_bucles_condicionales.U1_Examen;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pedidos Pitanza Feliz");
        System.out.println("Número de hamburguesas básicas : ");
        int hamburguesas = sc.nextInt();
        System.out.println("Número de hamburguesas gourmet : ");
        int gourmet = sc.nextInt();
        System.out.println("Día de la semana : ");
        String dia = sc.next();
        System.out.println("¿Pertenece al club Fanegas? (s/n) : ");
        String club = sc.next();
        double precio = 0;
        int precioGourmet = 5;
        int precioBasica = 3;
        double descuento = 0;
        int gourmetExtra = 0;
        System.out.println("Aquí tiene su pedido. Gracias por su compra");
        System.out.println("Hamburguesas basicas : " + hamburguesas);
        System.out.println("Hamburguesas gourmet : " + gourmet);
        switch (dia) {
            case "lunes", "jueves", "viernes", "sabado", "domingo":
                precio = (gourmet * precioGourmet) + (hamburguesas * precioBasica);
                break;
            case "martes":
                if (gourmet % 2 != 0) {
                    gourmetExtra = 5;
                }
                gourmet = gourmet / 2;
                precioGourmet = 9;
                precio = (gourmet * precioGourmet) + (hamburguesas * precioBasica) + gourmetExtra;
                System.out.println(precio);
                break;
            case "miercoles":
                precioBasica = 2;
                precio = (gourmet * precioGourmet) + (hamburguesas * precioBasica);
                break;
            default:
                System.out.println("Ha ingresado un dia de la semana inválido.");
        }
        System.out.println("Total : " + precio);
        switch (club) {
            case "s":
                descuento = precio * 0.12;
                precio = precio - descuento;
                System.out.println("Descuento : " + descuento);
                System.out.println("A pagar : " + precio);
                break;
            case "n":
                System.out.println("Descuento : " + descuento);
                System.out.println("A pagar : " + precio);
                break;
            default:
                System.out.println("Ha ingresado una respuesta inválida.");
        }
    }
}
