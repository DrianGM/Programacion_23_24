package U1_intro_bucles_condicionales.tarea_6;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número :");
        int mes = teclado.nextInt();
        switch (mes) {
            case 1:
                System.out.println("El mes que le corresponde a ese número es Enero");
                break;
            case 2:
                System.out.println("El mes que le corresponde a ese número es Febrero");
                break;
            case 3:
                System.out.println("El mes que le corresponde a ese número es Marzo");
                break;
            case 4:
                System.out.println("El mes que le corresponde a ese número es Abril");
                break;
            case 5:
                System.out.println("El mes que le corresponde a ese número es Mayo");
                break;
            case 6:
                System.out.println("El mes que le corresponde a ese número es Junio");
                break;
            case 7:
                System.out.println("El mes que le corresponde a ese número es Julio");
                break;
            case 8:
                System.out.println("El mes que le corresponde a ese número es Agosto");
                break;
            case 9:
                System.out.println("El mes que le corresponde a ese número es Septiembre");
                break;
            case 10:
                System.out.println("El mes que le corresponde a ese número es Octubre");
                break;
            case 11:
                System.out.println("El mes que le corresponde a ese número es Noviembre");
                break;
            case 12:
                System.out.println("El mes que le corresponde a ese número es Diciembre");
                break;
            default:
                System.out.println("Ese número no le corresponde a ningún mes.");
                break;

        }
    }
}
