package U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide con el carácter a elegir.");
        System.out.print("Introduzca un carácter para rellenar la pirámide : ");
        String caracter = teclado.next();
        System.out.println("Elija la dirección del vértice");
        System.out.println("Vértice hacia arriba : escriba 1");
        System.out.println("Vértice hacia abajo : escriba 2");
        System.out.println("Vértice hacia la izquierda : escriba 3");
        System.out.println("Vértice hacia la derecha : escriba 4");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;
            case 2:
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println("  " + caracter);
                break;
            case 3:
                System.out.println("    " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println("    " + caracter);
                break;
            case 4:
                System.out.println(caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter);
                break;
            default:
                System.out.println("Ese no es un número válido.");
                break;
        }
    }
}

