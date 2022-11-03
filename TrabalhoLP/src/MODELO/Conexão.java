/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**

 */
public class Conexão {
    static Connection con =null;
    static String url = "jdbc:firebirdsql:localhost:D:\\TRABALHO IV UNIDADE\\Tabela\\2TABELA.FDB";
    static String usuario = "sysdba";
    static String senha = "masterkey";

    public static Connection getConexão() throws ClassNotFoundException, SQLException {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
             con = DriverManager.getConnection(url, usuario, senha);
            return con;
    }
}
