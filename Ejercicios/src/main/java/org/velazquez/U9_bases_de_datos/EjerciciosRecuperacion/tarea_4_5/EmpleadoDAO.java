package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.SQLException;

public interface EmpleadoDAO {
    int create(Empleado empleado) throws SQLException;
    Empleado read(int emp_no) throws SQLException;
    int update(int emp_no, Empleado empleado) throws SQLException;
    int delete(int emp_no) throws SQLException;
}
