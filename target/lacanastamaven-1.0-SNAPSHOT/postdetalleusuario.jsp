<%-- 
    Document   : postdetalleusuario
    Created on : 26-nov-2022, 13:05:37
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
    ResultSet rs;
    rs = objNegUsuario.usuarioEmpleado(id);  
    
        while (rs.next())
             {
                     objEntusuarioJson.setid(rs.getInt("id"));
                     objEntusuarioJson.setnombre(rs.getString("nombre"));
                     objEntusuarioJson.setcorreo(rs.getString("correo"));
                     objEntusuarioJson.setclave(rs.getString("clave"));
                     objEntusuarioJson.setempleado_id(rs.getInt("empleado_id"));
                      objEntusuarioJson.settipo(rs.getInt("tipo"));
                     objEntusuarioJson.setestado(rs.getInt("estado"));

             }
%>
<%=objEntusuarioJson.toString()%>