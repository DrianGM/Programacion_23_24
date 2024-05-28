package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_4;

import org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_3.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {

    public static void main(String[] args) {
        Connection con = ConexionBD.getConnection();
        try {
            con.setAutoCommit(false);
            Customer cus;

            CustomerModel.insertarClientes(
                    cus = new Customer(
                            500,
                            "Chiqui Ibai",
                            "Garatea",
                            "Alberto",
                            "+34 722 84 62 17",
                            "Manzana 34",
                            "5 3B",
                            "Bilbao",
                            "Pais Vasco",
                            "50090",
                            "Spain",
                            1166,
                            14000));

            System.out.println("Cliente insertado.");

            PaymentModel.insertarPagos(
                    new Payment(
                            cus.getCustomerNumber(),
                            "ET64396",
                            "2005-12-15",
                            17565.08));

            PaymentModel.insertarPagos(
                    new Payment(
                            cus.getCustomerNumber(),
                            "ETA9965",
                            "2005-12-16",
                            10500.88));

            System.out.println("Pagos insertados.");
            con.commit();

        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error en el rollback.");
                for (StackTraceElement element : ex.getStackTrace()) {
                    System.out.println(element);
                }
            }
        }
    }
}
