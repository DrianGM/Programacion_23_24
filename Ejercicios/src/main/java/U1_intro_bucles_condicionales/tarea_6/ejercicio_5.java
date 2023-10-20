package U1_intro_bucles_condicionales.tarea_6;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio :");
        double radio = teclado.nextDouble();
        System.out.println("Elige una opción (1-3)");
        System.out.println("1. Calcular diámetro  2. Calcular perímetro  3. Calcular área");
        int respuesta = teclado.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("El diámetro vale " + (radio * 2));
                break;
            case 2:
                System.out.println("El perímetro vale " + (radio * 2 * Math.PI));
                break;
            case 3:
                System.out.println("El área vale " + (radio * radio * Math.PI));
                break;
            default:
                System.out.println("Esa no es una respuesta válida.");
        }
    }
}
