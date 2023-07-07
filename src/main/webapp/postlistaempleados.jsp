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
    NegEmpleados objNegEmpleado = new NegEmpleados();
    ResultSet rs;
    rs = objNegEmpleado.listarEmpleados();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "usunombre":"<%=rs.getString("usunombre")%>",
          "nombre":"<%=rs.getString("nombre")%>",
          
          "apellidos":"<%=rs.getString("apellidos")%>",
          "direccion":"<%=rs.getString("direccion")%>",
           "estado":"<%=rs.getInt("estado")%>"},         
           <%        
             }
             %>
   
