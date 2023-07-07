<%-- 
    Document   : posteliminardetallepedido
    Created on : 26-nov-2022, 18:21:04
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    NegPedido objNegPedido = new NegPedido();
    NegPedidoDetalle objNegPedidoDetalle = new NegPedidoDetalle();
    float total= Float.parseFloat(request.getParameter("total"));
    int cantidad= Integer.parseInt(request.getParameter("cantidad"));
    int pedido_id= Integer.parseInt(request.getParameter("pedido_id"));
    int id= Integer.parseInt(request.getParameter("pedidodetalle_id"));
    boolean rs;
    rs = objNegPedidoDetalle.QuitarPedidoDetalle(id); 
    objNegPedido.editarCantidadTotalPedido(cantidad,total,pedido_id);

     %>
    {"response":<%=rs%>}
