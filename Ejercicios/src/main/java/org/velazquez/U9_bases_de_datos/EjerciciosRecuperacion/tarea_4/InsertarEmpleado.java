package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarEmpleado {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_bd";
    private static final String USER = "mi_usuario";
    private static final String PASS = "mi_contraseña";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de empleado: ");
        int numEmpleado = scanner.nextInt();

        System.out.print("Introduce el nombre del empleado: ");
        String nombre = scanner.next();

        System.out.print("Introduce el apellido del empleado: ");
        String apellido = scanner.next();

        System.out.print("Introduce el salario del empleado: ");
        double salario = scanner.nextDouble();

        System.out.print("Introduce el número de departamento: ");
        int numDepartamento = scanner.nextInt();

        System.out.print("Introduce el número de director: ");
        int numDirector = scanner.nextInt();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            // Comprobar que el departamento exista
            if (!departamentoExiste(conn, numDepartamento)) {
                System.out.println("Error: El departamento no existe.");
                return;
            }

            // Comprobar que el número de empleado no exista
            if (empleadoExiste(conn, numEmpleado)) {
                System.out.println("Error: El número de empleado ya existe.");
                return;
            }

            // Comprobar que el salario sea > 0
            if (salario <= 0) {
                System.out.println("Error: El salario debe ser mayor que 0.");
                return;
            }

            // Comprobar que el director exista
            if (!directorExiste(conn, numDirector)) {
                System.out.println("Error: El director no existe.");
                return;
            }

            // Insertar el empleado
            String query = "INSERT INTO empleados (NUM_EMPLEADO, NOMBRE, APELLIDO, SALARIO, FECHA_ALTA, NUM_DEPARTAMENTO, DIR) VALUES (?, ?, ?, ?, NOW(), ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, numEmpleado);
                pstmt.setString(2, nombre);
                pstmt.setString(3, apellido);
                pstmt.setDouble(4, salario);
                pstmt.setInt(5, numDepartamento);
                pstmt.setInt(6, numDirector);
                pstmt.executeUpdate();
                System.out.println("Empleado insertado con éxito.");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el empleado: " + e.getMessage());
        }
    }

    private static boolean departamentoExiste(Connection conn, int numDepartamento) throws SQLException {
        String query = "SELECT * FROM departamentos WHERE NUM_DEPARTAMENTO = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, numDepartamento);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    private static boolean empleadoExiste(Connection conn, int numEmpleado) throws SQLException {
        String query = "SELECT * FROM empleados WHERE NUM_EMPLEADO = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, numEmpleado);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    private static boolean directorExiste(Connection conn, int numDirector) throws SQLException {
        String query = "SELECT * FROM empleados WHERE NUM_EMPLEADO = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, numDirector);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}
