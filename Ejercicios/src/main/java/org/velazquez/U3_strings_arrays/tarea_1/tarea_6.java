package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class tarea_6 {
    static boolean esVocal(String a) {
        return switch (a) {
            case "a", "e", "i", "o", "u" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean vocal = esVocal(a);
        System.out.println(vocal);
    }
}
