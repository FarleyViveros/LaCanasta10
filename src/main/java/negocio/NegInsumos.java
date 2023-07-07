/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntInsumos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegInsumos {
    public ResultSet listarInsumos() throws SQLException
    {
        String consulta="SELECT * FROM insumos order by id asc";
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
    
    public ResultSet listarInsumosenRojo() throws SQLException
    {
        String consulta="SELECT * FROM insumos where cantidad<4 order by id asc";
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
    
    public ResultSet detalleInsumoid(int id) throws SQLException
    {
        String consulta="SELECT * FROM insumos where id="+id+" order by id asc";
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
    
    public Boolean agregarInsumos(EntInsumos objinsumos)
    {
        String consulta="insert into insumos"
                + "(nombre,precio,unidad,cantidad, estado)"
                + "values('"+objinsumos.getnombre()+"','"+objinsumos.getprecio()+"','"+objinsumos.getunidad()+"','"+objinsumos.getcantidad()+"','"+objinsumos.getestado()+"');";
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
    
     public Boolean editarInsumos(EntInsumos objinsumos)
    {
        String consulta="update insumos set nombre ='"+ objinsumos.getnombre() + "',precio ='"+ objinsumos.getprecio() + "',unidad ='"+ objinsumos.getunidad() + "',cantidad ='"+ objinsumos.getcantidad() + "',estado="+objinsumos.getestado()+" where id ="+objinsumos.getid()+";";
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
