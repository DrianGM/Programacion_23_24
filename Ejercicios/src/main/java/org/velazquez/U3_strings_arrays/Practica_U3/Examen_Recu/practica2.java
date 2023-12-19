package org.velazquez.U3_strings_arrays.Practica_U3.Examen_Recu;

import java.util.Arrays;
import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Ingrese el valor a insertar:");
        int valor = sc.nextInt();
        System.out.println("Ingrese la posición :");
        int pos = sc.nextInt();
        int[] arr2 = insertarValor(arr,valor,pos);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] insertarValor(int[] arr,int valor,int pos){
        int[] arr2 = new int[arr.length+1];
        int j = 0;
        for (int i=0;i<arr2.length;i++){
            if (i!=pos){
                arr2[i]=arr[j];
                j++;
            } else {
                arr2[i]=valor;
            }
        }
        return arr2;
    }
}
