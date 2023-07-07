<%-- 
    Document   : postlistasolicituddetalle
    Created on : 25/11/2022, 10:12:20 AM
    Author     : Usuario
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    int solicitud_id = Integer.parseInt(request.getParameter("id"));
    NegSolicitudDetalle objNegSolicitudDetalle = new NegSolicitudDetalle();
    ResultSet rs;
    rs = objNegSolicitudDetalle.listarSolicitudDetalle(solicitud_id);  

        while (rs.next())
             {
%> {"id":"<%=rs.getInt("id")%>",
"solicitud_id":"<%=rs.getString("solicitud_id")%>",
"insumo_id":"<%=rs.getString("insumo_id")%>",
"insumonombre":"<%=rs.getString("insumonombre")%>",
"cantidad":"<%=rs.getInt("cantidad")%>",
"unidad":"<%=rs.getString("unidad")%>",
"precio":"<%=rs.getString("precio")%>"},      
<%        
  }
%>

