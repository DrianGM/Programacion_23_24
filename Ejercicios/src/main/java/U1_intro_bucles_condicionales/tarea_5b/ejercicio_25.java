package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_25 {
    public static void main(String[] args) {
        double precio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo):");
        String comida = teclado.nextLine();
        switch (comida) {
            case "palmera":
                precio = 1.40;
                break;
            case "donut":
                precio = 1;
                break;
            case "pitufo":
                System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla) :");
                String pitufo = teclado.nextLine();
                switch (pitufo) {
                    case "aceite":
                        precio = 1.20;
                        break;
                    case "tortilla":
                        precio = 1.60;
                        break;
                    default:
                        System.out.println("Esa no es una respuesta válida.");
                        break;
                }
                break;
            default:
                System.out.println("Esa no es una respuesta válida.");
                break;
        }
        System.out.println("¿Qué ha tomado de beber? (zumo o café) :");
        String bebida = teclado.next();
        switch (bebida) {
            case "zumo":
                precio = precio + 1.50;
                break;
            case "café":
                precio = precio + 1.20;
                break;
            default:
                System.out.println("Esa no es una respuesta válida");
        }
        System.out.println("El precio final del desayuno ha sido de " + precio + " euros.");
    }
}
