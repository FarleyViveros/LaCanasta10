<%-- 
    Document   : postguardarmesa
    Created on : 22/11/2022, 04:56:12 PM
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
    String nombre= request.getParameter("nombre");
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEntmesaJson.setid(id);
    objEntmesaJson.setnombre(nombre);
    objEntmesaJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegMesas.agregarMesa(objEntmesaJson);  
    }
    else{
    rs = objNegMesas.editarMesa(objEntmesaJson);  
    }
     %>
    {"response":<%=rs%>}
