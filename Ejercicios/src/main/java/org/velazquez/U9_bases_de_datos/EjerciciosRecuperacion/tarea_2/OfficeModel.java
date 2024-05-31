package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_2;

import org.velazquez.U9_bases_de_datos.tarea_2.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OfficeModel {

    public static void insertarOficinas(Office office, List<Employee> empleados){
        Connection con = ConexionBD.getConnection();
        try{
            String sql = "INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1,office.getOfficeCode());
            statement.setString(2,office.getCity());
            statement.setString(3,office.getPhone());
            statement.setString(4,office.getAddressLine1());
            statement.setString(5,office.getAddressLine2());
            statement.setString(6,office.getState());
            statement.setString(7,office.getCountry());
            statement.setString(8,office.getPostalCode());
            statement.setString(9,office.getTerritory());

            String officeCode = office.getOfficeCode();
            statement.executeUpdate();

            for (Employee employee : empleados) {
                statement = con.prepareStatement("INSERT INTO empleados VALUES (?,?,?,?,?,?,?,?)");
                statement.setInt(1, employee.getEmployeeNumber());
                statement.setString(2, employee.getLastName());
                statement.setString(3, employee.getFirstName());
                statement.setString(4, employee.getExtension());
                statement.setString(5, employee.getEmail());
                statement.setString(6, officeCode);
                statement.setInt(7, employee.getReportsTo());
                statement.setString(8,employee.getJobTitle());
                statement.executeUpdate();
            }

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
