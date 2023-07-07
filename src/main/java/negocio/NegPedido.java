/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.conexion;
import entidad.EntPedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class NegPedido {

    public ResultSet Pedidoactivoxmesa(int mesa_id) throws SQLException {
        String consulta = "SELECT pe.id,pe.fecha,pe.cantidad,pe.total,pe.cliente,pe.usuario_id,usuareg.nombre registro,"
                + "pe.empleado_id,usuatiende.nombre nombreatiende,usuatiende.apellidos apellidosatiende,pe.cliente,"
                + "pe.mesa_id,mes.nombre nombremesa,pe.estado "
                + "from pedido pe "
                + "left join usuario usuareg on usuareg.id=pe.usuario_id "
                + "left join empleados usuatiende on usuatiende.id=pe.empleado_id "
                + "left join mesas mes on mes.id = pe.mesa_id "
                + "where pe.mesa_id = '" + mesa_id + "' and pe.estado='1' order by pe.id desc ";

        System.out.println(consulta);
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

     public ResultSet Pedidoactivoxpedido_id(int pedido_id) throws SQLException {
        String consulta = "SELECT pe.id,pe.fecha,pe.cantidad,pe.total,pe.nro,pe.fechaboleta,pe.cliente,pe.usuario_id,usuareg.nombre registro,"
                + "pe.empleado_id,usuatiende.nombre nombreatiende,usuatiende.apellidos apellidosatiende,pe.cliente,"
                + "pe.mesa_id,mes.nombre nombremesa,pe.estado "
                + "from pedido pe "
                + "left join usuario usuareg on usuareg.id=pe.usuario_id "
                + "left join empleados usuatiende on usuatiende.id=pe.empleado_id "
                + "left join mesas mes on mes.id = pe.mesa_id "
                + "where pe.id = '" + pedido_id + "' order by pe.id desc ";

        System.out.println(consulta);
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
     
    public ResultSet Pedidoactivos() throws SQLException {
        String consulta = "SELECT pe.id,pe.fecha,pe.cantidad,pe.total,pe.cliente,pe.usuario_id,usuareg.nombre registro,"
                + "pe.empleado_id,usuatiende.nombre nombreatiende,usuatiende.apellidos apellidosatiende,"
                + "pe.mesa_id,mes.nombre nombremesa,pe.estado "
                + "from pedido pe "
                + "left join usuario usuareg on usuareg.id=pe.usuario_id "
                + "left join empleados usuatiende on usuatiende.id=pe.empleado_id "
                + "left join mesas mes on mes.id = pe.mesa_id "
                + "where  pe.estado='1' order by pe.id desc ";

        System.out.println(consulta);
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet listarPedidos() throws SQLException {
        String consulta = "SELECT pe.id,pe.fecha,pe.fechaboleta,pe.cantidad,pe.total,pe.cliente,pe.usuario_id,usuareg.nombre registro,"
                + "pe.empleado_id,usuatiende.nombre nombreatiende,usuatiende.apellidos apellidosatiende,"
                + "pe.mesa_id,mes.nombre nombremesa,pe.estado "
                + "from pedido pe "
                + "left join usuario usuareg on usuareg.id=pe.usuario_id "
                + "left join empleados usuatiende on usuatiende.id=pe.empleado_id "
                + "left join mesas mes on mes.id = pe.mesa_id "
                + "where  pe.estado='2' order by pe.id desc ";

        System.out.println(consulta);
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet listarPedidofechas(String fechaini, String fechafin) throws SQLException {
        String consulta = "SELECT pe.id,pe.fecha,pe.cantidad,pe.total,pe.cliente,pe.usuario_id,usuareg.nombre registro,pe.empleado_id,emp.nombre nombreatiende,emp.apellidos apellidosatiende,pe.mesa_id,mes.nombre nombremesa,pe.estado \n"
                + "from pedido pe \n"
                + "left join usuario usuareg on usuareg.id=pe.usuario_id \n"
                + "left join empleados emp on emp.id=pe.empleado_id  \n"
                + "left join mesas mes on mes.id = pe.mesa_id  "
                + " where cast(pe.fecha as Date) between '" + fechaini + "' and '" + fechafin + "'"
                + " order by pe.id desc";

        System.out.println(consulta);
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int agregarPedido(EntPedido objpedido) {
        int id = 0;
        String consulta = "insert into pedido"
                + "(fecha,cantidad,total,usuario_id,empleado_id,mesa_id,cliente,estado)"
                + "values('" + objpedido.getfecha_String() + "','" + objpedido.getcantidad() + "','" + objpedido.gettotal() + "','" + objpedido.getusuario_id() + "','" + objpedido.getempleado_id() + "','" + objpedido.getmesa_id() + "','" + objpedido.getcliente() + "','" + objpedido.getestado() + "');";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            System.out.println(id);
            return id;
        } catch (Exception e) {
            System.out.println(e);
            return id;
        }
    }

    public int editarPedido(EntPedido objpedido) {
        int id = 0;
        String consulta = "update pedido set  total='" + objpedido.gettotal() + "',cantidad='" + objpedido.getcantidad() + "', cliente='" + objpedido.getcliente() + "',empleado_id='" + objpedido.getempleado_id() + "' where id =" + objpedido.getid() + ";";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            System.out.println(id);
            return id;
        } catch (Exception e) {
            System.out.println(e);
            return id;
        }
    }

    public Boolean editarCantidadTotalPedido(int cantidad, float total,int pedido_id) {
        String consulta = "update pedido set cantidad='" + cantidad + "',total='" + total + "' where id =" + pedido_id + ";";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public Boolean editarEstadoPedido(int estado, int pedido_id) {
        String consulta = "update pedido set estado='" + estado + "' where id =" + pedido_id + ";";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public Boolean editarEstadoNroPedido(int estado, int pedido_id,String nro,String fechaboleta) {
        String consulta = "update pedido set nro='" + nro + "',fechaboleta='" + fechaboleta + "', estado='" + estado + "' where id =" + pedido_id + ";";
        System.out.println(consulta);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consulta);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet TBboletaCount() throws SQLException {
        String consulta = "SELECT Count(*) FROM pedido";
        try {
            Statement sentencia = conexion.obtener().createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);
            return resultado;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
