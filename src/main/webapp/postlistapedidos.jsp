<%-- 
    Document   : postlistapedidos
    Created on : 27-nov-2022, 8:15:14
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegPedido objNegPedido = new NegPedido();
    ResultSet rs;
    rs = objNegPedido.listarPedidos();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "id":"<%=rs.getString("id")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
          "fechaboleta":"<%=rs.getString("fechaboleta")%>",
          "total":"<%=rs.getString("total")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>