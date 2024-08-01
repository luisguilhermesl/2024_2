/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupersonagem_rpg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/inventario_rpg";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection conex;
 
    public static Connection getConexao() throws SQLException {
        try {
            if (conex == null) {
                conex = DriverManager.getConnection(url, user, password);
            }
            return conex;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
