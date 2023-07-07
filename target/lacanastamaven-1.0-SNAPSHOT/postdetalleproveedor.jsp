<%-- 
    Document   : postdetalleproveedor
    Created on : 23-nov-2022, 7:35:54
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    EntProveedor objEntproveedorJson = new EntProveedor();
    NegProveedor objNegProveedor = new NegProveedor();
    int id= Integer.parseInt(request.getParameter("id"));
    ResultSet rs;
    rs = objNegProveedor.detalleProveedorid(id);  
    
        while (rs.next())
             {
                     objEntproveedorJson.setid(rs.getInt("id"));
                     objEntproveedorJson.setnombre(rs.getString("nombre"));
                     objEntproveedorJson.setruc(rs.getString("ruc"));
                     objEntproveedorJson.setestado(rs.getInt("estado"));

             }
             %>
        <%=objEntproveedorJson.toString()%>