package org.velazquez.U7_colecciones.Practica.tarea_4_en_clase;

public class Empleado extends Persona {
  private double sueldo;
  private Departamento departamento;
  private String sos;

  public Empleado(
      String nombre,
      String dni,
      int edad,
      double estatura,
      double sueldo,
      Departamento departamento,
      String sos) {
    super(nombre, dni, edad, estatura);
    this.sueldo = sueldo;
    this.departamento = departamento;
    this.sos = sos;
  }

  @Override
  public String toString() {
    return super.toString() + "sueldo=" + sueldo + "departamento=" + departamento + "sos= " + sos;
  }
}
