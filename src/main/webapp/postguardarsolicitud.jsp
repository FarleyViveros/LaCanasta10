<%-- 
    Document   : postguardarsolicitud
    Created on : 24/11/2022, 11:15:00 AM
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
    
    EntSolicitud objEntsolicitudJson = new EntSolicitud();
    NegSolicitud objNegSolicitud = new NegSolicitud();
    int proveedor_id= Integer.parseInt(request.getParameter("proveedor_id"));
    int usuario_id= Integer.parseInt(request.getParameter("usuario_id"));
    int cantidad= Integer.parseInt(request.getParameter("cantidad"));
    float total= Integer.parseInt(request.getParameter("total"));
    
    String d = request.getParameter("fecha");
    java.util.Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(d);
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    String detalleString= request.getParameter("detalle");
    JSONArray array = new JSONArray(detalleString);  
 
    objEntsolicitudJson.setproveedor_id(proveedor_id);
    objEntsolicitudJson.setusuarioRegistro_id(usuario_id);
    objEntsolicitudJson.setfecha_registro(sqlDate);
    objEntsolicitudJson.setfecha_registroString(d);
    objEntsolicitudJson.setcantidad(cantidad);
    objEntsolicitudJson.settotal(total);
    objEntsolicitudJson.setestado(1);
    boolean rs;
    int id = objNegSolicitud.agregarSolicitud(objEntsolicitudJson); 
    if(id>0){
        rs=true;
        for(int i=0; i < array.length(); i++)   
        {  JSONObject object = array.getJSONObject(i);  
            EntSolicitudDetalle objEntsolicitudDetalleJson = new EntSolicitudDetalle();
            NegSolicitudDetalle objNegSolicitudDetalle = new NegSolicitudDetalle();
            objEntsolicitudDetalleJson.setestado(1);
            objEntsolicitudDetalleJson.setsolicitud_id(id);
            objEntsolicitudDetalleJson.setinsumo_id(object.getInt("insumo_id"));
            objEntsolicitudDetalleJson.setprecio(object.getFloat("precio"));
            objEntsolicitudDetalleJson.setcantidad(object.getInt("cantidad"));
            objEntsolicitudDetalleJson.setunidad(object.getString("unidad"));
            objNegSolicitudDetalle.agregarSolicitudDetalle(objEntsolicitudDetalleJson);
        } 
    }
    else{
    rs=false;
    }
    
    
     %>
    {"response":<%=rs%>}
