/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntProveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegProveedor {
    public ResultSet listarProveedor() throws SQLException
    {
        String consulta="SELECT * FROM proveedor order by id asc";
        try
        {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet detalleProveedorid(int id) throws SQLException
    {
        String consulta="SELECT * FROM proveedor where id="+id+" order by id asc";
        try
        {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public Boolean agregarProveedor(EntProveedor objproveedor)
    {
        String consulta="insert into proveedor"
                + "(nombre,ruc, estado)"
                + "values('"+objproveedor.getnombre()+"','"+objproveedor.getruc()+"','"+objproveedor.getestado()+"');";
        System.out.println(consulta);
        try
        {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
    
     public Boolean editarProveedor(EntProveedor objproveedor)
    {
        String consulta="update proveedor set nombre ='"+ objproveedor.getnombre() + "',ruc ='"+ objproveedor.getruc() + "',estado="+objproveedor.getestado()+" where id ="+objproveedor.getid()+";";
        System.out.println(consulta);
        try
        {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    } 
}
