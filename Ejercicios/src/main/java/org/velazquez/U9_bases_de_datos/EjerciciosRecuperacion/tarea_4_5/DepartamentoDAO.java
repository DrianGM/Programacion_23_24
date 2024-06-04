package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.SQLException;

public interface DepartamentoDAO {
    int create(Departamento departamento) throws SQLException;
    Departamento read(int dep_no) throws SQLException;
    int update(int dep_no, Departamento departamento) throws SQLException;
    int delete(int dep_no) throws SQLException;
}
