package u1.tarea_8a;

public class ejercicio_11 {
    public static void main(String[] args) {

        int n = 1;
        int cuenta = 1;
        while (n != 11) {
            while (cuenta != 11) {
                System.out.println(n + " * " + cuenta + " = " + cuenta * n);
                cuenta++;
            }
            cuenta = 1;
            n++;
        }
    }
}

