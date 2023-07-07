<%-- 
    Document   : pedidos
    Created on : 25/11/2022, 12:31:21 PM
    Author     : Usuario
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

        <title>Pedidos - Dashboard</title>

        <!-- Custom fonts for this template-->
        <link href="plantilla/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">
        <link href="plantilla/vendor/toast/jquery.toast.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="plantilla/css/sb-admin-2.css" rel="stylesheet">

    </head>

    <body id="page-top" class="sidebar-toggled">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">

                <!-- Sidebar - Brand -->
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
                    <nav class="navbar navbar-expand navbar-light  topbar mb-0 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>

                        <ul class="navbar-nav ml-auto">

                            <!-- Nav Item - Alerts -->
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
                            <div class="col-xl-8 col-lg-7">
                                <div class="card shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3  align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-light">Registro Pedido</h6>
                                        <button class="btn btn-danger btn-sm btn_estado" style="float: right;position: relative;margin-top: -22px;" onclick="guardar()"><i class="fa fa-save"></i> Guardar</button>
                                        <button class="btn btn-primary btn-sm " style="float: right;position: relative;margin-top: -22px; margin-right: 7px;" onclick="anularModal()"><i class="fa fa-trash"></i> Anular</button>
                                        <button class="btn btn-warning btn-sm " style="float: right;position: relative;margin-top: -22px; margin-right: 7px;" onclick="openBoleta()"><i class="fa fa-print"></i> Boleta</button>
                                    </div>
                                    <!-- Card Body -->
                                    <input type="hidden" id="txtpedido_id" value="0">
                                    <div class="card-body">
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
                                                    <th><input id="txtcliente" type="text" class="form-control input-sm"></th>
                                                </tr> 
                                                <tr>
                                                    <th>EMPLEADO : </th>
                                                    <th><select id="empleadoselect" class="form-control input-sm"><option>--seleccione--</option></select></th>
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
                                                    <th style="width:80px"><button class="btn btn-sm btn-danger abrirModalCarta"><i class="fa fa-plus"></i></button></th>
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

                            <!-- Pie Chart -->
                            <div class="col-xl-4 col-lg-5">
                                <div class="card shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-light">Lista Mesas 
                                        </h6>
                                        <button class="btn btn-primary btn-sm" style="float:right" onclick="refrescarmesas()"><i class="fa fa-sync-alt"></i> </button>
                                    </div>
                                    <!-- Card Body -->
                                    <div class="card-body" style="height: 359px;overflow: auto;">
                                        <table class="table table-bordered table-hover table-condensed">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>NOMBRE</th>
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
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer ">
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


        <div class="modal fade" id="cartaModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Seleccione de la Carta</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label>CARTA</label>
                                <select class="form-control form-control-user" id="txtcarta_id">
                                    <option>--Seleccione--</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>PRECIO U.</label>
                                <input type="text" class="form-control form-control-user" id="txtprecio" placeholder="">
                            </div>

                            <div class="form-group">
                                <label>CANTIDAD</label>
                                <input type="text" class="form-control form-control-user" id="txtcantidad" placeholder="">
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-primary" href="#" onclick="agregar()"><i class="fa fa-plus"></i> Agregar</a>
                    </div>
                </div>
            </div>
        </div>


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

        <div class="modal fade" id="anularModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Mensaje de Servidor</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Esta seguro que quiere ,Anular Pedido?.</div>
                    <div class="modal-footer">
                        <a class="btn btn-danger" href="#" onclick="anularPedido()"><i class="fa fa-trash-alt"></i> Anular</a>
                    </div>
                </div>
            </div>
        </div>


        <!-- Logout Modal-->
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
        <!-- Custom scripts for all pages-->
        <script src="plantilla/js/sb-admin-2.js"></script>
        <script src="plantilla/js/seguridad.js"></script>
        <!-- Page level plugins -->
        <script src="plantilla/vendor/chart.js/Chart.min.js"></script>

        <script>

                            $("#fecha_td").text(moment().format("DD-MM-YYYY"));
                            mesas();
                            function mesas() {
                                var url = "postlistamesas.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objmesas = jQuery.parseJSON("[" + lista + "]");
                                        var tabla = "";
                                        var total = objmesas.length;
                                        var libre = `<span class="badge badge-success">Libre</span>`;
                                        var ocupada = `<span class="badge badge-danger">Ocupda</span>`;
                                        console.log(objmesas);
                                        $.each(objmesas, function (index, value) {
                                            var span = "";
                                            if (value.estado === "1") {
                                                span = ocupada;
                                            } else {
                                                span = libre;
                                            }
                                            ;
                                            tabla += `<tr>
                           <td>` + (index + 1) + `</td>
                           <td>` + value.nombre + `</td>
                           <td>` + span + `</td>
                            <td><button class="btn btn-danger btn-sm" onclick="detalle(` + value.id + `)"><i class="fa fa-edit"></i></button></td>
                           </tr>`;
                                        });
                                        $("#tbodyLista").html(tabla);

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });

                            }

                            function refrescarmesas() {
                                mesas();
                            }

                            function detalle(id) {
                                var url = "postdetallemesa.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: id},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objmesas = jQuery.parseJSON(texto);
                                        console.log(objmesas);
                                        $("#txtmesa_id").val(objmesas.id);
                                        $("#txtmesa").val(objmesas.nombre);
                                        pedidoMesa(id);
                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;


                            empleados();
                            function empleados() {
                                var url = "postlistaempleados.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objempleados = jQuery.parseJSON("[" + lista + "]");
                                        var option = "";
                                        var total = objempleados.length;
                                        console.log(objempleados);
                                        option += `<option value="">--Seleccione--</option>`;
                                        $.each(objempleados, function (index, value) {
                                            if (value.estado === "1") {
                                                option += `<option value="` + value.id + `">` + value.nombre + ` ` + value.apellidos + `</option>`;
                                            }
                                            ;
                                        });
                                        if (objempleados.length === 0) {
                                            option = `<option value="">--Sin registros--</option>`;
                                        }
                                        $("#empleadoselect").html(option);

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });

                            }

                            carta();
                            function carta() {
                                var url = "postlistacarta.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var lista = texto.substring(0, texto.length - 1);
                                        var objcarta = jQuery.parseJSON("[" + lista + "]");
                                        var option = "";
                                        var total = objcarta.length;
                                        console.log(objcarta);
                                        option += `<option value="">--Seleccione--</option>`;
                                        $.each(objcarta, function (index, value) {
                                            if (value.estado === "1") {
                                                option += `<option value="` + value.id + `">` + value.nombre + `</option>`;
                                            }

                                        });
                                        if (objcarta.length == 0) {
                                            option = `<option value="">--Sin registros--</option>`;
                                        }
                                        $("#txtcarta_id").html(option);

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });

                            }


                            $(document).on("click", ".abrirModalCarta", function () {
                                var mesa_id = $("#txtmesa_id").val();
                                if (mesa_id === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Seleccione Mesa",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }
                                $("#txtcarta_id").val("");
                                $("#txtprecio").val("");
                                $("#txtcantidad").val(0);
                                $("#txtunidad").val("");
                                $("#cartaModal").modal("show");

                            });

                            $(document).on("change", "#txtcarta_id", function () {
                                var id = $(this).val();

                                if ($(this).val() != "") {
                                    var url = "postdetallecarta.jsp";
                                    $.ajax({
                                        url: url,
                                        type: "POST",
                                        data: {id: id},
                                        contentType: "application/x-www-form-urlencoded",
                                        success: function (response) {
                                            var texto = response.trim();
                                            var objmesas = jQuery.parseJSON(texto);
                                            console.log(objmesas);
                                            $("#txtprecio").val(objmesas.precio);
                                            $("#txtcantidad").val(1);

                                        },
                                        error: function (xmlHttpRequest, textStatus, errorThrow) {

                                        }
                                    });
                                } else {
                                    $("#txtprecio").val("");
                                    $("#txtcantidad").val(0);
                                }

                            });

                            function agregar() {
                                var carta_id = $("#txtcarta_id").val();
                                var precio = $("#txtprecio").val();
                                var cantidad = $("#txtcantidad").val();

                                if (carta_id === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Seleccione Carta",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }
                                if (precio === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Ingrese Precio",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }
                                if (cantidad === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Ingrese Cantidad",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }

                                var fila = `<tr>
                             <td><input type="hidden" name="pedidodetalle_id" value="0"><input type="text" class="form-control input-sm calcula cant" name="cantidad" value="` + $("#txtcantidad").val() + `"></td>
                             <td><input type="hidden" class="form-control input-sm carta" name="carta_id" value="` + $("#txtcarta_id").val() + `" readonly="readonly">
                            <input type="text" class="form-control input-sm insumonombre" name="carta_nombre" value="` + $("#txtcarta_id option:selected").text() + `" readonly="readonly"></td>
                             <td><input type="text" class="form-control input-sm text-right calcula precio" name="precio" value="` + $("#txtprecio").val() + `"></td>
                             <td><input type="text" class="form-control input-sm text-right total" name="total" readonly="readonly"></td>
                            <td><button class="btn btn-sm btn-danger" onclick="eliminar(this,0)"><i class="fa fa-trash"></i></button> </td>
                          </tr>`;
                                $("#tbodyListaPedido").append(fila);
                                calcular();
                                $("#cartaModal").modal("hide");

                            }

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


                            function pedidoMesa(id) {
                                var url = "postlistapedidosmesa.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {id: id},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objpedido = jQuery.parseJSON(texto);
                                        console.log(objpedido);
                                        if (objpedido.id > 0) {
                                            $("#fecha_td").text(objpedido.fecha);
                                            $("#txtpedido_id").val(objpedido.id);
                                            $("#txtcliente").val(objpedido.cliente);
                                            $("#empleadoselect").val(objpedido.empleado_id);
                                            $("#tdtotal_final").text(objpedido.total);
                                            pedidodetalleMesa(objpedido.id);
                                        } else {
                                            $("#fecha_td").text(moment().format("DD-MM-YYYY"));
                                            $("#txtpedido_id").val(0);
                                            $("#txtcliente").val("");
                                            $("#empleadoselect").val("");
                                            $("#tdtotal_final").text("0");
                                            $("#tbodyListaPedido").html("");
                                        }

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;

                            $(document).on("keyup", ".calcula", function () {
                                calcular();
                            });

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
                             <td><input type="hidden" name="pedidodetalle_id" value="` + value.id + `"><input type="text" class="form-control input-sm calcula cant" name="cantidad" value="` + value.cantidad + `"></td>
                             <td><input type="hidden" class="form-control input-sm carta" name="carta_id" value="` + value.carta_id + `" readonly="readonly">
                            <input type="text" class="form-control input-sm insumonombre" name="carta_nombre" value="` + value.cartanombre + `" readonly="readonly"></td>
                             <td><input type="text" class="form-control input-sm text-right calcula precio" name="precio" value="` + value.precio + `"></td>
                             <td><input type="text" class="form-control input-sm text-right total" name="total" readonly="readonly"></td>
                            <td><button class="btn btn-sm btn-danger" onclick="eliminar(this,` + value.id + `)"><i class="fa fa-trash"></i></button> </td>
                          </tr>`;

                                        });
                                        if (objdetalle.length > 0) {
                                            $("#tbodyListaPedido").html(fila);
                                            calcular();
                                            $(".btn_estado").text("EDITAR");
                                        } else {
                                            $("#tbodyListaPedido").html("");
                                            $(".btn_estado").text("GUARDAR");
                                        }

                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;

                            function guardar() {

                                var detalle = [];
                                var totalfinal = 0;
                                var totalcantidad = 0;
                                var trs = $("#tbodyListaPedido tr");
                                if (trs.length === 0) {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "No ingreso Detalle de Pedido",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }

                                $.each(trs, function (index, value) {
                                    var cant = $(this).find(".cant").val();
                                    totalcantidad += parseInt(cant);
                                    var precio = $(this).find(".precio").val();
                                    var total = parseFloat(cant) * parseFloat(precio);
                                    totalfinal += parseFloat(total);
                                    detalle.push($(this).serializeFormJSON());
                                });
                                var obj = jQuery.parseJSON(token);
                                var fecha = moment().format("YYYY-MM-DD HH:mm:ss");

                                var cliente = $("#txtcliente").val();
                                var mesa_id = $("#txtmesa_id").val();
                                var empleado_id = $("#empleadoselect").val();
                                var usuario_id = obj.id;
                                var total = totalfinal;
                                var cantidad = totalcantidad;
                                var id = 0;
                                if ($("#txtpedido_id").val() !== "0") {
                                    id = $("#txtpedido_id").val();
                                }

                                if (mesa_id === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Seleccione Mesa",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }

                                var url = "postguardarpedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {pedido_id: id, fecha: fecha, cantidad, total, cliente, usuario_id, empleado_id, mesa_id, detalle: JSON.stringify(detalle)},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objresponse = jQuery.parseJSON(texto);
                                        console.log(objresponse);
                                        if (!objresponse.response) {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "No se pudo registrar",
                                                position: 'top-right',
                                                icon: 'error'
                                            });
                                        } else {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "Se registro Correctamente",
                                                position: 'top-right',
                                                icon: 'success',
                                                afterShown: function () {
                                                    var url = 'pedidos.jsp';
                                                    window.location.href = url;
                                                }
                                            });
                                        }


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }
                            ;

                            function eliminar(valor, id) {
                                var totalfinal = 0;
                                var totalcantidad = 0;
                                var trs = $("#tbodyListaPedido tr");

                                var indextr = $(valor).parent().parent("tr").index();
                                $.each(trs, function (index, value) {
                                    if (indextr !== index) {

                                        var cant = $(this).find(".cant").val();
                                        totalcantidad += parseInt(cant);
                                        var precio = $(this).find(".precio").val();
                                        var total = parseFloat(cant) * parseFloat(precio);
                                        totalfinal += parseFloat(total);
                                    }

                                });
                                var total = totalfinal;
                                var cantidad = totalcantidad;
                                if (id > 0) {
                                    var pedido_id = $("#txtpedido_id").val();
                                    var url = "posteliminardetallepedido.jsp";
                                    $.ajax({
                                        url: url,
                                        type: "POST",
                                        data: {pedidodetalle_id: id, pedido_id, total, cantidad},
                                        contentType: "application/x-www-form-urlencoded",
                                        success: function (response) {
                                            var texto = response.trim();
                                            var objresponse = jQuery.parseJSON(texto);
                                            console.log(objresponse);
                                            if (!objresponse.response) {
                                                $.toast({
                                                    heading: 'Mensaje Servidor',
                                                    text: "No se pudo Eliminar",
                                                    position: 'top-right',
                                                    icon: 'error'
                                                });
                                            } else {
                                                $(valor).parent().parent("tr").remove();
                                            };
                                            calcular();
                                        },
                                        error: function (xmlHttpRequest, textStatus, errorThrow) {

                                        }
                                    });
                                } 
                                else {
                                    $(valor).parent().parent("tr").remove();

                                }
                                calcular();
                            }
                            ;

                            function anularModal() {
                                if ($("#txtpedido_id").val() !== "0") {
                                    $("#anularModal").modal("show");
                                } else {
                                    var url = 'pedidos.jsp';
                                    window.location.href = url;
                                }
                            }
                            ;

                            function anularPedido() {
                                var mesa_id = $("#txtmesa_id").val();
                                var idpedido = $("#txtpedido_id").val();
                                var url = "postanularpedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {pedido_id: idpedido, mesa_id},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objresponse = jQuery.parseJSON(texto);
                                        console.log(objresponse);
                                        if (!objresponse.response) {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "No se pudo Anular",
                                                position: 'top-right',
                                                icon: 'error'
                                            });
                                        } else {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "Se Anulo Correctamente",
                                                position: 'top-right',
                                                icon: 'success',
                                                afterShown: function () {
                                                    var url = 'pedidos.jsp';
                                                    window.location.href = url;
                                                }
                                            });
                                        }


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }

                            function openBoleta() {

                                var trs = $("#tbodyListaPedido tr");
                                if (trs.length === 0) {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "No ingreso Detalle de Pedido",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }

                                var detalle = [];
                                var totalfinal = 0;
                                var totalcantidad = 0;

                                $.each(trs, function (index, value) {
                                    var cant = $(this).find(".cant").val();
                                    totalcantidad += parseInt(cant);
                                    var precio = $(this).find(".precio").val();
                                    var total = parseFloat(cant) * parseFloat(precio);
                                    totalfinal += parseFloat(total);
                                    detalle.push($(this).serializeFormJSON());
                                });
                                var obj = jQuery.parseJSON(token);
                                var fecha = moment().format("YYYY-MM-DD HH:mm:ss");

                                var cliente = $("#txtcliente").val();
                                var mesa_id = $("#txtmesa_id").val();
                                var empleado_id = $("#empleadoselect").val();
                                var usuario_id = obj.id;
                                var total = totalfinal;
                                var cantidad = totalcantidad;
                                var id = 0;
                                if ($("#txtpedido_id").val() !== "0") {
                                    id = $("#txtpedido_id").val();
                                }

                                if (mesa_id === "") {
                                    $.toast({
                                        heading: 'Mensaje Servidor',
                                        text: "Seleccione Mesa",
                                        position: 'top-right',
                                        icon: 'error'
                                    });
                                    return false;
                                }

                                var url = "postguardarpedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {pedido_id: id, fecha: fecha, cantidad, total, cliente, usuario_id, empleado_id, mesa_id, detalle: JSON.stringify(detalle)},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objresponse = jQuery.parseJSON(texto);
                                        console.log(objresponse);
                                        if (!objresponse.response) {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "No se pudo registrar",
                                                position: 'top-right',
                                                icon: 'error'
                                            });
                                        } else {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "Se registro Correctamente",
                                                position: 'top-right',
                                                icon: 'success',
                                                afterShown: function () {
                                                    var trstring = "";
                                                    var totalfinal = 0;
                                                    var totalcantidad = 0;
                                                    $.each(trs, function (index, value) {
                                                        var insumo = $(this).find(".insumonombre").val();
                                                        var cant = $(this).find(".cant").val();
                                                        totalcantidad += parseInt(cant);
                                                        var precio = $(this).find(".precio").val();
                                                        var total = parseFloat(cant) * parseFloat(precio);
                                                        totalfinal += parseFloat(total);
                                                        trstring += `<tr><td>` + cant + `</td><td> ` + insumo + `</td>
                                                <td style="text-align: right">` + precio + `</td>
                                                <td style="text-align: right">` + total.toFixed(2) + `</td></tr>`;
                                                    });
                                                    $("#listadescripcion").html(trstring);
                                                    $("#total_bol").html(totalfinal.toFixed(2));
                                                    var url = "postnroBoleta.jsp";
                                                    $.ajax({
                                                        url: url,
                                                        type: "POST",
                                                        data: {},
                                                        contentType: "application/x-www-form-urlencoded",
                                                        success: function (response) {
                                                            var texto = response.trim();
                                                            var objresponse = jQuery.parseJSON(texto);
                                                            console.log(objresponse.response);
                                                            $("#nrobol").text(pad(objresponse.response, 9));
                                                            generarboleta(pad(objresponse.response, 9));
                                                            $(".spn_fechabol").text(moment().format("DD-MM-YYYY hh:mm:ss a"));
                                                            $("#boletaModal").modal("show");
                                                        },
                                                        error: function (xmlHttpRequest, textStatus, errorThrow) {

                                                        }
                                                    });
                                                }
                                            });
                                        }


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });



                            }

                            function generarboleta(nro) {
                                var mesa_id = $("#txtmesa_id").val();
                                var idpedido = $("#txtpedido_id").val();
                                var nroboleta = nro;
                                var fecha=moment().format("YYYY-MM-DD HH:mm:ss");
                                var url = "postventaPedido.jsp";
                                $.ajax({
                                    url: url,
                                    type: "POST",
                                    data: {pedido_id: idpedido, mesa_id, nroboleta,fecha},
                                    contentType: "application/x-www-form-urlencoded",
                                    success: function (response) {
                                        var texto = response.trim();
                                        var objresponse = jQuery.parseJSON(texto);
                                        console.log(objresponse);
                                        if (!objresponse.response) {
                                            $.toast({
                                                heading: 'Mensaje Servidor',
                                                text: "No se pudo Generar la boleta",
                                                position: 'top-right',
                                                icon: 'error'
                                            });
                                        } else {
                                            $("#fecha_td").text(moment().format("DD-MM-YYYY"));
                                            $("#txtpedido_id").val(0);
                                            $("#txtmesa_id").val("");
                                            $("#txtcliente").val("");
                                            $("#empleadoselect").val("");
                                            $("#tbodyListaPedido").html("");
                                            $("#tdtotal_final").html("");
                                            refrescarmesas();
                                        }


                                    },
                                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                                    }
                                });
                            }



                            function pad(str, max) {
                                str = str.toString();
                                return str.length < max ? pad("0" + str, max) : str;
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