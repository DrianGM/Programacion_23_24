package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_2;

import org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_3.ConexionBD;
import org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_4.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderModel {

    public static void insertarPedidos(Order order){
        Connection con = ConexionBD.getConnection();
        try {
            String sql = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

//            statement.setInt(1,order.getCustomerNumber());
//            statement.setString(2,order.getCustomerName());
//            statement.setString(3,order.getContactLastName());
//            statement.setString(4,order.getContactFirstName());
//            statement.setString(5,order.getPhone());
//            statement.setString(6,order.getAddressLine1());
//            statement.setString(7,order.getAddressLine2());
//            statement.setString(8,order.getCity());
//            statement.setString(9,order.getState());
//            statement.setString(10,order.getPostalCode());
//            statement.setString(11,order.getCountry());
//            statement.setInt(12,order.getSalesRepEmployeeNumber());
//            statement.setDouble(13,order.getCreditLimit());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
