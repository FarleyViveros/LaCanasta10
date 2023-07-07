<%-- 
    Document   : postlistarpedidosfechas
    Created on : 26-nov-2022, 17:49:47
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegPedido objNegPedido = new NegPedido();
    String fechaini= request.getParameter("fechaini");
    String fechafin= request.getParameter("fechafin");
    ResultSet rs;
    rs = objNegPedido.listarPedidofechas(fechaini,fechafin);  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "fecha":"<%=rs.getString("fecha")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
          "total":"<%=rs.getString("total")%>",
           "cliente":"<%=rs.getString("cliente")%>",
           "usuario_id":"<%=rs.getString("usuario_id")%>",
          "registro":"<%=rs.getString("registro")%>",
           "empleado_id":"<%=rs.getString("empleado_id")%>",
          "nombreatiende":"<%=rs.getString("nombreatiende")%>",
          "apellidosatiende":"<%=rs.getString("apellidosatiende")%>",
          "mesa_id":"<%=rs.getString("mesa_id")%>",
          "nombremesa":"<%=rs.getString("nombremesa")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>