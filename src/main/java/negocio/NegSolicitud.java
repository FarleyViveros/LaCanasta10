/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntSolicitud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegSolicitud {
    public ResultSet listarSolicitud() throws SQLException
    {
        String consulta="SELECT so.id,so.proveedor_id,prov.nombre provnombre,prov.ruc,so.usuarioAprobo_id,usuapro.nombre usuaprob,so.usuarioRegistro_id,usureg.nombre usureg,so.fecha_registro,so.cantidad,so.total,so.fecha_aprobacion,so.estado"
                + " FROM solicitud so "
                + "left join proveedor prov on prov.id=so.proveedor_id "
                + "left join usuario usuapro on usuapro.id=so.usuarioAprobo_id "
                + "left join usuario usureg on usureg.id=so.usuarioRegistro_id "
                + "order by so.id desc";
        
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
    
    public ResultSet listarSolicitudRegistradas() throws SQLException
    {
        String consulta="SELECT so.id,so.proveedor_id,prov.nombre provnombre,prov.ruc,so.usuarioAprobo_id,usuapro.nombre usuaprob,so.usuarioRegistro_id,usureg.nombre usureg,so.fecha_registro,so.cantidad,so.total,so.fecha_aprobacion,so.estado"
                + " FROM solicitud so "
                + "left join proveedor prov on prov.id=so.proveedor_id "
                + "left join usuario usuapro on usuapro.id=so.usuarioAprobo_id "
                + "left join usuario usureg on usureg.id=so.usuarioRegistro_id  where so.estado='1' "
                + "order by so.id desc";
        
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
    
    public ResultSet listarSolicitudfechas(String fechaini,String fechafin) throws SQLException
    {
        String consulta="SELECT so.id,so.proveedor_id,prov.nombre provnombre,prov.ruc,so.usuarioAprobo_id,usuapro.nombre usuaprob,so.usuarioRegistro_id,usureg.nombre usureg,so.fecha_registro,so.cantidad,so.total,so.fecha_aprobacion,so.estado"
                + " FROM solicitud so "
                + "left join proveedor prov on prov.id=so.proveedor_id "
                + "left join usuario usuapro on usuapro.id=so.usuarioAprobo_id "
                + "left join usuario usureg on usureg.id=so.usuarioRegistro_id  where cast(so.fecha_registro as Date) between '"+fechaini+"' and '"+fechafin
                + "' order by so.id desc";
        
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
    
    public ResultSet detalleSolicitud(int id) throws SQLException
    {
        String consulta="SELECT * FROM solicitud where id="+id+" order by id asc";
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
    
    public int agregarSolicitud(EntSolicitud objsolicitud)
    {int id=0;
        String consulta="insert into solicitud"
                + "(proveedor_id,usuarioRegistro_id,fecha_registro,cantidad,total,estado)"
                + "values('"+objsolicitud.getproveedor_id()+"','"+objsolicitud.getusuarioRegistro_id()+"','"+objsolicitud.getfecha_registroString()+"','"+objsolicitud.getcantidad()+"','"+objsolicitud.gettotal()+"','"+objsolicitud.getestado()+"');";
        System.out.println(consulta);
        try
        {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=st.getGeneratedKeys();
            if(rs.next()){
                id=rs.getInt(1);
                }
            System.out.println(id);
            return id;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return id;
        }
    }
    
     public Boolean AprobarSolicitud(EntSolicitud objsolicitud)
    {
        String consulta="update solicitud set proveedor_id ='"+ objsolicitud.getproveedor_id() + "',usuarioAprobo_id="+objsolicitud.getusuarioAprobo_id()+",fecha_aprobacion='"+objsolicitud.getfecha_aprobacion()+"',estado="+objsolicitud.getestado()+" where id ="+objsolicitud.getid()+";";
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
     public Boolean editarEstadoSolicitud(EntSolicitud objsolicitud)
    {
        String consulta="update solicitud set fecha_aprobacion='"+objsolicitud.getfecha_aprobacionString()+"', usuarioAprobo_id="+objsolicitud.getusuarioAprobo_id()+", estado="+objsolicitud.getestado()+" where id ="+objsolicitud.getid()+";";
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
