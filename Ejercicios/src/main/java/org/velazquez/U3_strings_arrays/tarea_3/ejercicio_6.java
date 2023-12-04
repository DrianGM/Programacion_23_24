package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;

public class ejercicio_6 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,2,3,4,5,6};
        int[] array2 = sinRepetidos(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static int[] sinRepetidos(int[] t) {
        int[] sinRepetidos = new int[t.length];
        int j,top =0;
        boolean repetido;
        for (int i=0;i<t.length;i++){
            repetido=false;
            j=0;
            while (!repetido && (j<top)){
                if (t[i]==sinRepetidos[j]){
                    repetido=true;
                }
                j++;
            }
            if (!repetido){
                sinRepetidos[top]=t[i];
                top++;
            }
        }
        return Arrays.copyOf(sinRepetidos,top);
    }
}