package U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print("Ingrese un número :");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}