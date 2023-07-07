<%-- 
    Document   : postventaPedido
    Created on : 26-nov-2022, 19:24:38
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
    String nro= request.getParameter("nroboleta");
    int id= Integer.parseInt(request.getParameter("pedido_id"));
    int mesa_id= Integer.parseInt(request.getParameter("mesa_id"));
    String fechaboleta= request.getParameter("fecha");
    boolean rs;
    rs = objNegPedido.editarEstadoNroPedido(2,id,nro,fechaboleta); 
    objNegMesas.editarMesaEstado(mesa_id,0);
    
     %>
    {"response":<%=rs%>}
