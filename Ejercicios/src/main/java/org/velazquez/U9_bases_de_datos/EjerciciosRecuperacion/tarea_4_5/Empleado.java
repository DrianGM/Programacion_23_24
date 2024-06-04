package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

public class Empleado {
    private int emp_no;
    private String apellido;
    private String oficio;
    private int dir;
    private String fecha_alt;
    private float salario;
    private float comision;
    private int dep_numero;

    public Empleado(int emp_no, String apellido, String oficio, int dir, String fecha_alt, float salario, float comision, int dep_numero) {
        this.emp_no = emp_no;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.fecha_alt = fecha_alt;
        this.salario = salario;
        this.comision = comision;
        this.dep_numero = dep_numero;
    }

    public Empleado(){

    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public String getFecha_alt() {
        return fecha_alt;
    }

    public void setFecha_alt(String fecha_alt) {
        this.fecha_alt = fecha_alt;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getDep_numero() {
        return dep_numero;
    }

    public void setDep_numero(int dep_numero) {
        this.dep_numero = dep_numero;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "emp_no=" + emp_no +
                ", apellido='" + apellido + '\'' +
                ", oficio='" + oficio + '\'' +
                ", dir=" + dir +
                ", fecha_alt='" + fecha_alt + '\'' +
                ", salario=" + salario +
                ", comision=" + comision +
                ", dep_numero=" + dep_numero +
                '}';
    }
}
