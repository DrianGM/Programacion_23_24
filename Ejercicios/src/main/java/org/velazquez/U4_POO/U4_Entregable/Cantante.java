package org.velazquez.U4_POO.U4_Entregable;

public class Cantante {
    private String nombreReal;
    private String nombreArtista;
    private int edad;
    private String ciudadOrigen;
    public Cancion[] canciones = new Cancion[0];

    public Cantante(String nombreReal,String nombreArtista,int edad,String ciudadOrigen){
        this.nombreReal=nombreReal;
        this.nombreArtista=nombreArtista;
        this.edad=edad;
        this.ciudadOrigen=ciudadOrigen;
    }

    public void mostrar_informacion(){
        System.out.println(nombreReal);
        System.out.println(nombreArtista);
        System.out.println(edad);
        System.out.println(ciudadOrigen);
    }

    public static Cancion[] agregar_cancion(Cancion cancionNueva, Cancion[] canciones) {
        Cancion[] copia = new Cancion[canciones.length + 1];
        System.arraycopy(canciones, 0, copia, 0, canciones.length);
        copia[canciones.length] = cancionNueva;
        return copia;
    }

    public void mostrarlista() {
        for (int i = 0; i < this.canciones.length; i++) {
            System.out.println(this.canciones[i].getTitulo());
        }
    }

    public static Cancion[] eliminar_cancion(Cancion cancionElim, Cancion[] canciones) {
        Cancion[] copia = new Cancion[canciones.length - 1];
        int j = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (!canciones[i].getTitulo().equals(cancionElim.getTitulo())){
                copia[j]=canciones[i];
                j++;
            }
        }
        return copia;
    }


    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }
}
