package u1.U1_Entregable;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero;
        do {
            System.out.print("Ingrese un número con una cantidad de cifras par par: ");
            numero = sc.nextLong();
            int longitud = 0;
            long num = numero;

            while (num > 0) {
                num /= 10;
                longitud++;
            }

            if (longitud % 2 != 0) {
                System.out.println("El número no tiene un número par de dígitos. Intentalo de nuevo.");
            } else {
                long mitad1 = 0;
                long mitad2 = 0;
                long contador = 0;

                num = numero;

                while (num > 0) {
                    long digito = num % 10;
                    num /= 10;

                    if (contador < longitud / 2) {
                        mitad2 = mitad2 + digito * (long) Math.pow(10, contador);
                    } else {
                        mitad1 = mitad1 + digito * (long) Math.pow(10, contador - longitud / 2);
                    }
                    contador++;
                }

                System.out.println("Número original: " + numero);
                System.out.println("Mitad 1: " + mitad1);
                System.out.println("Mitad 2: " + mitad2);
                long contador2 = 0;
                for (long I = 1; I <= mitad1; I++) {
                    if ((mitad1 % I) == 0) {
                        contador2++;
                    }
                }
                if (contador2 <= 2) {
                    System.out.println("El numero " + mitad1 + " es primo");
                } else {
                    System.out.println("El numero " + mitad1 + " no es primo");
                }
                long contador3 = 0;
                for (long J = 1; J <= mitad2; J++) {
                    if ((mitad2 % J) == 0) {
                        contador3++;
                    }
                }
                if (contador3 <= 2) {
                    System.out.println("El numero " + mitad2 + " es primo");
                } else {
                    System.out.println("El numero " + mitad2 + " no es primo");
                }
            }
        } while ((numero + "").length() % 2 != 0);
    }
}


