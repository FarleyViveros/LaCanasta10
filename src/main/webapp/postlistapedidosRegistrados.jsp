<%-- 
    Document   : postlistapedidosRegistrados
    Created on : 26-nov-2022, 9:54:45
    Author     : USUARIO
--%>


<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>
<%
    NegPedido objNegPedido = new NegPedido();
    ResultSet rs;
    rs = objNegPedido.Pedidoactivos();  

        while (rs.next())
             {
          %> {"id":"<%=rs.getInt("id")%>",
          "fecha":"<%=rs.getString("fecha")%>",
          "cantidad":"<%=rs.getString("cantidad")%>",
           "total":"<%=rs.getFloat("total")%>",
          "cliente":"<%=rs.getString("cliente")%>",
          "usuario_id":"<%=rs.getInt("usuario_id")%>",
          "empleado_id":"<%=rs.getInt("empleado_id")%>",
          "nombreatiende":"<%=rs.getString("nombreatiende")%>",
            "apellidosatiende":"<%=rs.getString("apellidosatiende")%>",
              "mesa_id":"<%=rs.getInt("mesa_id")%>",
                 "nombremesa":"<%=rs.getString("nombremesa")%>",
           "estado":"<%=rs.getString("estado")%>"},         
           <%        
             }
             %>