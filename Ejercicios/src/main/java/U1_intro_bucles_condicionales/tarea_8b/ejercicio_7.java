package U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el número que desea invertir :");
        int n = teclado.nextInt();
        int resto = 0;
        while (n!=0){
            resto = (resto*10)+(n%10);
            n/=10;
        }
        System.out.println("El número invertido es : "+resto);
    }
}
