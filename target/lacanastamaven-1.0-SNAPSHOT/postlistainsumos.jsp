<%-- 
    Document   : postlistainsumos
    Created on : 23/11/2022, 10:59:50 AM
    Author     : Usuario
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegInsumos objNegInsumos = new NegInsumos();
    ResultSet rs;
    rs = objNegInsumos.listarInsumos();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "nombre":"<%=rs.getString("nombre")%>",
          "precio":"<%=rs.getString("precio")%>",
          "unidad":"<%=rs.getString("unidad")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
          "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>
   
