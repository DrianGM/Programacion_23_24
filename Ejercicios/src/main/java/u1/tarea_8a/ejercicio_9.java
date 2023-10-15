package u1.tarea_8a;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura del árbol en centímetros :");
        int altura1 = teclado.nextInt();
        int altura2 = 0;
        while (altura1 != -1){
            if (altura1>altura2) {
                altura2 = altura1;
                System.out.println("Ingrese la altura del árbol en centímetros :");
                altura1 = teclado.nextInt();
            } else {
                System.out.println("Ingrese la altura del árbol en centímetros :");
                altura1 = teclado.nextInt();
            }
        }
        System.out.println("El árbol más alto mide "+altura2);
    }
}


//ESTA SIN TERMINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAR