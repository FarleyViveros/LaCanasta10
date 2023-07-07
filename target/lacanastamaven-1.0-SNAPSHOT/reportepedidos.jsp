<%-- 
    Document   : reportepedidos
    Created on : 26-nov-2022, 17:42:03
    Author     : USUARIO
--%>

<%-- 
    Document   : dashboard
    Created on : 21-nov-2022, 4:14:49
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Reporte Pedidos - Dashboard</title>

        <!-- Custom fonts for this template-->
        <link href="plantilla/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">
        <link href="plantilla/vendor/toast/jquery.toast.min.css" rel="stylesheet" type="text/css">
        <link href="plantilla/js/bootstrap-datepicker.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="plantilla/css/sb-admin-2.css" rel="stylesheet">

    </head>

    <body id="page-top" class="sidebar-toggled">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">

                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
                    <div class="sidebar-brand-icon">
                        <img src="plantilla/img/lacanasta.jpg" style="width:206px">
                    </div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item active admin">
                    <a class="nav-link" href="dashboard.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider admin">

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                       aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>Ventas</span>
                    </a>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="pedidos.jsp">Pedido</a>
                            <a class="collapse-item" href="reportepedidos.jsp">Reporte Pedidos</a>
                        </div>
                    </div>
                </li>

                <!-- Nav Item - Utilities Collapse Menu -->
                <li class="nav-item admin">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Mantenimiento</span>
                    </a>
                    <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                         data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">

                            <a class="collapse-item" href="carta.jsp">Carta</a>
                            <a class="collapse-item" href="mesas.jsp">Mesas</a>
                            <a class="collapse-item" href="empleados.jsp">Empleados</a>
                            <a class="collapse-item" href="proveedores.jsp">Proveedores</a>
                            <a class="collapse-item" href="insumos.jsp">Insumos</a>
                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">


                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                       aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Solicitud Insumos</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="solicitudRegistro.jsp">Registrar</a>
                            <a class="collapse-item admin" href="solicitudLista.jsp">Aprobar</a>

                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">

                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>



            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light topbar mb-0 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>

                        <ul class="navbar-nav ml-auto">


                            <li class="nav-item dropdown no-arrow mx-1">
                                <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fas fa-bell fa-fw"></i>
                                    <!-- Counter - Alerts -->
                                    <span class="badge badge-danger badge-counter spnpedido">0</span>
                                </a>
                                <!-- Dropdown - Alerts -->
                                <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in listapedidosActivos"
                                     aria-labelledby="alertsDropdown">

                                </div>
                            </li>

                            <!-- Nav Item - Messages -->
                            <li class="nav-item dropdown no-arrow mx-1 admin">
                                <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fas fa-envelope fa-fw"></i>
                                    <!-- Counter - Messages -->
                                    <span class="badge badge-danger badge-counter spnsolicitud">0</span>
                                </a>
                                <!-- Dropdown - Messages -->
                                <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in listasolicitudesReg"
                                     aria-labelledby="messagesDropdown">

                                </div>
                            </li>

                            <div class="topbar-divider d-none d-sm-block"></div>

                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small usuarionombre">Douglas McGee</span>
                                    <img class="img-profile rounded-circle"
                                         src="plantilla/img/undraw_profile.svg">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                     aria-labelledby="userDropdown">

                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Salir
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <div class="row">

                            <!-- Area Chart -->
                            <div class="col-xl-12 col-lg-12">
                                <div class="card shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-light">Lista Pedidos</h6>

                                    </div>
                                    <!-- Card Body -->
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-lg-4 col-md-4">
                                                <div class="form-group  mb-1">
                                                    <div class="input-group">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text">Del</span>
                                                        </div>
                                                        <input type="text" id="fecha_ini" class="form-control date">
                                                        <div class="input-group-append">
                                                            <span class="input-group-text"><i class="fa fa-calendar"></i></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-4">
                                                <div class="form-group  mb-1">
                                                    <div class="input-group">
                                                        <div class="input-group-prepend">
                                                            <span class="input-group-text">Al</span>
                                                        </div>
                                                        <input type="text" id="fecha_fin" class="form-control date">
                                                        <div class="input-group-append">
                                                            <span class="input-group-text"><i class="fa fa-calendar"></i></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-4">
                                                <div class="form-group mb-1">
                                                    <button class="btn btn-success col-md-12" id="btnbuscar"><i class="fa fa-search"></i> Buscar</button>
                                                </div>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="table-responsive">
                                            <table class="table table-bordered table-hover table-condensed">
                                                <thead>
                                                    <tr>
                                                        <th>ID</th>
                                                        <th>FECHA</th>
                                                        <th>CANT</th>
                                                        <th>TOTAL.</th>
                                                        <th>CLIENTE</th>
                                                        <th>ATENDIO</th>
                                                        <th>MESA</th>
                                                        <th>ESTADO</th>
                                                        <th><i class="fa fa-edit"></i></th>
                                                    </tr>
                                                </thead>
                                                <tbody id="tbodyLista">

                                                </tbody>
                                            </table>
                                        </div>

                                    </div>
                                </div>
                            </div>

                        </div>



                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Derechos Reservados &copy; 2022</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>


        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Listo para salir?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Esta seguro que quiere ,cerrar sesion?.</div>
                    <div class="modal-footer">
                        <a class="btn btn-primary" href="#" onclick="salir()">Cerrar Sesion</a>
                    </div>
                </div>
            </div>
        </div>


        <div class="modal fade" id="pedidoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Detalle Pedido</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-12">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th style="width:137px">FECHA : </th>
                                        <th id="fecha_td">10-11-2022</th>
                                    </tr> 
                                    <tr>
                                        <th>MESA : <input type="hidden" id="txtmesa_id"></th>
                                        <th><input id="txtmesa" readonly="readonly" type="text" class="form-control input-sm"></th>
                                    </tr> 
                                    <tr>
                                        <th>CLIENTE : </th>
                                        <th><input id="txtcliente" readonly="readonly"  type="text" class="form-control input-sm"></th>
                                    </tr> 
                                    <tr>
                                        <th>EMPLEADO : </th>
                                        <th><input id="empleadoselect" readonly="readonly"  type="text" class="form-control input-sm">
                                        </th>
                                    </tr> 
                                </thead>

                            </table>

                            <table class="table detalle table-bordered table-hover table-condensed">
                                <thead>
                                    <tr>
                                        <th style="width:15px">CANT.</th>
                                        <th>PRODUCTO</th>
                                        <th style="width:90px">PRECIO/U</th>
                                        <th style="width:90px">TOTAL</th>

                                    </tr>
                                </thead>
                                <tbody id="tbodyListaPedido">

                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th colspan="3" class="text-right">TOTAL</th>
                                        <th class="text-right" id="tdtotal_final">0</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>

                    </div>

                </div>
            </div>
        </div>
        <div class="modal fade" id="boletaModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">BOLETA</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body" id="DivIdToPrint">
                        <table style="border:0 ;width: 100%">
                            <tr><td colspan="3" style="text-align: center">LA CANASTA</td> </tr>
                            <tr><td colspan="3" style="text-align: center">Avenida litoral 123</td></tr>
                            <tr><td colspan="3" style="text-align: center">tel : 3454 34543</td></tr>
                            <tr><td colspan="3" style="text-align: center">BOLETA DE VENTA ELECTRONICA</td></tr>
                            <tr><td colspan="3" style="text-align: center">B029-<span id="nrobol">0000009889</span></td></tr>
                            <tr><td colspan="3" style="text-align: center">FECHA DE EMISION : <span class="spn_fechabol">24-12-2020 34:34:3</span></td></tr>
                            <tr><td colspan="3" style="text-align: center">=========================================</td></tr>

                            <tr>
                                <td>Cant.</td>
                                <td>Descripcion</td>
                                <td style="text-align: right;padding-right: 3px">Pre/U</td>
                                <td style="text-align: right">Total</td>
                            </tr>
                            <tbody id="listadescripcion">

                            </tbody>
                            <tr> <td colspan="3" style="text-align: center">=========================================</td></tr>
                            <tr>
                                <td colspan="2" style="text-align: right">Total</td>
                                <td  style="text-align: right" id="total_bol"></td>
                            </tr>
                            <tr> <td colspan="3" style="text-align: center">=========================================</td></tr>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-primary" href="#" onclick="printDiv()">IMPRIMIR</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="plantilla/vendor/jquery/jquery.min.js"></script>
        <script src="plantilla/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="plantilla/js/moment.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="plantilla/vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="plantilla/vendor/toast/jquery.toast.min.js"></script>
        <script src="plantilla/js/bootstrap-datepicker.js"></script>
        <!-- Custom scripts for all pages-->
        <script src="plantilla/js/sb-admin-2.js"></script>
        <script src="plantilla/js/seguridad.js"></script>
        <!-- Page level plugins -->
        <script src="plantilla/vendor/chart.js/Chart.min.js"></script>

        <script>

                            $('#fecha_ini').val(moment().format("DD/MM/YYYY"));
                            $('#fecha_fin').val(moment().format("DD/MM/YYYY"));
                            $.fn.datepicker.defaults.format = "dd/mm/yyyy";
                            $('.date').datepicker({
                                autoclose: true,
                                default: true
                            });

                            $(document).on("click", "#btnbuscar", function () {
                                pedidos();
                            });

                            pedidos();
                            function pedidos() {
                                var fechaini = moment($("#fecha_ini").val(), "DD-MM-YYYY").format("YYYY-MM-DD");
                                var fechafin = moment($("#fecha_fin").val(), "DD-MM-YYYY").format("YYYY-MM-DD");
                                var url = "postlistarpedidosfechas.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {fechaini, fechafin},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objpedido = jQuery.parseJSON("[" + lista + "]");
                                        var tabla = "";
                                        var total = objpedido.length;
                                        var venta = `<span class="badge badge-success">Venta</span>`;
                                        var registrado = `<span class="badge badge-warning">Registrado</span>`;
                                        var anulado = `<span class="badge badge-danger">Anulado</span>`;
                                        var tieneboleta = 0;
                                        console.log(objpedido);
                                        $.each(objpedido, function (index, value) {
                                            var span = "";

                                            var fecha;
                                            fecha = moment(value.fecha).format("DD-MM-YYYY hh:mm:ss a");
                                            if (value.estado === "1") {
                                                span = registrado;
                                                tieneboleta = 0;
                                            } else if (value.estado === "2") {
                                                span = venta;
                                                tieneboleta = 1;
                                            } else {
                                                span = anulado;
                                                tieneboleta = 0;
                                            }
                                            ;
                                            tabla += `<tr>
                           <td>` + value.id + `</td>
                           <td>` + fecha + `</td>
                            <td>` + value.cantidad + `</td>
                            <td class="text-right">` + value.total + `</td>
                            <td>` + value.cliente + `</td>
                            <td>` + value.apellidosatiende + ` ` + value.nombreatiende + `</td>
                            <td>` + value.nombremesa + `</td>
                           <td>` + span + `</td>
                            <td><button class="btn btn-warning btn-sm" title="Detalle" onclick="detalle(` + value.id + `)"><i class="fa fa-edit"></i></button>
                               <button class="btn btn-primary btn-sm" title="Boleta" onclick="boleta(` + tieneboleta + `,` + value.id + `)"><i class="fa fa-file"></i></button>
       
                            </td>
                           </tr>`;
                                        });
                                        $("#tbodyLista").html(tabla);

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });

                            }

                            function boleta(tiene, id) {
                                if (tiene > 0) {
                                    pedidodetalleBoleta(id);
                                    pedidodetalleMesaBoleta(id)
                                    $("#boletaModal").modal("show");
                                } else {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "No se tiene boleta",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                }

                            }

                            function pedidodetalleBoleta(id) {
                                var url = "postdetallepedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: id},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objpedido = jQuery.parseJSON(texto);
                                        console.log(objpedido);
                                        $(".spn_fechabol").text(moment(objpedido.fechaboleta_String).format("DD-MM-YYYY hh:mm:ss a"));
                                        $("#nrobol").text(objpedido.nro);

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;
                            function pedidodetalleMesaBoleta(pedidoid) {
                                var url = "postlistapedidosdetallemesa.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: pedidoid},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objdetalle = jQuery.parseJSON("[" + lista + "]");
                                        var trstring = "";
                                        var totalfinal=0;
                                        console.log(objdetalle, "calista");
                                        $.each(objdetalle, function (index, value) {
           
                                            totalfinal += parseFloat(value.total);
                                            trstring += `<tr><td>` + value.cantidad + `</td><td> ` + value.cartanombre + `</td>
                                                <td style="text-align: right">` + value.precio + `</td>
                                                <td style="text-align: right">` + value.total + `</td></tr>`;
                                        });
                                        $("#listadescripcion").html(trstring);
                                        $("#total_bol").html(totalfinal.toFixed(2));



                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }

                            function detalle(id) {
                                pedidodetalle(id)
                                pedidodetalleMesa(id);
                                $("#pedidoModal").modal("show");
                            }

                            function pedidodetalle(id) {
                                var url = "postdetallepedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: id},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objpedido = jQuery.parseJSON(texto);
                                        console.log(objpedido);
                                        $("#fecha_td").text(moment(objpedido.fecha_String).format("DD-MM-YYYY hh:mm:ss a"));
                                        $("#txtpedido_id").val(objpedido.id);
                                        $("#txtcliente").val(objpedido.cliente);
                                        $("#txtmesa").val(objpedido.nombremesa);
                                        $("#empleadoselect").val(objpedido.empleado_id);


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;

                            function pedidodetalleMesa(pedidoid) {
                                var url = "postlistapedidosdetallemesa.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: pedidoid},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objdetalle = jQuery.parseJSON("[" + lista + "]");
                                        var fila = "";
                                        console.log(objdetalle, "calista");
                                        $.each(objdetalle, function (index, value) {
                                            fila += `<tr>
                             <td><input type="text" class="form-control input-sm calcula cant" name="cantidad" value="` + value.cantidad + `" readonly="readonly"></td>
                             <td><input type="hidden" class="form-control input-sm carta" name="carta_id" value="` + value.carta_id + `" readonly="readonly">
                            <input type="text" class="form-control input-sm insumonombre" name="carta_nombre" value="` + value.cartanombre + `" readonly="readonly"></td>
                             <td><input type="text" class="form-control input-sm text-right calcula precio" name="precio" value="` + value.precio + `" readonly="readonly"></td>
                             <td><input type="text" class="form-control input-sm text-right total" name="total" readonly="readonly"></td>
     
                          </tr>`;

                                        });
                                        $("#tbodyListaPedido").html(fila);
                                        calcular();


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;
                            function calcular() {
                                var tr = $("#tbodyListaPedido tr");
                                var totalfinal = 0;
                                $.each(tr, function (index, value) {
                                    var cant = $(this).find(".cant").val();
                                    var carta_id = $(this).find(".carta").val();
                                    var precio = $(this).find(".precio").val();
                                    var total = cant * precio;
                                    $(this).find(".total").val(total);
                                    totalfinal += total;
                                });
                                $("#tdtotal_final").text(totalfinal);
                            }


                            function printDiv()
                            {

                                var divToPrint = document.getElementById('DivIdToPrint');

                                var newWin = window.open('', 'Print-Window');

                                newWin.document.open();

                                newWin.document.write('<html><body onload="window.print()">' + divToPrint.innerHTML + '</body></html>');

                                newWin.document.close();

                                setTimeout(function () {
                                    newWin.close();
                                }, 10);

                            }
        </script>
    </body>

</html>