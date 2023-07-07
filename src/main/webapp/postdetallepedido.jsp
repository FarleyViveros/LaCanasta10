<%-- 
    Document   : postdetallepedido
    Created on : 26-nov-2022, 19:59:30
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    int pedido_id = Integer.parseInt(request.getParameter("id"));
    EntPedido objEntpedidoJson = new EntPedido();
    NegPedido objNegPedido = new NegPedido();
    ResultSet rs;
    rs = objNegPedido.Pedidoactivoxpedido_id(pedido_id);  
while (rs.next())
             {
                     objEntpedidoJson.setid(rs.getInt("id"));
                     objEntpedidoJson.setfecha(rs.getDate("fecha"));
                     objEntpedidoJson.setfecha_String(rs.getString("fecha"));
                     objEntpedidoJson.setfechaboleta_String(rs.getString("fechaboleta"));
                     objEntpedidoJson.setcantidad(rs.getInt("cantidad"));
                     objEntpedidoJson.settotal(rs.getFloat("total"));
                     objEntpedidoJson.setcliente(rs.getString("cliente"));
                     objEntpedidoJson.setnombremesa(rs.getString("nombremesa"));
                     objEntpedidoJson.setnro(rs.getString("nro"));
                     objEntpedidoJson.setusuario_id(rs.getInt("usuario_id"));
                     objEntpedidoJson.setempleado_id(rs.getInt("empleado_id"));
                     objEntpedidoJson.setmesa_id(rs.getInt("mesa_id"));
                     objEntpedidoJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntpedidoJson.toString()%>