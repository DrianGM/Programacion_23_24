package org.velazquez.U3_strings_arrays.Practica_U3.Examen_Recu;

public class practica1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = aleatorioDeArray(arr);
        System.out.println(n);
    }

    public static int aleatorioDeArray(int[] a){
        int randomMax = a.length-1;
        int randomMin = 0;
        int num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
        return a[num];
    }
}
