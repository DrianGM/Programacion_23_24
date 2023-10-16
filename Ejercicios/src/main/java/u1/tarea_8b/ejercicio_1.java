package u1.tarea_8b;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        int combinacion = 7654;
        System.out.println("Ingrese la combinación para abrir la caja fuerte :");
        Scanner teclado = new Scanner(System.in);
        int intento = teclado.nextInt();
        int contador = 0;
        while (contador!=3){
            if (intento==combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                contador=3;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                contador++;
                intento=teclado.nextInt();
                if (intento==combinacion) {
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                    contador = 3;
                }
                if (contador==3 && intento==combinacion){
                    System.out.println("Ha gastado todas sus oportunidades.");
                }
            }
        }
    }
}

//ESTA SIN TERMINAAAAAAAAAAAAAAAAR
