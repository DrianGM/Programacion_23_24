package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

public class ejercicio_7 {
    public static void main(String[] args) {
        int cuenta = 0;
        int numero = 0;
        int producto = 1;
        while (cuenta != 10) {
            numero++;
            if (numero % 2 != 0) {
                System.out.println(numero + " es impar.");
                cuenta++;
                producto = numero * producto;
            }
        }
        System.out.println("El producto de todos estos números es : " + producto);
    }
}
