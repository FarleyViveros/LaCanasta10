<%-- 
    Document   : index
    Created on : 21-nov-2022, 4:10:50
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

    <title>La Canasta - Login</title>

    <!-- Custom fonts for this template-->
    <link href="plantilla/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
 <link href="plantilla/vendor/toast/jquery.toast.min.css" rel="stylesheet" type="text/css">
    <!-- Custom styles for this template-->
    <link href="plantilla/css/sb-admin-2.css" rel="stylesheet">

</head>

<body>

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-2">Bienvenido!</h1>
                                        <p>La Canasta</p>
                                    </div>
                                    <form class="user">
                                        <div class="form-group">
                                            <input type="text" class="form-control form-control-user"
                                                id="correo" 
                                                placeholder="Correo">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user"
                                                id="clave" placeholder="Contraseña">
                                        </div>
 
                                        <a href="#" onclick="login()" class="btn btn-danger btn-user btn-block">
                                            Ingresar
                                        </a>
                                    </form>
                                    <hr>
                                 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="plantilla/vendor/jquery/jquery.min.js"></script>
    <script src="plantilla/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="plantilla/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="plantilla/vendor/toast/jquery.toast.min.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="plantilla/js/sb-admin-2.min.js"></script>
    <script>
        
 function login() {
   
    var url = "postlogin.jsp";
    $.ajax({
        url: url,
        type: "POST",
        data: {correo:$("#correo").val(),clave:$("#clave").val()},
        contentType: "application/x-www-form-urlencoded",
        beforeSend: function () {
           
        },
        complete: function () {
            
        },
        success: function (response) {
           var obj = jQuery.parseJSON(response);
           if(obj.id==="0"){
               $.toast({
                    heading: 'Mensaje Servidor',
                    text: "No se encontro registro que coincida",
                    position: 'top-right',
                    icon: 'error'
                });             
           }
           else{
               localStorage.setItem('token_id', JSON.stringify(obj));
                $.toast({
                    heading: 'Bienvenido',
                    text: obj.nombre,
                    position: 'top-right',
                    icon: 'success',
                    afterShown: function () {
                        if(obj.tipo==="0"){
                             var url = 'dashboard.jsp';
                             window.location.href = url;
                        }
                        else{
                            var url = 'pedidos.jsp';
                             window.location.href = url;
                        }
                       
                        
                    }
                });
           }
           
        },
        error: function (xmlHttpRequest, textStatus, errorThrow) {

        }
    });
}

    </script>
</body>

</html>