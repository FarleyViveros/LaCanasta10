<%-- 
    Document   : postlistapedidosdetallemesa
    Created on : 25-nov-2022, 21:41:21
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    int pedido_id = Integer.parseInt(request.getParameter("id"));
    NegPedidoDetalle objNegPedidoDetalle = new NegPedidoDetalle();
    ResultSet rs;
    rs = objNegPedidoDetalle.listarPedidoDetalle(pedido_id);  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "pedido_id":"<%=rs.getString("pedido_id")%>",
          "carta_id":"<%=rs.getString("carta_id")%>",
          "cartanombre":"<%=rs.getString("cartanombre")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
          "precio":"<%=rs.getString("precio")%>",
          "total":"<%=rs.getString("total")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>