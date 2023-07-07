<%-- 
    Document   : postanularpedido
    Created on : 26-nov-2022, 17:32:32
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
   
    NegPedido objNegPedido = new NegPedido();
    NegMesas objNegMesas = new NegMesas();
    int id= Integer.parseInt(request.getParameter("pedido_id"));
    int mesa_id= Integer.parseInt(request.getParameter("mesa_id"));
    int estado = 0;
    boolean rs;
    rs = objNegPedido.editarEstadoPedido(estado,id); 
    objNegMesas.editarMesaEstado(mesa_id,estado);
    
     %>
    {"response":<%=rs%>}
