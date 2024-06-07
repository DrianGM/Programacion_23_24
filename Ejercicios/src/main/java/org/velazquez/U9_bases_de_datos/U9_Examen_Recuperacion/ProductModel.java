package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProductModel {
    public static void insertarProduct(Product product) {
        Connection con = ConexionBD.getConnection();
        try {
            String sql = "INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, product.getProductCode());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getProductLine());
            statement.setString(4, product.getProductScale());
            statement.setString(5, product.getProductVendor());
            statement.setString(6, product.getProductDescription());
            statement.setInt(7, product.getQuantityInStock());
            statement.setDouble(8, product.getBuyPrice());
            statement.setDouble(9, product.getMSRP());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
