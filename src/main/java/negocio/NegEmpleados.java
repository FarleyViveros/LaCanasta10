/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntCarta;
import entidad.EntEmpleados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegEmpleados {
    public ResultSet listarEmpleados() throws SQLException
    {
        String consulta="SELECT emp.*,usu.nombre usunombre \n" +
"FROM empleados emp\n" +
"left join usuario usu on usu.empleado_id=emp.id order by id asc";
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
    
    public ResultSet detalleEmpleadoid(int id) throws SQLException
    {
        String consulta="SELECT * FROM empleados where id="+id+" order by id asc";
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
    
    public Boolean agregarEmpleado(EntEmpleados objempleados)
    {
        String consulta="insert into empleados"
                + "(nombre,apellidos,direccion, estado)"
                + "values('"+objempleados.getnombre()+"','"+objempleados.getapellidos()+"','"+objempleados.getdireccion()+"','"+objempleados.getestado()+"');";
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
    
     public Boolean editarEmpleado(EntEmpleados objempleados)
    {
        String consulta="update empleados set nombre ='"+ objempleados.getnombre() + "',apellidos ='"+ objempleados.getapellidos() + "',direccion ='"+ objempleados.getdireccion() + "',estado="+objempleados.getestado()+" where id ="+objempleados.getid()+";";
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
