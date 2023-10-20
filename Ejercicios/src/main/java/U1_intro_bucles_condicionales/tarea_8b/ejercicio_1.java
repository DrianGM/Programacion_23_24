package U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        int combinacion = 7654;
        System.out.println("Ingrese la combinación para abrir la caja fuerte :");
        Scanner teclado = new Scanner(System.in);
        int intento = teclado.nextInt();
        int contador = 3;
        while (true) {
            if (combinacion != intento) {
                System.out.println("Lo siento, esa no es la combinación, intentalo de nuevo.");
                intento = teclado.nextInt();
                contador--;
            }
            if (combinacion == intento) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            }
            if (contador == 0) {
                System.out.println("Se han acabado tus intentos.");
                break;
            }
        }
    }
}


