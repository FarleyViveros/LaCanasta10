<%-- 
    Document   : postlistamesas
    Created on : 22/11/2022, 12:21:25 PM
    Author     : Usuario
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegMesas objNegMesas = new NegMesas();
    ResultSet rs;
    rs = objNegMesas.listarMesas();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "nombre":"<%=rs.getString("nombre")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>
   
