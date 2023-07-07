<%-- 
    Document   : postdetalleinsumos
    Created on : 23/11/2022, 11:05:54 AM
    Author     : Usuario
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    EntInsumos objEntinsumosJson = new EntInsumos();
    NegInsumos objNegInsumoa = new NegInsumos();
    int id= Integer.parseInt(request.getParameter("id"));
    ResultSet rs;
    rs = objNegInsumoa.detalleInsumoid(id);  
    
        while (rs.next())
             {
                     objEntinsumosJson.setid(rs.getInt("id"));
                     objEntinsumosJson.setnombre(rs.getString("nombre"));
                     objEntinsumosJson.setprecio(rs.getFloat("precio"));
                     objEntinsumosJson.setunidad(rs.getString("unidad"));
                     objEntinsumosJson.setcantidad(rs.getInt("cantidad"));
                     objEntinsumosJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntinsumosJson.toString()%>