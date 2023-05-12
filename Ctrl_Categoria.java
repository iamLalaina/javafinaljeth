/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Categoria;

/**
 *
 * @author Liliana
 */
public class Ctrl_Categoria {

    // PARA GUARDAR
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into bd_jeth.tb_categoria value (?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getDescripcion());
            consulta.setInt(4, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria: " + e);
        }
        return respuesta;
    }
    
    
    
    // PARA ACTUALIZAR
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update bd_jeth.tb_categoria set nombre=? , descripcion=? where idCategoria ='" + idCategoria + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar el dato: " + e);
        }
        return respuesta;
    }
    
    
    // PARA ELIMINAR
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from bd_jeth.tb_categoria where idCategoria ='" + idCategoria + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar la categoria: " + e);
        }
        return respuesta;
    }

    

}
