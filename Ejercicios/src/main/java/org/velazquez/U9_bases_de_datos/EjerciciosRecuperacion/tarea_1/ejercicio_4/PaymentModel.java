package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_4;

import org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_3.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentModel {

    public static void insertarPagos(Payment pago){
        Connection con = ConexionBD.getConnection();
        try {
            String sql = "INSERT INTO payments VALUES (?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1,pago.getCustomerNumber());
            statement.setString(2,pago.getCheckNumber());
            statement.setString(3,pago.getPaymentDate());
            statement.setDouble(4,pago.getAmount());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
