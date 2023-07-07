/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntCarta;
import entidad.EntUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class NegUsuario {
    public ResultSet login(EntUsuario usuario) throws SQLException
    {
        String consulta="SELECT * FROM usuario where correo='"+usuario.getcorreo()+"' and clave='"+usuario.getclave()+"'";
        try
        {
           System.out.println(consulta);
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
    public ResultSet usuarioEmpleado(int empleado_id) throws SQLException
    {
        String consulta="SELECT * FROM usuario where empleado_id='"+empleado_id+"'";
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
    
    public Boolean agregarUsuario(EntUsuario objusuario)
    {
        String consulta="insert into usuario"
                + "(nombre,correo,clave,empleado_id,tipo, estado)"
                + "values('"+objusuario.getnombre()+"','"+objusuario.getcorreo()+"','"+objusuario.getclave()+"','"+objusuario.getempleado_id()+"','"+objusuario.gettipo()+"','"+objusuario.getestado()+"');";
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
    
     public Boolean editarUsuario(EntUsuario objusuario)
    {
        String consulta="update usuario set nombre ='"+ objusuario.getnombre() + "',correo ='"+ objusuario.getcorreo() + "',clave ='"+ objusuario.getclave() + "',tipo ='"+ objusuario.gettipo() + "',estado="+objusuario.getestado()+" where id ="+objusuario.getid()+";";
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
