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
    
    EntCarta objEntcartaJson = new EntCarta();
    NegCarta objNegCarta = new NegCarta();
    int id= Integer.parseInt(request.getParameter("id"));
    ResultSet rs;
    rs = objNegCarta.detalleCartaid(id);  
    
        while (rs.next())
             {
                     objEntcartaJson.setid(rs.getInt("id"));
                     objEntcartaJson.setnombre(rs.getString("nombre"));
                     objEntcartaJson.setprecio(rs.getFloat("precio"));
                     objEntcartaJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntcartaJson.toString()%>