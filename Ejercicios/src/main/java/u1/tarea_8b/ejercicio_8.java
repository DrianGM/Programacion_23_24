package u1.tarea_8b;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer día de la semana (1-7)");
        int dia1 = teclado.nextInt();
        System.out.println("Ingrese el segundo día de la semana (1-7)");
        int dia2 = teclado.nextInt();
        System.out.println("Ingrese la primera hora : ");
        int hora1 = teclado.nextInt();
        System.out.println("Ingrese la segunda hora : ");
        int hora2 = teclado.nextInt();
        while (dia1 < 1 || dia1 > 7) {
            System.out.println("El dia 1 es erróneo, ingreselo de nuevo. (1-7)");
        }
        while (dia2 < 1 || dia2 > 7) {
            System.out.println("El dia 2 es erróneo, ingreselo de nuevo. (1-7)");
        }
        while (hora1 < 1 || hora1 > 24) {
            System.out.println("La hora 1 es erróneo, ingreselo de nuevo. (1-24)");
        }
        while (hora2 < 1 || hora2 > 24) {
            System.out.println("La hora 2 es erróneo, ingreselo de nuevo. (1-24)");
        }
        while (dia2 > dia1) {
            System.out.println("El dia 2 es erróneo, ingreselo de nuevo. (1-7)");
        }
        
    }
}
