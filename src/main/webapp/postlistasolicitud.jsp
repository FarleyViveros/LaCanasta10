<%-- 
    Document   : postlistasolicitud
    Created on : 24/11/2022, 04:56:05 PM
    Author     : Usuario
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegSolicitud objNegSolicitud = new NegSolicitud();
    ResultSet rs;
    rs = objNegSolicitud.listarSolicitud();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "proveedor_id":"<%=rs.getString("proveedor_id")%>",
          "provnombre":"<%=rs.getString("provnombre")%>",
          "usuarioAprobo_id":"<%=rs.getString("usuarioAprobo_id")%>",
           "usuaprob":"<%=rs.getString("usuaprob")%>",
          "usuarioRegistro_id":"<%=rs.getString("usuarioRegistro_id")%>",
           "usureg":"<%=rs.getString("usureg")%>",
          "fecha_registro":"<%=rs.getString("fecha_registro")%>",
          "fecha_aprobacion":"<%=rs.getString("fecha_aprobacion")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
          "total":"<%=rs.getString("total")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>
   
