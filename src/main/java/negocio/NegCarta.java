/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntCarta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegCarta {
   public ResultSet listarCarta() throws SQLException
    {
        String consulta="SELECT * FROM carta order by id asc";
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
    
    public ResultSet detalleCartaid(int id) throws SQLException
    {
        String consulta="SELECT * FROM carta where id="+id+" order by id asc";
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
    
    public Boolean agregarCarta(EntCarta objcarta)
    {
        String consulta="insert into carta"
                + "(nombre,precio, estado)"
                + "values('"+objcarta.getnombre()+"','"+objcarta.getprecio()+"','"+objcarta.getestado()+"');";
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
    
     public Boolean editarCarta(EntCarta objcarta)
    {
        String consulta="update carta set nombre ='"+ objcarta.getnombre() + "',precio ='"+ objcarta.getprecio() + "',estado="+objcarta.getestado()+" where id ="+objcarta.getid()+";";
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
