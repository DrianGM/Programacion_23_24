package u1.tarea_8a;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas = 0;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        while (notas!=6){
            System.out.println("Ingrese una calificación.");
            int calificacion = teclado.nextInt();
            if (calificacion>=5){
                aprobados++;
            } else if (calificacion == 4){
                condicionados++;
            } else {
                suspensos++;
            }
            notas++;
        }
        System.out.println("Hay "+aprobados+" aprobados, "+suspensos+" suspensos, y "+condicionados+" condicionados.");
    }
}
