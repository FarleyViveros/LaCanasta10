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
    NegCarta objNegCarta = new NegCarta();
    ResultSet rs;
    rs = objNegCarta.listarCarta();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "nombre":"<%=rs.getString("nombre")%>",
          "precio":"<%=rs.getString("precio")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>
   
