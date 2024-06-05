package org.velazquez.U9_bases_de_datos.Practica.Entregable_2122;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeModel {
    public static void insertarEmployee(Employee employee) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1, employee.getEmployeeNumber());
        statement.setString(2, employee.getLastName());
        statement.setString(3, employee.getFirstName());
        statement.setString(4, employee.getExtension());
        statement.setString(5, employee.getEmail());
        statement.setString(6, employee.getOfficeCode());
        statement.setInt(7, employee.getReportsTo());
        statement.setString(8, employee.getJobTitle());

        statement.executeUpdate();
    }
}
