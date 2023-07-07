<%-- 
    Document   : postguardarusuario
    Created on : 26-nov-2022, 14:27:02
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
EntUsuario objEntusuarioJson = new EntUsuario();
    NegUsuario objNegUsuario = new NegUsuario();
    int id= Integer.parseInt(request.getParameter("id"));
    int empleado_id= Integer.parseInt(request.getParameter("empleado_id"));
    String nombre= request.getParameter("nombre");
    String correo= request.getParameter("correo");
    String clave= request.getParameter("clave");
    int tipo= Integer.parseInt(request.getParameter("tipo"));
    int estado= Integer.parseInt(request.getParameter("estado"));
    
    objEntusuarioJson.setid(id);
    objEntusuarioJson.setempleado_id(empleado_id);
    objEntusuarioJson.setnombre(nombre);
    objEntusuarioJson.setcorreo(correo);
    objEntusuarioJson.setclave(clave);
    objEntusuarioJson.settipo(tipo);
    objEntusuarioJson.setestado(estado);
    boolean rs;
    if(id==0){
    rs = objNegUsuario.agregarUsuario(objEntusuarioJson);  
    }
    else{
    rs = objNegUsuario.editarUsuario(objEntusuarioJson);  
    }
     %>
    {"response":<%=rs%>}
