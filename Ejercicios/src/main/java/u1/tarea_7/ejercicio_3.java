package u1.tarea_7;

public class ejercicio_3 {
    public static void main(String[] args) {
        int numeroMax = 122;
        int numeroMin = 97;
        int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        System.out.println("El número aleatorio es " + num);
        char letra = (char) num;
        System.out.println("La letra que le corresponde es " + letra);
    }
}
