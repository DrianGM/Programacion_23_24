package u1.tarea_8a;

public class ejercicio_3 {
    public static void main(String[] args) {
        int numeroMax = 100;
        int numeroMin = 1;
        int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        System.out.println("El número aleatorio es " + num);
        System.out.println("Ingrese ");
    }
}
