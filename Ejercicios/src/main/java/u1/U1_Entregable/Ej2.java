package u1.U1_Entregable;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        System.out.print("Ingrese una cifra entre 0 y 9: ");
        int cifra = teclado.nextInt();
        while (cifra < 0 || cifra > 9) {
            System.out.println("La cifra debe estar entre 0 y 9.");
            cifra = teclado.nextInt();
        }
        int ocurrencias = 0;
        int posicion = 1;
        while (numero != 0) {
            int digito = numero % 10;
            if (digito == cifra) {
                ocurrencias++;
                System.out.println("La cifra " + cifra + " se ha encontrado en la posición " + posicion);
            }
            numero /= 10;
            posicion++;
        }
        System.out.println(ocurrencias + " ocurrencias.");
    }
}

