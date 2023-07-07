<%-- 
    Document   : postbuscarsolicitudypedidos
    Created on : 26-nov-2022, 8:34:15
    Author     : USUARIO
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>

 <%   NegSolicitud objNegSolicitud = new NegSolicitud();
    ResultSet rsSolicitud;
    rsSolicitud = objNegSolicitud.listarSolicitudRegistradas();  
    int solCount=0;
    while (rsSolicitud.next())
    {
        solCount=solCount+1;
    }
    
    NegPedido objNegPedido = new NegPedido();
    ResultSet rspedido;
    int pedCount=0;
    rspedido = objNegPedido.Pedidoactivos();  
    while (rspedido.next())
    {
        pedCount=pedCount+1;
    }
 %>
          {"solicitud":"<%=solCount%>",
          "pedido":"<%=pedCount%>"}        
