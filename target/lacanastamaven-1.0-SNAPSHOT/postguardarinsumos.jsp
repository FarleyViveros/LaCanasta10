<%-- 
    Document   : postguardarinsumos
    Created on : 23/11/2022, 11:02:16 AM
    Author     : Usuario
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    EntInsumos objEntinsumosJson = new EntInsumos();
    NegInsumos objNegInsumos = new NegInsumos();
    int id= Integer.parseInt(request.getParameter("id"));
    String nombre= request.getParameter("nombre");
    float precio= Float.parseFloat(request.getParameter("precio"));
    String unidad= request.getParameter("unidad");
    int cantidad= Integer.parseInt(request.getParameter("cantidad"));
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEntinsumosJson.setid(id);
    objEntinsumosJson.setnombre(nombre);
    objEntinsumosJson.setprecio(precio);
    objEntinsumosJson.setunidad(unidad);
    objEntinsumosJson.setcantidad(cantidad);
    objEntinsumosJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegInsumos.agregarInsumos(objEntinsumosJson);  
    }
    else{
    rs = objNegInsumos.editarInsumos(objEntinsumosJson);  
    }
     %>
    {"response":<%=rs%>}
