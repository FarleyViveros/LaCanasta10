<%-- 
    Document   : postguardarpedido
    Created on : 25/11/2022, 03:08:15 PM
    Author     : Usuario
--%>
<%@page import="org.json.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="conexion.*"%>
<%@page import="entidad.*"%>
<%@page import="negocio.*"%>

<%
    
    EntPedido objEntpedidoJson = new EntPedido();
    NegPedido objNegPedido = new NegPedido();
    NegMesas objNegMesas = new NegMesas();
    int pedido_id= Integer.parseInt(request.getParameter("pedido_id"));
    int cantidad= Integer.parseInt(request.getParameter("cantidad"));
    float total= Float.parseFloat(request.getParameter("total"));
    int usuario_id= Integer.parseInt(request.getParameter("usuario_id"));
    int empleado_id= Integer.parseInt(request.getParameter("empleado_id"));
    int mesa_id= Integer.parseInt(request.getParameter("mesa_id"));
    String cliente = request.getParameter("cliente");
    String d = request.getParameter("fecha");
    
    String detalleString= request.getParameter("detalle");
    JSONArray array = new JSONArray(detalleString);  
    objEntpedidoJson.setid(pedido_id);
    objEntpedidoJson.setcantidad(cantidad);
    objEntpedidoJson.settotal(total);
    objEntpedidoJson.setusuario_id(usuario_id);
    objEntpedidoJson.setempleado_id(empleado_id);
    objEntpedidoJson.setfecha_String(d);
    objEntpedidoJson.setmesa_id(mesa_id);
    objEntpedidoJson.setcliente(cliente);
    objEntpedidoJson.setestado(1);
    
    boolean rs;
    
    if(pedido_id==0){
        int id = objNegPedido.agregarPedido(objEntpedidoJson); 
        if(id>0){
            rs=true;
            for(int i=0; i < array.length(); i++)   
            {  JSONObject object = array.getJSONObject(i);  
                EntPedidoDetalle objEntpedidoDetalleJson = new EntPedidoDetalle();
                NegPedidoDetalle objNegPedidoDetalle = new NegPedidoDetalle();
                objEntpedidoDetalleJson.setpedido_id(id);
                objEntpedidoDetalleJson.setcarta_id(object.getInt("carta_id"));
                objEntpedidoDetalleJson.setprecio(object.getFloat("precio"));
                objEntpedidoDetalleJson.setcantidad(object.getInt("cantidad"));
                objEntpedidoDetalleJson.settotal(object.getFloat("total"));
                objEntpedidoDetalleJson.setestado(1);
                objNegPedidoDetalle.agregarPedidoDetalle(objEntpedidoDetalleJson);
            } 

            objNegMesas.editarMesaEstado(mesa_id,1);
        }
        else{
        rs=false;
        }
    }
    else{
        objNegPedido.editarPedido(objEntpedidoJson); 
        rs=true;
            for(int i=0; i < array.length(); i++)   
            {  JSONObject object = array.getJSONObject(i);  
                EntPedidoDetalle objEntpedidoDetalleJson = new EntPedidoDetalle();
                NegPedidoDetalle objNegPedidoDetalle = new NegPedidoDetalle();
                objEntpedidoDetalleJson.setid(object.getInt("pedidodetalle_id"));
                 objEntpedidoDetalleJson.setpedido_id(pedido_id);
                objEntpedidoDetalleJson.setcarta_id(object.getInt("carta_id"));
                objEntpedidoDetalleJson.setprecio(object.getFloat("precio"));
                objEntpedidoDetalleJson.setcantidad(object.getInt("cantidad"));
                objEntpedidoDetalleJson.settotal(object.getFloat("total"));
                objEntpedidoDetalleJson.setestado(1);
                if(object.getInt("pedidodetalle_id")>0){
                objNegPedidoDetalle.editarPedidoDetalle(objEntpedidoDetalleJson);
                }
                else{
                objNegPedidoDetalle.agregarPedidoDetalle(objEntpedidoDetalleJson);
                }
                
            } 
    }
   
     %>
    {"response":<%=rs%>}
