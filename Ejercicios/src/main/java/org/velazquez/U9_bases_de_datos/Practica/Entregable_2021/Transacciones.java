package org.velazquez.U9_bases_de_datos.Practica.Entregable_2021;

import java.sql.*;

public class Transacciones {
//    public static void main(String[] args) {
//        Connection conn = CONEXIONBD.getConnection();
//        try {
//
//            conn.setAutoCommit(false);
//
//
//            String sqlEmpleado = "INSERT INTO employee (columnas) VALUES (?)";
//            PreparedStatement pstmtEmpleado = conn.prepareStatement(sqlEmpleado);
//            // Establecer los valores reales para el empleado
//            pstmtEmpleado.setString(1, "valor");
//            pstmtEmpleado.executeUpdate();
//
//            // Obtener el ID del empleado recién insertado
//            ResultSet rs = pstmtEmpleado.getGeneratedKeys();
//            rs.next();
//            int empleadoId = rs.getInt(1);
//
//            // Insertar dos nuevos clientes asociados a este empleado
//            String sqlCliente = "INSERT INTO cliente (columnas, empleado_id) VALUES (?, ?)";
//            PreparedStatement pstmtCliente = conn.prepareStatement(sqlCliente);
//            for (int i = 0; i < 2; i++) {
//                // Establecer los valores reales para el cliente
//                pstmtCliente.setString(1, "valor");
//                pstmtCliente.setInt(2, empleadoId);
//                pstmtCliente.executeUpdate();
//            }
//
//            // Insertar una nueva oficina en Tokyo
//            String sqlOficina = "INSERT INTO oficina (columnas) VALUES (?)";
//            PreparedStatement pstmtOficina = conn.prepareStatement(sqlOficina);
//            // Establecer los valores reales para la oficina
//            pstmtOficina.setString(1, "Tokyo");
//            pstmtOficina.executeUpdate();
//
//            // Obtener el ID de la oficina recién insertada
//            rs = pstmtOficina.getGeneratedKeys();
//            rs.next();
//            int oficinaId = rs.getInt(1);
//
//            // Trasladar todos los empleados de Tokyo a la nueva oficina
//            String sqlTraslado = "UPDATE empleado SET oficina_id = ? WHERE oficina_id = (SELECT id FROM oficina WHERE nombre = 'Tokyo')";
//            PreparedStatement pstmtTraslado = conn.prepareStatement(sqlTraslado);
//            pstmtTraslado.setInt(1, oficinaId);
//            pstmtTraslado.executeUpdate();
//
//            // Confirmar todas las transacciones
//            conn.commit();
//        } catch (SQLException e) {
//            // Si hay algún error, revertir todas las transacciones
//            conn.rollback();
//            throw e;
//        } finally {
//            // Volver a activar auto-commit
//            conn.setAutoCommit(true);
//        }
//    }
}

