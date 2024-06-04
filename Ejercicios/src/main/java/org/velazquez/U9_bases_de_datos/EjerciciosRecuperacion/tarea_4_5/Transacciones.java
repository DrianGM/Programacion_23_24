package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {

    public static void insertarEmpleado(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de empleado: ");
        int emp_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el apellido del empleado: ");
        String apellido = sc.nextLine();

        System.out.print("Introduce el oficio del empleado: ");
        String oficio = sc.nextLine();

        System.out.print("Introduce el número de dir: ");
        int dir = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el salario del empleado: ");
        float salario = sc.nextFloat();
        sc.nextLine();

        System.out.print("Introduce el salario del comision: ");
        float comision = sc.nextFloat();
        sc.nextLine();

        System.out.print("Introduce el número de dep_numero: ");
        int dep_numero = sc.nextInt();
        sc.nextLine();


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

            //Comprobar que el salario es mayor que 0
            if (salario <= 0) {
                System.out.println("Error: El salario debe ser mayor que 0.");
                return;
            } else {
                System.out.println("El salario es mayor a 0.");
            }

            // Comprobar que el director exista
            if (!directorExiste(con, dir)) {
                System.out.println("Error: El director no existe.");
                return;
            } else {
                System.out.println("El director existe.");
            }

            con.setAutoCommit(false);
            String sql = "INSERT INTO empleados (emp_no, apellido, oficio, dir, fecha_alt, salario, comision, dep_numero) VALUES (?, ?, ?, ?, NOW(), ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, emp_no);
            statement.setString(2, apellido);
            statement.setString(3, oficio);
            statement.setInt(4, dir);
            statement.setFloat(5, salario);
            statement.setFloat(6, comision);
            statement.setInt(7, dep_numero);
            statement.executeUpdate();
            con.commit();
            System.out.println("El empleado se ha insertado con exito.");

            con.close();
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

    private static boolean directorExiste(Connection conn, int numDirector) throws SQLException {
        String query = "SELECT * FROM empleados WHERE dir = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, numDirector);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}
