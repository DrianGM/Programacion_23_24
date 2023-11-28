package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeroMesa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ocupacion = new int[10];
        System.out.println("che cuantos son");
        int clientes = sc.nextInt();
        boolean terminado = false;
        while (clientes != -1) {
            switch (clientes) {
                case 1:
                    for (int i = 0; i < ocupacion.length; i++) {
                        if (ocupacion[i] == 0) {
                            ocupacion[i] = 1;
                            terminado = true;
                            break;
                        }
                    }
                    if (terminado) {
                        System.out.println(Arrays.toString(numeroMesa));
                        System.out.println(Arrays.toString(ocupacion));
                        clientes = sc.nextInt();
                        break;
                    } else {
                        for (int i = 0; i < ocupacion.length; i++) {
                            if (ocupacion[i] < 4) {
                                ocupacion[i] = ocupacion[i] + 1;
                                break;
                            }
                        }
                        System.out.println(Arrays.toString(numeroMesa));
                        System.out.println(Arrays.toString(ocupacion));
                        clientes = sc.nextInt();
                        break;
                    }
                case 2:
                    clientes = sc.nextInt();
                    break;
                case 3:
                    clientes = sc.nextInt();
                    break;
                case 4:
                    clientes = sc.nextInt();
                    break;
                default:
                    System.out.println("bro " + clientes + " eso no e valido");
                    clientes = sc.nextInt();
                    break;
            }
        }
    }
}
