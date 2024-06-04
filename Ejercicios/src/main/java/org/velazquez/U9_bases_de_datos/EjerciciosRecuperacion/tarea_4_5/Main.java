package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Transacciones.insertarEmpleado();

        EmpleadoDAOImpl edi = new EmpleadoDAOImpl();

        Empleado emp = new Empleado(4,"Pedri","Chef",1,"2024-06-04",4000,500,1);
        int filas = edi.create(emp);
        System.out.println(filas);

        Empleado emp2 = new Empleado(4,"Pedri","Futbolista",1,"2024-06-04",4000,500,1);
        edi.update(4,emp2);

        Empleado emp3 = edi.read(1);
        System.out.println(emp3);

        int filas2 = edi.delete(4);
        System.out.println(filas2);



        DepartamentoDAOImpl ddi = new DepartamentoDAOImpl();

        Departamento dep = new Departamento(4,"Ventas","Cadiz");
        int filas3 = ddi.create(dep);
        System.out.println(filas3);

        Departamento dep2 = new Departamento(4,"Consultoria","Cadiz");
        ddi.update(4,dep2);

        Departamento dep3 = ddi.read(1);
        System.out.println(dep3);

        int filas4 = ddi.delete(4);
        System.out.println(filas4);

    }
}
