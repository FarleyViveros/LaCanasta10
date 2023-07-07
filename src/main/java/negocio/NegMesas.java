/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntMesas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegMesas {
    public ResultSet listarMesas() throws SQLException
    {
        String consulta="SELECT * FROM mesas order by id asc";
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
    
    public ResultSet detalleMesaid(int id) throws SQLException
    {
        String consulta="SELECT * FROM mesas where id="+id+" order by id asc";
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
    
    public Boolean agregarMesa(EntMesas objmesas)
    {
        String consulta="insert into mesas"
                + "(nombre, estado)"
                + "values('"+objmesas.getnombre()+"','"+objmesas.getestado()+"');";
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
    
     public Boolean editarMesa(EntMesas objmesas)
    {
        String consulta="update mesas set nombre ='"+ objmesas.getnombre() + "',estado="+objmesas.getestado()+" where id ="+objmesas.getid()+";";
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
    
    public Boolean editarMesaEstado(int mesa_id, int estado)
    {
        String consulta="update mesas set estado ='"+ estado + "' where id ="+mesa_id+";";
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
