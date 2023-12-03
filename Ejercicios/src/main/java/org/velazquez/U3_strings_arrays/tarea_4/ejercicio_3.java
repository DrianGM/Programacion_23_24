package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeroMesa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ocupacion = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Bienvenido, ¿cuántos son?");
        int clientes = sc.nextInt();
        boolean terminado = false;
        int numero=0;
        while (clientes != -1) {
            switch (clientes) {
                case 1:
                    for (int i=0;i<ocupacion.length;i++){
                        if (ocupacion[i]==0){
                            numero=i;
                            ocupacion[i]++;
                            terminado=true;
                            break;
                        }
                    }
                    if (terminado){
                        System.out.println("Por favor, siéntense en la mesa número "+numero+1);
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<=3 && ocupacion[i]<4){
                                numero=i;
                                ocupacion[i]++;
                                terminado=true;
                                break;
                            }
                        }
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+numero+1);
                    }
                    if (!terminado){
                        System.out.println("Lo siento, estamos llenos.");
                        clientes = -1;
                        break;
                    }
                    terminado=false;
                    System.out.println(Arrays.toString(numeroMesa));
                    System.out.println(Arrays.toString(ocupacion));
                    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa) :");
                    clientes = sc.nextInt();
                    break;
                case 2:
                    for (int i=0;i<ocupacion.length;i++){
                        if (ocupacion[i]==0){
                            ocupacion[i]=ocupacion[i]+2;
                            terminado=true;
                            break;
                        }
                    }
                    if (terminado){
                        System.out.println("Por favor, siéntense en la mesa número "+numero+1);
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<=2 && ocupacion[i]<4){
                                ocupacion[i]=ocupacion[i]+2;;
                                terminado=true;
                                System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+numero+1);
                                break;
                            }
                        }
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<4){
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                                terminado=true;
                                break;
                            }
                        }
                    }
                    if (!terminado){
                        System.out.println("Lo siento, estamos llenos.");
                        clientes=-1;
                        break;
                    }
                    terminado=false;
                    System.out.println(Arrays.toString(numeroMesa));
                    System.out.println(Arrays.toString(ocupacion));
                    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa) :");
                    clientes = sc.nextInt();
                    break;
                case 3:
                    for (int i=0;i<ocupacion.length;i++){
                        if (ocupacion[i]==0){
                            ocupacion[i]=ocupacion[i]+3;
                            terminado=true;
                            break;
                        }
                    }
                    if (terminado){
                        System.out.println("Por favor, siéntense en la mesa número "+numero+1);
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<=1 && ocupacion[i]<4){
                                ocupacion[i]=ocupacion[i]+3;;
                                terminado=true;
                                System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+numero+1);
                                break;
                            }
                        }
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<4){
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                                terminado=true;
                                break;
                            }
                        }
                    }
                    if (!terminado){
                        System.out.println("Lo siento, estamos llenos.");
                        clientes=-1;
                        break;
                    }
                    terminado=false;
                    System.out.println(Arrays.toString(numeroMesa));
                    System.out.println(Arrays.toString(ocupacion));
                    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa) :");
                    clientes = sc.nextInt();
                    break;
                case 4:
                    for (int i=0;i<ocupacion.length;i++){
                        if (ocupacion[i]==0){
                            ocupacion[i]=ocupacion[i]+4;
                            terminado=true;
                            break;
                        }
                    }
                    if (terminado){
                        System.out.println("Por favor, siéntense en la mesa número "+numero+1);
                    }
                    if (!terminado){
                        for (int i=0;i<ocupacion.length;i++){
                            if (ocupacion[i]<4){
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                                terminado=true;
                                break;
                            }
                        }
                    }
                    if (!terminado){
                        System.out.println("Lo siento, estamos llenos.");
                        clientes=-1;
                        break;
                    }
                    terminado=false;
                    System.out.println(Arrays.toString(numeroMesa));
                    System.out.println(Arrays.toString(ocupacion));
                    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa) :");
                    clientes = sc.nextInt();
                    break;
                default:
                    System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
                    clientes = sc.nextInt();
                    break;
            }
        }
        System.out.println("Gracias. Hasta pronto.");
    }
}

