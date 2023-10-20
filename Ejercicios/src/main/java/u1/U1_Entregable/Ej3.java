package u1.U1_Entregable;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa, bienvenido.");
        System.out.println("Ingrese un numero de entradas.");
        int personas = teclado.nextInt();
        int personaExtra = 0;
        System.out.println("Ingrese el dia de la semana (en minusculas y sin acentos)");
        String dia = teclado.next();
        System.out.println("¿Tiene tarjeta Cinecampa? (s/n)");
        String tarjeta = teclado.next();
        double precio = 0;
        System.out.println("Aquí tiene sus entradas, gracias por su compra.");
        switch (dia) {
            case "lunes":
                precio = personas * 8;
                System.out.println("Entradas individuales : " + personas);
                System.out.println("Precio por entrada individual : 8");
                break;
            case "martes":
                System.out.println("Entradas individuales : " + personas);
                precio = personas * 8;
                System.out.println("Precio por entrada individual : 8");
                break;
            case "miercoles":
                System.out.println("Entradas individuales : " + personas);
                precio = personas * 5;
                System.out.println("Precio por entrada individual : 5");
                break;
            case "jueves":
                if (personas % 2 != 0) {
                    personaExtra = 8;
                    System.out.println("Entradas individuales : 1");
                    System.out.println("Precio por entrada individual : 8");
                }
                personas = personas / 2;
                System.out.println("Entradas en pareja : " + personas);
                System.out.println("Precio por entrada en pareja : 11");
                precio = (personas * 11) + personaExtra;
                break;
            case "viernes":
                System.out.println("Entradas individuales : " + personas);
                precio = personas * 8;
                System.out.println("Precio por entrada individual : 8");
                break;
            case "sabado":
                System.out.println("Entradas individuales : " + personas);
                precio = personas * 8;
                System.out.println("Precio por entrada individual : 8");
                break;
            case "domingo":
                System.out.println("Entradas individuales : " + personas);
                precio = personas * 8;
                System.out.println("Precio por entrada individual : 8");
                break;
            default:
                System.out.println("Ha ingresado un dia de la semana inválido.");
        }
        System.out.println("Total : " + precio);
        switch (tarjeta) {
            case "s":
                System.out.println("Descuento : " + precio * 0.1);
                precio = precio - (precio * 0.1);
                System.out.println("A pagar : " + precio);
                break;
            case "n":
                System.out.println("Descuento : 0");
                System.out.println("A pagar : " + precio);
                break;
        }
    }
}