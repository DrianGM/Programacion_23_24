package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {

    public static void insertarEmpleado(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de empleado: ");
        int emp_no = scanner.nextInt();
//
//        System.out.print("Introduce el apellido del empleado: ");
//        String apellido = scanner.nextLine();
//
//        System.out.print("Introduce el oficio del empleado: ");
//        String oficio = scanner.nextLine();
//
//        System.out.print("Introduce el número de dir: ");
//        int dir = scanner.nextInt();
//
//        System.out.print("Introduce el salario del empleado: ");
//        float salario = scanner.nextFloat();
//
//        System.out.print("Introduce el salario del comision: ");
//        float comision = scanner.nextFloat();

        System.out.print("Introduce el número de dep_numero: ");
        int dep_numero = scanner.nextInt();

        //Comprobaciones :

        Connection con = null;
        try {
            con = ConexionBD.getConnection();

            // Comprobar que el departamento exista
            if (!departamentoExiste(con, dep_numero)) {
                System.out.println("Error: El departamento no existe.");
            } else{
                System.out.println("El departamento existe.");
            }

            // Comprobar que el número de empleado no exista
            if (empleadoExiste(con, emp_no)) {
                System.out.println("Error: El número de empleado ya existe.");
                return;
            } else {
                System.out.println("El empleado no existe todavia.");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean departamentoExiste(Connection conn, int dep_numero) throws SQLException {
        String query = "SELECT * FROM departamentos WHERE dep_no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, dep_numero);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    private static boolean empleadoExiste(Connection conn, int numEmpleado) throws SQLException {
        String query = "SELECT * FROM empleados WHERE emp_no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, numEmpleado);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }

}
