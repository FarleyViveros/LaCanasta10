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
    
    EntEmpleados objEmpleadosJson = new EntEmpleados();
    NegEmpleados objNegEmpleados = new NegEmpleados();
    int id= Integer.parseInt(request.getParameter("id"));
    String nombre= request.getParameter("nombre");
    String apellidos= request.getParameter("apellidos");
    String direccion= request.getParameter("direccion");
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEmpleadosJson.setid(id);
    objEmpleadosJson.setnombre(nombre);
    objEmpleadosJson.setapellidos(apellidos);
    objEmpleadosJson.setdireccion(direccion);
    objEmpleadosJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegEmpleados.agregarEmpleado(objEmpleadosJson);  
    }
    else{
    rs = objNegEmpleados.editarEmpleado(objEmpleadosJson);  
    }
     %>
    {"response":<%=rs%>}
