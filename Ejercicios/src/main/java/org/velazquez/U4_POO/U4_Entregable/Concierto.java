package org.velazquez.U4_POO.U4_Entregable;

public class Concierto {
    private String nombreCon;
    private String fechaCon;
    private static String organizador = "Javier";
    public Escenario[] escenarios = new Escenario[0];

    public Concierto(String nombreCon,String fechaCon){
        this.nombreCon=nombreCon;
        this.fechaCon=fechaCon;
    }

    public void mostrar_informacion(){
        System.out.println(nombreCon);
        System.out.println(fechaCon);
        for (int i = 0; i < this.escenarios.length; i++) {
            System.out.println(this.escenarios[i].getNombreEsc());
        }
    }


    public static Escenario[] agregar_escenario(Escenario escenarioNuevo, Escenario[] escenarios) {
        Escenario[] copia = new Escenario[escenarios.length + 1];
        System.arraycopy(escenarios, 0, copia, 0, escenarios.length);
        copia[escenarios.length] = escenarioNuevo;
        return copia;
    }

    public void setNombreCon(String nombreCon) {
        this.nombreCon = nombreCon;
    }

    public void setFechaCon(String fechaCon) {
        this.fechaCon = fechaCon;
    }

    public void setEscenarios(Escenario[] escenarios) {
        this.escenarios = escenarios;
    }

    public static void setOrganizador(String organizador) {
        Concierto.organizador = organizador;
    }

    public String getNombreCon() {
        return nombreCon;
    }

    public String getFechaCon() {
        return fechaCon;
    }

    public Escenario[] getEscenarios() {
        return escenarios;
    }

    public static String getOrganizador() {
        return organizador;
    }
}
