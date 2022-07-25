/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {    
    Connection con;
    String url = "jdbc:mysql://localhost:3306/carwash";
    String usuario = "root";
    String senha = "";
  
    public Connection conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ouve um erro" + e);
        }

        return con;
    }

    
}
