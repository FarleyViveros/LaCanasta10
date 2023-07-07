<%-- 
    Document   : postlogin
    Created on : 21-nov-2022, 19:17:02
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
    EntUsuario objEntusuarioJson = new EntUsuario();
    EntUsuario objEntusuario = new EntUsuario();
    NegUsuario objNegUsuario = new NegUsuario();
    String correo= request.getParameter("correo");
    String clave= request.getParameter("clave");
    objEntusuario.setcorreo(correo);
    objEntusuario.setclave(clave);
    ResultSet rs;
    rs = objNegUsuario.login(objEntusuario);  
    
        while (rs.next())
             {
                     objEntusuarioJson.setid(rs.getInt("id"));
                     objEntusuarioJson.setnombre(rs.getString("nombre"));
                     objEntusuarioJson.setcorreo(rs.getString("correo"));
                     objEntusuarioJson.setclave(rs.getString("clave"));
                      objEntusuarioJson.settipo( rs.getInt("tipo"));
                     objEntusuarioJson.setestado(rs.getInt("estado"));
             }
             %>
        <%=objEntusuarioJson.toString()%>
