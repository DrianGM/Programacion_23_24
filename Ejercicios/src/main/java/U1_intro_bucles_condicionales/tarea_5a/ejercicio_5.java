package U1_intro_bucles_condicionales.tarea_5a;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Ingrese el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);
            } else {
                System.out.println("El mayor es: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
}


//if (n1 > n2 && n1 > n3) {
//System.out.println("El mayor es: " + n1);
//} else if (n2 > n1 && n2 > n3){
//System.out.println("El mayor es: " + n2);
//} else if (n3 > n1 && n3 > n2){
//System.out.println("El mayor es: " + n3);
//}




