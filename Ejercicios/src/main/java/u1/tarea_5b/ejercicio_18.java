package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_18 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la primera nota : ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.println("Por favor, introduzca la segunda nota : ");
        Scanner teclado2 = new Scanner(System.in);
        double b = teclado2.nextDouble();
        double media = (a + b) / 2;
        if (media >= 5) {
            System.out.println("El alumno está aprobado. Nota media : " + media);
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recu = teclado.next();
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
