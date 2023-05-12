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
import modelo.Producto;
import java.sql.ResultSet;

/**
 *
 * @author Liliana
 */
public class Ctrl_Producto {
    
    // PARA GUARDAR
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into bd_jeth.tb_producto value (?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }
        return respuesta;
    }
    
    // PARA VALIDAR EXISTENCIA
    public boolean existeProducto(String producto){
        boolean respuesta = false;
        String sql = "select nombre from tb_producto where nombre = '" + producto + "'";
        Statement st;
        
        try { 
            Connection cn = Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
                respuesta = true;
            }
        } catch (SQLException e){
            System.out.println("Error al buscar el producto: " + e);
        }return respuesta;
    }
    
    // PARA ACTUALIZAR
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update bd_jeth.tb_producto set nombre=? , cantidad=?, precio=?, descripcion=?, porcentajeIva=?, idCategoria=?, estado=? where idCategoria ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

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
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from bd_jeth.tb_producto where idProducto ='" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e);
        }
        return respuesta;
    }
}
