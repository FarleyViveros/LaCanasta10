<%-- 
    Document   : postdetallemesa
    Created on : 22/11/2022, 04:07:17 PM
    Author     : Usuario
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    EntEmpleados objEmpleadoJson = new EntEmpleados();
    NegEmpleados objNegEmpleado = new NegEmpleados();
    int id= Integer.parseInt(request.getParameter("id"));
    ResultSet rs;
    rs = objNegEmpleado.detalleEmpleadoid(id);  
    
        while (rs.next())
             {
                     objEmpleadoJson.setid(rs.getInt("id"));
                     objEmpleadoJson.setnombre(rs.getString("nombre"));
                     objEmpleadoJson.setapellidos(rs.getString("apellidos"));
                     objEmpleadoJson.setdireccion(rs.getString("direccion"));
                     objEmpleadoJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEmpleadoJson.toString()%>