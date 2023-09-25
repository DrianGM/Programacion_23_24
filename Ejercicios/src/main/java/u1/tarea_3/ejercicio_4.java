package u1.tarea_3;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el número de millas: ");
        Scanner teclado = new Scanner(System.in);
        float milla = teclado.nextFloat();
        float km = (milla*1.609f);
        System.out.println(milla+" millas serán "+km+" kilómetros.");
    }
}