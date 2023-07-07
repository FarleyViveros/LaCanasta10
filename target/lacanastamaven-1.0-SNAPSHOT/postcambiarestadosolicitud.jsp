<%-- 
    Document   : postcambiarestadosolicitud
    Created on : 25/11/2022, 11:59:32 AM
    Author     : Usuario
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    java.util.Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  

    EntSolicitud objEntsolicitudJson = new EntSolicitud();
    NegSolicitud objSolicitud = new NegSolicitud();
    int id = Integer.parseInt(request.getParameter("solicitud_id"));
    int usuario_id = Integer.parseInt(request.getParameter("usuario_id"));
    String fechaaprobo = dateFormat.format(date);
    int estado = Integer.parseInt(request.getParameter("estado"));
    
    objEntsolicitudJson.setid(id);
    objEntsolicitudJson.setusuarioAprobo_id(usuario_id);
    objEntsolicitudJson.setfecha_aprobacionString(fechaaprobo);
    objEntsolicitudJson.setestado(estado);
    boolean rs;
    rs = objSolicitud.editarEstadoSolicitud(objEntsolicitudJson);  
     %>
    {"response":<%=rs%>}
