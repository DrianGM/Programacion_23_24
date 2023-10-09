package u1.tarea_5b;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        int puntos = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Bienvenido al minicuestionario! Tendrás que responder con 'a' 'b' o 'c' a las preguntas que se te harán sobre el curso.");
        System.out.println("¿Estás listo? Ahí van las preguntas. ");
        System.out.println("1) ¿Cuál de estos NO es un tipo de software?");
        System.out.println("a) Software de programación b) Software libre c) Software de sistemas ");
        String respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            case "b":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("2) ¿Con qué código se representan los caracteres alfanuméricos?");
        System.out.println("a) Código morse b) Código postal c) Código ASCII ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "c":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("3) ¿Cuál de estos NO es un operador lógico para enlazar condiciones en Java?");
        System.out.println("a) && b) $$ c) || ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            case "b":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("4) ¿Cuál de estos ES un tipo de lenguaje de marcado?");
        System.out.println("a) Lenguaje de marcado de procedimiento b) Lenguaje de marcado de etiquetas c) Lenguaje de marcado de reconocimiento ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("5) ¿Cuál de estos ES un lenguaje de alto nivel?");
        System.out.println("a) Ensamblador b) Código máquina c) Java ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "c":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("6) ¿Cuál de estos ES un sistema de codificación de caracteres real?");
        System.out.println("a) Criptocode b) Unicode c) Multicode ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            case "b":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
                break;
        }
        System.out.println("7) ¿Cuál de estos ES el número 12 en binario?");
        System.out.println("a) 1100 b) 1001 c) 0110 ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
        }
        System.out.println("8) ¿Qué significan las siglas BCD en inglés?");
        System.out.println("a) Binary-Coded Decimal b) Binary-Code Developer c) Binary-Class Database ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la a");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
        }
        System.out.println("9) ¿Cuál de estos ES un sistema de gestión de bases de datos real?");
        System.out.println("a) EustaquioDB b) RealityDB c) MariaDB ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "b":
                System.out.println("Has fallado, la respuesta correcta era la c");
                break;
            case "c":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
        }
        System.out.println("10) ¿Cuántas horas de programación hay a la semana?");
        System.out.println("a) 10 b) 8 c) 6 ");
        respuesta = teclado.next();
        switch (respuesta) {
            case "a":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            case "b":
                System.out.println("¡Has acertado!");
                puntos = puntos + 1;
                break;
            case "c":
                System.out.println("Has fallado, la respuesta correcta era la b");
                break;
            default:
                System.out.println("Eso no es una respuesta válida.");
        }
        System.out.println("¡El cuestionario ha acabado! Tu puntuación final ha sido : " + puntos + " puntos.");
    }
}

//if (respuesta.equals("b"))
//puntos++