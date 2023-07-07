/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntSolicitudDetalle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegSolicitudDetalle {
    public ResultSet listarSolicitudDetalle(int solcitud_id) throws SQLException
    {
        String consulta="SELECT sd.id,sd.solicitud_id,sd.insumo_id,isum.nombre insumonombre,sd.cantidad,sd.unidad,sd.precio FROM solicitud_detalle sd "
                + "left join insumos isum on isum.id=sd.insumo_id"
                + " where sd.solicitud_id="+solcitud_id+" order by sd.id desc";
        System.out.println(consulta);
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
    
    public ResultSet detalleSolicitudDetalle(int id) throws SQLException
    {
        String consulta="SELECT * FROM solicitud_detalle where id="+id+" order by id asc";
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
    
    public Boolean agregarSolicitudDetalle(EntSolicitudDetalle objsolicituddetalle)
    {
        String consulta="insert into solicitud_detalle"
                + "(solicitud_id,insumo_id,cantidad,unidad,precio)"
                + "values('"+objsolicituddetalle.getsolicitud_id()+"','"+objsolicituddetalle.getinsumo_id()+"','"+objsolicituddetalle.getcantidad()+"','"+objsolicituddetalle.getunidad()+"','"+objsolicituddetalle.getprecio()+"');";
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
    
     public Boolean QuitarSolicitudDetalle(int solicitudDetalle_id)
    {
        String consulta="delete from solicitud_detalle where id ="+ solicitudDetalle_id;
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
     public Boolean editarSolicitudDetalle(EntSolicitudDetalle objsolicituddetalle)
    {
        String consulta="update solicitud_detalle set insumo_id="+objsolicituddetalle.getinsumo_id()+",cantidad="+objsolicituddetalle.getcantidad()+",unidad="+objsolicituddetalle.getunidad()+",precio="+objsolicituddetalle.getprecio()+" where id ="+objsolicituddetalle.getid()+";";
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
