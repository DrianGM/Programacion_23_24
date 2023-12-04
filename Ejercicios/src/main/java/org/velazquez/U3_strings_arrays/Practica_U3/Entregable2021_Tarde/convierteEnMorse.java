package org.velazquez.U3_strings_arrays.Practica_U3.Entregable2021_Tarde;

public class convierteEnMorse {
    public static void main(String[] args) {
        int n=213;
        String morse = convierteEnMorse(n);
        System.out.println(morse);
    }

    public static String convierteEnMorse(int n){
        String morse = "";
        int digito;
        n=invertirNumero(n);
        while (n!=0){
            digito=n%10;
            n/=10;
            morse = switch (digito) {
                case 1 -> morse + ". _ _ _ _";
                case 2 -> morse + ". . _ _ _";
                case 3 -> morse + ". . . _ _ ";
                case 4 -> morse + ". . . . _";
                case 5 -> morse + ". . . . . ";
                case 6 -> morse + "_ . . . .";
                case 7 -> morse + "_ _ . . .";
                case 8 -> morse + "_ _ _ . .";
                case 9 -> morse + "_ _ _ _ .";
                case 0 -> morse + "_ _ _ _ _";
                default -> morse;
            };
        }
        return morse;
    }

    public static int invertirNumero(int num) {
        int invertido = 0;
        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        return invertido;
    }
}
