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
    
    EntCarta objEntcartaJson = new EntCarta();
    NegCarta objNegCarta = new NegCarta();
    int id= Integer.parseInt(request.getParameter("id"));
    String nombre= request.getParameter("nombre");
    float precio= Float.parseFloat(request.getParameter("precio"));
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEntcartaJson.setid(id);
    objEntcartaJson.setnombre(nombre);
    objEntcartaJson.setprecio(precio);
    objEntcartaJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegCarta.agregarCarta(objEntcartaJson);  
    }
    else{
    rs = objNegCarta.editarCarta(objEntcartaJson);  
    }
     %>
    {"response":<%=rs%>}
