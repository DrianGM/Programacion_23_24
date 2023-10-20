package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_23 {
    public static void main(String[] args) {
        double precio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un sabor (manzana, fresa o chocolate) : ");
        String sabor = teclado.nextLine();
        switch (sabor) {
            case "manzana":
                precio = 18;
                break;
            case "fresa":
                precio = 16;
                break;
            case "chocolate":
                System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco) : ");
                String chocolate = teclado.nextLine();
                switch (chocolate) {
                    case "negro":
                        precio = 14;
                        break;
                    case "blanco":
                        precio = 15;
                        break;
                    default:
                        System.out.println("Ese no es un tipo de chocolate válido.");
                        break;
                }
                break;
            default:
                System.out.println("Ese no es un tipo de sabor válido.");
                break;
        }
        System.out.println("¿Quiere nata? (si o no) :");
        String nata = teclado.nextLine();
        switch (nata) {
            case "si":
                precio = precio + 2.50;
                break;
            case "no":
                break;
            default:
                System.out.println("Esa no es una respuesta válida.");
        }
        System.out.println("¿Quiere ponerle un nombre? (si o no) :");
        String nombre = teclado.nextLine();
        switch (nombre) {
            case "si":
                precio = precio + 2.75;
                break;
            case "no":
                break;
            default:
                System.out.println("Esa no es una respuesta válida.");
        }
        System.out.println("El precio final es de " + precio + " euros.");
    }
}
