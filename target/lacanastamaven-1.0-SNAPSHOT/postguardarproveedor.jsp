<%-- 
    Document   : postguardarproveedor
    Created on : 23-nov-2022, 7:33:20
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
    String nombre= request.getParameter("nombre");
    String ruc= request.getParameter("ruc");
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEntproveedorJson.setid(id);
    objEntproveedorJson.setnombre(nombre);
    objEntproveedorJson.setruc(ruc);
    objEntproveedorJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegProveedor.agregarProveedor(objEntproveedorJson);  
    }
    else{
    rs = objNegProveedor.editarProveedor(objEntproveedorJson);  
    }
     %>
    {"response":<%=rs%>}
