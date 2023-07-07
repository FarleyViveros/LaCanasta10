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

    <title>Mesas - Dashboard</title>

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
                <nav class="navbar navbar-expand navbar-light topbar mb-0 static-top shadow">

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
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-light">Lista Mesas</h6>
    
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
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

                        <!-- Pie Chart -->
                        <div class="col-xl-4 col-lg-5">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-light">Registro 
                                       </h6>
        <button class="btn btn-primary btn-sm" style="float:right" onclick="nuevo()"><i class="fa fa-file-alt"></i> NUEVO</button>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body" style="height: 359px;overflow: auto;">
                                    <div class="form-group">
                                        <label>ID</label>
                                        <input type="text" class="form-control form-control-user" readonly="readonly" id="txtid" placeholder="">
                                    </div>
                                    <div class="form-group">
                                        <label>NOMBRE</label>
                                       <input type="text" class="form-control form-control-user" id="txtnombre" placeholder="">
                                    </div>
                                    <div class="form-group">
                                        <label>ESTADO</label>
                                        <input type="checkbox" class="form-control" style="width: 46px;" id="chkestado">
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-danger col-md-12" onclick="guardar()"><i class="fa fa-save"></i> <span id="nombrebutton">GUARDAR</span></button>
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
       
         mesas();
         function mesas(){
             var url = "postlistamesas.jsp";
            $.ajax({
                url: url,
                type: "POST",
                data: {},
                contentType: "application/x-www-form-urlencoded",
                success: function (response) {
                    var texto = response.trim();
                    var lista = texto.substring(0, texto.length - 1);
                    var objmesas = jQuery.parseJSON("["+lista+"]");  
                    var tabla="";            
                    var total=objmesas.length;
                    var libre=`<span class="badge badge-success">Libre</span>`;
                    var ocupada=`<span class="badge badge-danger">Ocupda</span>`;
                    console.log(objmesas);
                   $.each(objmesas, function( index, value ) {
                       var span="";
                       if(value.estado==="1"){span=ocupada;}else{span=libre;};
                       tabla+=`<tr>
                       <td>`+(index+1)+`</td>
                       <td>`+value.nombre+`</td>
                       <td>`+span+`</td>
                        <td><button class="btn btn-danger btn-sm" onclick="detalle(`+value.id+`)"><i class="fa fa-edit"></i></button></td>
                       </tr>`;
                      });
                      $("#tbodyLista").html(tabla);

                },
                error: function (xmlHttpRequest, textStatus, errorThrow) {

                }
            });
             
         }
         
         
        function detalle(id){
            var url = "postdetallemesa.jsp";
             $.ajax({
                    url: url,
                    type: "POST",
                    data: {id:id},
                    contentType: "application/x-www-form-urlencoded",
                    success: function (response) {
                        var texto = response.trim();
                        var objmesas = jQuery.parseJSON(texto);  
                        console.log(objmesas);
                        $("#txtid").val(objmesas.id);
                        $("#txtnombre").val(objmesas.nombre);
                        if(objmesas.estado==="1"){
                            $("#chkestado").prop( "checked", true );
                        }
                        else{
                            $("#chkestado").prop( "checked", false );
                        };
                        $("#nombrebutton").text("EDITAR");
                    },
                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                    }
                }); 
         };
         
         function nuevo(){
             $("#txtid").val("");
             $("#txtnombre").val("");
             $("#chkestado").prop( "checked", false );
             $("#nombrebutton").text("GUARDAR");
         }
         
          function guardar(){
             var id = $("#txtid").val();
             if(id===""){
                 id=0;
             }
             var nombre = $("#txtnombre").val();
              if(nombre===""){
                  $.toast({
                                 heading: 'Mensaje Servidor',
                                 text: "Ingrese Nombre",
                                 position: 'top-right',
                                 icon: 'error'
                             });   
            return false;
              }
             var estado= 0;
             if($("#chkestado").is(':checked') ){
                    estado=1;
                }
            var url = "postguardarmesa.jsp";
             $.ajax({
                    url: url,
                    type: "POST",
                    data: {id:id,nombre:nombre,estado:estado},
                    contentType: "application/x-www-form-urlencoded",
                    success: function (response) {
                        var texto = response.trim();
                        var objresponse = jQuery.parseJSON(texto);  
                        console.log(objresponse);
                      if(!objresponse.response){
                            $.toast({
                                 heading: 'Mensaje Servidor',
                                 text: "No se pudo registrar",
                                 position: 'top-right',
                                 icon: 'error'
                             });             
                        }
                        else{
                             $.toast({
                                 heading: 'Mensaje Servidor',
                                 text: "Se registro Correctamente",
                                 position: 'top-right',
                                 icon: 'success',
                                 afterShown: function () {
                                     nuevo();
                                     mesas();
                                 }
                             });
                        }
                        
                        
                    },
                    error: function (xmlHttpRequest, textStatus, errorThrow) {

                    }
                }); 
         };
    </script>
</body>

</html>