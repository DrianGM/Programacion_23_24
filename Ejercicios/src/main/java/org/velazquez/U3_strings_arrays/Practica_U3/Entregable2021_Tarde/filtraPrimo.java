package org.velazquez.U3_strings_arrays.Practica_U3.Entregable2021_Tarde;

import java.util.Arrays;

public class filtraPrimo {

    public static int[] filtraPrimos(int[] array){
        int[] primos = new int[array.length];
        int longitud = 0;
        for (int i=0;i<array.length;i++){
            if (esPrimo(array[i])){
                primos[longitud++]=array[i];
            }
        }
        return Arrays.copyOf(primos,longitud);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,13,17,19};
        int[] primos = filtraPrimos(array);
        System.out.println(Arrays.toString(primos));
    }
}
