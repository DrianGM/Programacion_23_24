package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos = 0;
        System.out.println("Este test de 10 preguntas te ayudará a determinar si tu pareja te está siendo infiel.");
        System.out.println("Debe responder las preguntas con 'si' o 'no'");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        String respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = teclado.next();
        switch (respuesta) {
            case "si":
                puntos = puntos + 3;
                break;
            case "no":
                break;
        }
        System.out.println(puntos);
    }
}
