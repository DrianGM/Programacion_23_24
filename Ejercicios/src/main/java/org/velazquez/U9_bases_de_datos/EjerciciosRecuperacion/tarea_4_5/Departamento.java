package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

public class Departamento {
    private int dep_no;
    private String dnombre;
    private String loc;

    public Departamento(int dep_no, String dnombre, String loc) {
        this.dep_no = dep_no;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    public Departamento(){

    }

    public int getDep_no() {
        return dep_no;
    }

    public void setDep_no(int dep_no) {
        this.dep_no = dep_no;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "dept_no=" + dep_no +
                ", dnombre='" + dnombre + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
