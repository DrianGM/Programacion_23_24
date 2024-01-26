package org.velazquez.U4_POO.U4_Entregable;

public class Escenario {
    private String nombreEsc;
    private String ubiEsc;
    private int capacidadEsc;
    public Cantante[] cantantes = new Cantante[0];

    public Escenario(String nombreEsc,String ubiEsc,int capacidadEsc){
        this.nombreEsc=nombreEsc;
        this.ubiEsc=ubiEsc;
        this.capacidadEsc=capacidadEsc;
    }

    public void mostrar_informacion(){
        System.out.println(nombreEsc);
        System.out.println(ubiEsc);
        System.out.println(capacidadEsc);
    }

    public static Cantante[] agregar_cantante(Cantante cantanteNuevo, Cantante[] cantantes) {
        Cantante[] copia = new Cantante[cantantes.length + 1];
        System.arraycopy(cantantes, 0, copia, 0, cantantes.length);
        copia[cantantes.length] = cantanteNuevo;
        return copia;
    }

    public void mostrar_cantantes() {
        for (int i = 0; i < this.cantantes.length; i++) {
            System.out.println(this.cantantes[i].getNombreArtista());
        }
    }

    public void setNombreEsc(String nombreEsc) {
        this.nombreEsc = nombreEsc;
    }

    public void setUbiEsc(String ubiEsc) {
        this.ubiEsc = ubiEsc;
    }

    public void setCapacidadEsc(int capacidadEsc) {
        this.capacidadEsc = capacidadEsc;
    }

    public void setCantantes(Cantante[] cantantes) {
        this.cantantes = cantantes;
    }

    public String getNombreEsc() {
        return nombreEsc;
    }

    public String getUbiEsc() {
        return ubiEsc;
    }

    public int getCapacidadEsc() {
        return capacidadEsc;
    }

    public Cantante[] getCantantes() {
        return cantantes;
    }
}
