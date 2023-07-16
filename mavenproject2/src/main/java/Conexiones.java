
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author salma
 */
    
public class Conexiones {
    private Connection c;

    public Conexiones() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/refugios", "root", "");
        } catch (ClassNotFoundException e) {
            System.err.println("Ups, ha ocurrido un problema: " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return c;
    }
}
