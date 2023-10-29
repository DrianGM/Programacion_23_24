package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

public class ejercicio_11 {
    public static void main(String[] args) {
        int num =0;
        for (int i=1;i<=10;i++){
            num++;
            for (int j=1;j<=10;j++) {
                System.out.println(num+" * "+j+" = "+num*j);
            }
        }
    }
}

