package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la primera nota : ");
        double a = teclado.nextDouble();
        System.out.println("Por favor, introduzca la segunda nota : ");
        double b = teclado.nextDouble();
        double media = (a + b) / 2;
        if (media >= 5) {
            System.out.println("El alumno está aprobado. Nota media : " + media);
        } else {
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recu = teclado2.nextLine();
            System.out.println(recu);
            switch (recu) {
                case "apto":
                    System.out.println("Tu nota de Programación es : 5");
                    break;
                case "no apto":
                    System.out.println("Tu nota de Programación es : " + media);
                    break;
                default:
                    System.out.println("Ese no es un resultado válido de la recuperación.");
                    break;
            }
        }
    }
}
