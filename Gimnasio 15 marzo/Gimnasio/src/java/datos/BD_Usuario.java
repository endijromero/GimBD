/*
 * DBContactos.java
 * 
 * Created on 7/04/2008, 10:26:02 PM
 */
package datos;

import java.sql.*;
import logica.Usuario;

public class BD_Usuario {

    BD_Conexion cn;
    
    public BD_Usuario() {
        cn = new BD_Conexion();
    }


    public void insertarUsuario(Usuario u) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement(" insert into usuario (con_nombre, con_telefono, con_email)"
                    + " values(?,?,?)");
            pstm.setString(1, u.getNombre());
            pstm.setString(2, u.getTelefono());
            pstm.setString(3, u.getEmail());


            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    
    public ResultSet getUsuarioById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_telefono, "
                + " con_email "
                + " FROM usuario "
                + " WHERE con_id = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla contactos
     */
    public ResultSet getUsuario() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_telefono, "
                + " con_email "
                + " FROM usuario "
                + " ORDER BY con_nombre ");


        ResultSet res = pstm.executeQuery();
        return res;
    }
    
      public String getMensaje() {
        return cn.getMensaje();
    }
      
         public void borrarUsuario(Usuario u) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("delete from usuario "
                    + " where con_id = ?");

            pstm.setInt(1, u.getId());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }
         
        public void actualizarUsuario(Usuario u) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("update usuario set con_nombre = ?, "
                    + " con_telefono = ?,"
                    + " con_email = ?"
                    + " where con_id = ?");
            pstm.setString(1, u.getNombre());
            pstm.setString(2, u.getTelefono());
            pstm.setString(3, u.getEmail());

            pstm.setInt(3, u.getId());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

  
}
