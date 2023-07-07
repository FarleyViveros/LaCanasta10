<%-- 
    Document   : postlistaproveedor
    Created on : 23-nov-2022, 7:31:31
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegProveedor objNegProveedor = new NegProveedor();
    ResultSet rs;
    rs = objNegProveedor.listarProveedor();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "nombre":"<%=rs.getString("nombre")%>",
          "ruc":"<%=rs.getString("ruc")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>
   
