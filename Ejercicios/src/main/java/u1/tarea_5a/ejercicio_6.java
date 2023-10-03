package u1.tarea_5a;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        double gravedad = 9.8;
        System.out.println("Ingrese el tiempo : ");
        Scanner teclado = new Scanner(System.in);
        double tiempo = teclado.nextDouble();
        if (tiempo > 0) {
            double velocidad = gravedad * tiempo;
            System.out.println("La velocidad será :" + velocidad);
        } else {
            System.out.println("Tiempo incorrecto.");
        }
    }
}

//final double gravedad = 9.8;