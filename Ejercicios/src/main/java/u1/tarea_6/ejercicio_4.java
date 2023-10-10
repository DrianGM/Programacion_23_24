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
            System.out.println("El menor es " + menor);
        } else {
            menor = num1;
            System.out.println("El menor es " + menor);
        }
        System.out.println("Ingrese otro primer número :");
        byte num3 = teclado.nextByte();
        System.out.println("Ingrese otro segundo número :");
        byte num4 = teclado.nextByte();
        byte menor2 = num3 > num4 ? num4 : num3;
        System.out.println("El menor es " + menor2);
    }
}
