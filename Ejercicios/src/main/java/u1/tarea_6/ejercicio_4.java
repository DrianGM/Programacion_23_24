package u1.tarea_6;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número :");
        byte num1 = teclado.nextByte();
        System.out.println("Ingrese el segundo número :");
        byte num2 = teclado.nextByte();
        byte menor = 0;
        if (num1 > num2) {
            menor = num2;
            System.out.println(menor);
        } else {
            menor = num1;
            System.out.println(menor);
        }
    }
}
