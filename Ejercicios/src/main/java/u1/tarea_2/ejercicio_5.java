package u1.tarea_2;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        System.out.println("Ingrese los grados centígrados : ");
        Scanner teclado = new Scanner(System.in);
        int Cel = teclado.nextInt();
        int Fah = 9*Cel/5 + 32;
        System.out.println(Cel+" grados centígrados equivalen a "+Fah+" grados Farenheit");
    }
}