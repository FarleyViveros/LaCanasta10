<%-- 
    Document   : postnroBoleta
    Created on : 26-nov-2022, 18:52:28
    Author     : USUARIO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    
   
    NegPedido objNegPedido = new NegPedido();
    int nro = 0;
    ResultSet rs;
    rs = objNegPedido.TBboletaCount(); 
 while (rs.next())
             {
                nro=  rs.getInt(1)+1;
                    
             }
             %>
    
    {"response":<%=nro%>}