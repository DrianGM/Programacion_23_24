package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerModel {
    public static void insertarCustomer(Customer customer, Employee employee) throws SQLException {
        Connection con = ConexionBD.getConnection();
        try {
            boolean continuar = false;
            //Comprobamos mediante una consulta si el empleado pasado por parametro existe en la base de datos.
            String sql2 = "SELECT employeeNumber FROM employees";
            PreparedStatement statement2 = con.prepareStatement(sql2);
            ResultSet rs = statement2.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("employeeNumber");
                if (number == employee.getEmployeeNumber()) {
                    continuar = true;
                    break;
                }
            }

            //Si el empleado existe, se procede con la insercion del cliente y se relaciona con su empleado.
            if (continuar) {
                String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement statement = con.prepareStatement(sql);

                statement.setInt(1, customer.getCustomerNumber());
                statement.setString(2, customer.getCustomerName());
                statement.setString(3, customer.getContactLastName());
                statement.setString(4, customer.getContactFirstName());
                statement.setString(5, customer.getPhone());
                statement.setString(6, customer.getAddressLine1());
                statement.setString(7, customer.getAddressLine2());
                statement.setString(8, customer.getCity());
                statement.setString(9, customer.getState());
                statement.setString(10, customer.getPostalCode());
                statement.setString(11, customer.getCountry());
                statement.setInt(12, employee.getEmployeeNumber());
                statement.setDouble(13, customer.getCreditLimit());

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
