/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelos.Sede;


/**
 *
 * @author salma
 */

public class SedeDao {

    Conexiones cn = new Conexiones();
    Connection con;

    PreparedStatement ps;
    ResultSet rs;
    public List<Sede> listaSede;

    public List<Sede> listar() {
        List<Sede> lista = new ArrayList<>();
        String sql = "SELECT * FROM sede";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Sede s = new Sede();
                s.SetIdSede(rs.getInt("id_sede"));
                s.SetNombreSede(rs.getString("nombre"));
                s.SetContactoSede(rs.getString("contactos"));

                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Ups, algo salió mal: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

        return lista;
    }

    public List<Sede> listarSedes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Sede> listaSedes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Conexiones {

        public Conexiones() {
        }

        private Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
