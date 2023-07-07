/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntPedidoDetalle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegPedidoDetalle {
    public ResultSet listarPedidoDetalle(int pedido_id) throws SQLException
    {
        String consulta="SELECT sd.id,sd.pedido_id,sd.carta_id,isum.nombre cartanombre,sd.cantidad,sd.total,sd.precio,sd.estado "
                + "FROM pedido_detalle sd "
                + "left join carta isum on isum.id=sd.carta_id"
                + " where sd.pedido_id="+pedido_id+" order by sd.id desc";
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
    
    public ResultSet detallePedidoDetalle(int id) throws SQLException
    {
        String consulta="SELECT * FROM pedido_detalle where id="+id+" order by id asc";
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
    
    public Boolean agregarPedidoDetalle(EntPedidoDetalle objspedidodetalle)
    {
        String consulta="insert into pedido_detalle"
                + "(pedido_id,carta_id,cantidad,precio,total,estado)"
                + "values('"+objspedidodetalle.getpedido_id()+"','"+objspedidodetalle.getcarta_id()+"','"+objspedidodetalle.getcantidad()+"','"+objspedidodetalle.getprecio()+"','"+objspedidodetalle.gettotal()+"','"+objspedidodetalle.getestado()+"');";
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
    
     public Boolean QuitarPedidoDetalle(int pedidoDetalle_id)
    {
        String consulta="delete from pedido_detalle where id ="+ pedidoDetalle_id;
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
     
     public Boolean editarPedidoDetalle(EntPedidoDetalle objpedidodetalle)
    {
        String consulta="update pedido_detalle set cantidad="+objpedidodetalle.getcantidad()+",precio="+objpedidodetalle.getprecio()+",total="+objpedidodetalle.gettotal()+" where id ="+objpedidodetalle.getid()+";";
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
