package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_2;

import org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_3.ConexionBD;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderModel {

    public static void insertarPedidos(Order order, OrderDetails details){
        Connection con = ConexionBD.getConnection();
        try {
            String sql = "INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1,order.getOrderNumber());
            statement.setString(2,order.getOrderDate());
            statement.setString(3,order.getRequiredDate());
            statement.setString(4,order.getShippedDate());
            statement.setString(5,order.getStatus());
            statement.setString(6,order.getComments());
            statement.setInt(7,order.getCustomerNumber());

            statement.executeUpdate();

            statement = con.prepareStatement("INSERT INTO orderdetails VALUES (?,?,?,?,?)");
            statement.setInt(1,order.getOrderNumber());
            statement.setString(2,details.getProductCode());
            statement.setInt(3,details.getQuantityOrdered());
            statement.setDouble(4,details.getPriceEach());
            statement.setInt(5,details.getOrderLineNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
