package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = teclado.nextLine();
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = teclado.nextLine();
        switch (jugador1) {
            case "piedra":

                break;
            case "papel":
                break;
            case "tijera":
                break;
            default:
                break;
        }

    }
}
