package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base imponible : ");
        double base = teclado.nextInt();
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
        String iva = teclado.next();
        int ivaNum = 0;
        switch (iva) {
            case "general":
                ivaNum = 21;
                break;
            case "reducido":
                ivaNum = 10;
                break;
            case "superreducido":
                ivaNum = 4;
                break;
            default:
                System.out.println("No ha ingresado un tipo de IVA válido.");
                break;
        }
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
        String codigo = teclado.next();
        switch (codigo) {
            case "nopro":
                System.out.println("El lunes a primera hora toca Programación");
                break;
            case "mitad":
                System.out.println("El martes a primera hora toca Programación");
                break;
            case "meno5":
                System.out.println("El miercoles a primera hora toca Formación y Orientación Laboral");
                break;
            case "5porc":
                System.out.println("El miercoles a primera hora toca Formación y Orientación Laboral");
                break;
            default:
                System.out.println("No ha ingresado un día de la semana laboral con mayúscula inicial");
                break;
        }

    }
}
