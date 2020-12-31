package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {

    Connection con;

    public Connection conectarse() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/agenda?serverTimezone=UTC", "root", "sistemas");
        System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
