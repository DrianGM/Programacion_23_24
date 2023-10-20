package U1_intro_bucles_condicionales.tarea_5b;

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
                switch (jugador2) {
                    case "piedra":
                        System.out.println("Empate");
                        break;
                    case "papel":
                        System.out.println("Gana el jugador 2.");
                        break;
                    case "tijera":
                        System.out.println("Gana el jugador 1.");
                        break;
                    default:
                        System.out.println("Esa no es una opción válida.");
                        break;
                }
                break;
            case "papel":
                switch (jugador2) {
                    case "piedra":
                        System.out.println("Gana el jugador 1.");
                        break;
                    case "papel":
                        System.out.println("Empate");
                        break;
                    case "tijera":
                        System.out.println("Gana el jugador 2.");
                        break;
                    default:
                        System.out.println("Esa no es una opción válida.");
                        break;
                }
                break;
            case "tijera":
                switch (jugador2) {
                    case "piedra":
                        System.out.println("Gana el jugador 2.");
                        break;
                    case "papel":
                        System.out.println("Gana el jugador 1.");
                        break;
                    case "tijera":
                        System.out.println("Empate");
                        break;
                    default:
                        System.out.println("Esa no es una opción válida.");
                        break;
                }
                break;
            default:
                System.out.println("Esa no es una opción válida.");
                break;
        }
    }
}
