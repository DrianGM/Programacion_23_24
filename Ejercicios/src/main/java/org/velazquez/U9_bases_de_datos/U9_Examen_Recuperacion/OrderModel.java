package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OrderModel {
    public static void insertarPedido(Order order, List<OrderDetails> Listadetails) {
        Connection con = ConexionBD.getConnection();
        try {
            boolean continuar = false;
            //Comprobamos mediante una consulta si los productos de los detalles del pedido existen en la base de datos.

            for (OrderDetails details : Listadetails) {
                String sql2 = "SELECT productCode FROM products";
                PreparedStatement statement2 = con.prepareStatement(sql2);
                ResultSet rs = statement2.executeQuery();

                while (rs.next()) {
                    String code = rs.getString("productCode");
                    if (code.equals(details.getProductCode())) {
                        continuar = true;
                        break;
                    } else {
                        continuar = false;
                    }
                }
            }

            //Si todos los productos del pedido existen, se procede a la insercion del pedido y sus detalles.
            if (continuar) {
                String sql = "INSERT INTO orders VALUES (?,?,?,?,?,?,?)";
                PreparedStatement statement = con.prepareStatement(sql);

                statement.setInt(1, order.getOrderNumber());
                statement.setString(2, order.getOrderDate());
                statement.setString(3, order.getRequiredDate());
                statement.setString(4, order.getShippedDate());
                statement.setString(5, order.getStatus());
                statement.setString(6, order.getComments());
                statement.setInt(7, order.getCustomerNumber());

                statement.executeUpdate();

                for (OrderDetails details : Listadetails) {
                    statement = con.prepareStatement("INSERT INTO orderdetails VALUES (?,?,?,?,?)");
                    statement.setInt(1, order.getOrderNumber());
                    statement.setString(2, details.getProductCode());
                    statement.setInt(3, details.getQuantityOrdered());
                    statement.setDouble(4, details.getPriceEach());
                    statement.setInt(5, details.getOrderLineNumber());
                    statement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
