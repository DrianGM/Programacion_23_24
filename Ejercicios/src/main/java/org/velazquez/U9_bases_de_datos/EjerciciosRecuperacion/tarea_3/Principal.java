package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_3;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ADEmpresa ade = new ADEmpresa();
        List<Empleado> listaEmpleados = ade.getEmpleados();
        for (Empleado empleado : listaEmpleados){
            System.out.println(empleado);
            System.out.println("-------------------------");
        }
        List<Departamento> listaDepartamentos = ade.getDepartamentos();
        for (Departamento departamento : listaDepartamentos){
            System.out.println(departamento);
            System.out.println("-------------------------");
        }
        ConexionBD.close();
    }
}
