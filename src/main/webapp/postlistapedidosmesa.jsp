<%-- 
    Document   : postlistapedidosmesa
    Created on : 25-nov-2022, 21:10:15
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    int mesa_id = Integer.parseInt(request.getParameter("id"));
    EntPedido objEntpedidoJson = new EntPedido();
    NegPedido objNegPedido = new NegPedido();
    ResultSet rs;
    rs = objNegPedido.Pedidoactivoxmesa(mesa_id);  
while (rs.next())
             {
                     objEntpedidoJson.setid(rs.getInt("id"));
                     objEntpedidoJson.setfecha(rs.getDate("fecha"));
                     objEntpedidoJson.setcantidad(rs.getInt("cantidad"));
                     objEntpedidoJson.settotal(rs.getFloat("total"));
                     objEntpedidoJson.setcliente(rs.getString("cliente"));
                     objEntpedidoJson.setusuario_id(rs.getInt("usuario_id"));
                     objEntpedidoJson.setempleado_id(rs.getInt("empleado_id"));
                     objEntpedidoJson.setmesa_id(rs.getInt("mesa_id"));
                     objEntpedidoJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntpedidoJson.toString()%>