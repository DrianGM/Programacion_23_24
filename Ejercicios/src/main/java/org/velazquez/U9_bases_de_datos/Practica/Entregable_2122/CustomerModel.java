package org.velazquez.U9_bases_de_datos.Practica.Entregable_2122;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {
    public static void insertarCustomer(Customer customer) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1,customer.getCustomerNumber());
        statement.setString(2,customer.getCustomerName());
        statement.setString(3,customer.getContactLastName());
        statement.setString(4,customer.getContactFirstName());
        statement.setString(5,customer.getPhone());
        statement.setString(6,customer.getAddressLine1());
        statement.setString(7,customer.getAddressLine2());
        statement.setString(8,customer.getCity());
        statement.setString(9,customer.getState());
        statement.setString(10,customer.getPostalCode());
        statement.setString(11,customer.getCountry());
        statement.setInt(12,customer.getSalesRepEmployeeNumber());
        statement.setDouble(13,customer.getCreditLimit());

        statement.executeUpdate();
    }
}
