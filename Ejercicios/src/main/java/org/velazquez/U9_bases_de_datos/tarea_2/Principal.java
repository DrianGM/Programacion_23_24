package org.velazquez.U9_bases_de_datos.tarea_2;

import java.sql.SQLException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws SQLException {
        ADClassicModels ad = new ADClassicModels();
        List<Employee> empleados = ad.getEmpleados();
        List<Office> offices = ad.getOffices();

        for (Employee emp : empleados) {
            System.out.println(emp);
        }

        for (Office office : offices) {
            System.out.println(office);
        }

        ConexionBD.close();
    }
}
