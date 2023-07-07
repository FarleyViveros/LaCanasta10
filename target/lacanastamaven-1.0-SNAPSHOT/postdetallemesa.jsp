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
    
    EntMesas objEntmesaJson = new EntMesas();
    NegMesas objNegMesas = new NegMesas();
    int id= Integer.parseInt(request.getParameter("id"));
    ResultSet rs;
    rs = objNegMesas.detalleMesaid(id);  
    
        while (rs.next())
             {
                     objEntmesaJson.setid(rs.getInt("id"));
                     objEntmesaJson.setnombre(rs.getString("nombre"));
                     objEntmesaJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntmesaJson.toString()%>